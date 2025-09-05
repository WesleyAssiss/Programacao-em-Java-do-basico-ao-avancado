package secao03;

public class if_else {

	public static void main(String[] args) {
		//Declarando e inicializando a variável
		int numero = 6;

		if(numero > 5) {
			System.out.println("Sim, o número: " + numero + ", é maior que 5");
		}else if(numero == 5) {
			System.out.println("Sim, o número: " + numero + ", é igual a 5");
		}else {
			System.out.println("Não, o número: " + numero + ", não é maior que 5");
		}
	}

}
