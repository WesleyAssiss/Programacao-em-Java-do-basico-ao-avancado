
package baskara;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.stream.Collectors;

public class ResolvedorBaskara {
	
	List<CalculoIntermediarioBaskara> calculos = new ArrayList<>();

	public ResultadoBaskara resolve(double a, double b, double c) {
		double bAoQuadrado = calcula("b²", () -> Math.pow(b, 2));
		
		double quatroAC = calcula("4ac", () -> 4 * a * c);
		
		double delta = calcula("Δ = b² - 4ac", () -> bAoQuadrado - quatroAC);
		
		if(delta < 0) {
			throw new BaskaraException("Não existe raiz real para Δ negativo: " + delta);
		}
		
		double raizDeDelta = calcula("√Δ", () -> Math.sqrt(delta));
		
		double menosB = calcula("-b", () -> -b);

		double menosBMaisRaizDeDelta = calcula("-b + √Δ", () -> menosB + raizDeDelta);

		double menosBMenosRaizDeDelta = calcula("-b - √Δ", () -> menosB - raizDeDelta);

		double doisA = calcula("2a", () -> 2 * a);
		
		double x1 = calcula("x' = (-b + √Δ) / 2a", () -> menosBMaisRaizDeDelta / doisA);
		
		double x2 = calcula("x'' = (-b - √Δ) / 2a", () -> menosBMenosRaizDeDelta / doisA);
		
		return new ResultadoBaskara(x1, x2, calculos);
	}

	private double calcula(String descricao, DoubleSupplier calculo) {
		double valor = calculo.getAsDouble();
		calculos.add(new CalculoIntermediarioBaskara(descricao, valor));
		return valor;
	}

	public static class CalculoIntermediarioBaskara {
		private final String descricao;
		private final double valor;

		public CalculoIntermediarioBaskara(String descricao, double valor) {
			this.descricao = descricao;
			this.valor = valor;
		}

		public String getDescricao() {
			return descricao;
		}

		public double getValor() {
			return valor;
		}

		@Override
		public String toString() {
			return descricao + " = " + valor;
		}

	}

	public static  class ResultadoBaskara {
		private final double x1;
		private final double x2;
		private List<CalculoIntermediarioBaskara> calculos;

		public ResultadoBaskara(double x1, double x2, List<CalculoIntermediarioBaskara> calculos) {
			this.x1 = x1;
			this.x2 = x2;
			this.calculos = calculos;
		}

		public double getX1() {
			return x1;
		}

		public double getX2() {
			return x2;
		}

		@Override
		public String toString() {
			String texto = "Resultado: x' = " + x1 + ", x'' = " + x2 + "\n"; 
			texto += "Cálculos efetuados: \n"; 
			texto += String.join("\n", calculos.stream().map(CalculoIntermediarioBaskara::toString).collect(Collectors.toList()));
			return texto;
		}
	}

	
	public static class BaskaraException extends RuntimeException {
		private static final long serialVersionUID = 1L;

		public BaskaraException(String mensagem) {
			super(mensagem);
		}
	}
}
