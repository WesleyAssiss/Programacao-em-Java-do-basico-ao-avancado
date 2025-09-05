package secao04;

public class Foreach {
	public static void main(String[] args) {
		String nome = "Geek University";

		// Exemplo 1: Uma letra por linha
		System.out.println("--- Exemplo 1: Letra por Linha ---");
		for (char letra : nome.toCharArray()) {
			System.out.println(letra);
		}

		// Adiciona uma linha vazia para separar os exemplos
		System.out.println(); 

		// Exemplo 2: Tudo na mesma linha
		System.out.println("--- Exemplo 2: Tudo em uma Linha ---");
		for (char letra : nome.toCharArray()) {
			System.out.print(letra);
		}

		// Adiciona uma quebra de linha após o loop para a próxima impressão
		System.out.println(); 
		System.out.println(); 

		// Exemplo 3: Com espaços entre as letras
		System.out.println("--- Exemplo 3: Letras com Espaços ---");
		for (char letra : nome.toCharArray()) {
			System.out.print(letra + " ");
		}
	}
}