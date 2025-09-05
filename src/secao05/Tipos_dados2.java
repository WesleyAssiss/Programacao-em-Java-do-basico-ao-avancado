/*
Tipos de Dados em Java: Numéricos Reais (Ponto Flutuante)

Este programa demonstra a diferença e as características dos tipos de
dados numéricos reais (primitivos e wrappers), incluindo seus tamanhos e limites de valor.
*/
package secao05;

public class Tipos_dados2 {
	public static void main(String[] args) {
		
		// Tipos Primitivos: armazenam o valor diretamente na memória.
		// Mais rápidos e eficientes.
		// Nota: Por padrão, o Java trata números reais como 'double'.
		// O sufixo 'f' ou 'F' é necessário para declarar um 'float'.
		float preco1 = 23.4f;  // Ponto flutuante de 32 bits (precisão simples).
		double preco2 = 23.4;  // Ponto flutuante de 64 bits (precisão dupla).
		
		
		// Tipos Wrapper: são classes que "empacotam" os tipos primitivos.
		// Oferecem métodos úteis e podem ser nulos.
		Float preco3 = 44.5f;
		Double preco4 = 44.5;
		
		
		// --- Impressão dos Valores ---
		
		System.out.println("--- Tipos Primitivos ---");
		System.out.println("float: " + preco1);
		System.out.println("double: " + preco2);
		
		System.out.println("\n--- Tipos Wrapper ---");
		System.out.println("Float: " + preco3);
		System.out.println("Double: " + preco4);
		
		
		// --- Análise de Capacidade ---
		
		System.out.println("\n--- Análise de Tamanho e Limites ---");
		System.out.println("float/Float: " + Float.SIZE + " bits (" + (Float.SIZE / 8) + " bytes)");
		System.out.println("Valor Mínimo: " + Float.MIN_VALUE + " | Valor Máximo: " + Float.MAX_VALUE);
		
		System.out.println("\ndouble/Double: " + Double.SIZE + " bits (" + (Double.SIZE / 8) + " bytes)");
		System.out.println("Valor Mínimo: " + Double.MIN_VALUE + " | Valor Máximo: " + Double.MAX_VALUE);
	}
}