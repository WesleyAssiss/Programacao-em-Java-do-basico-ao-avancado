/*
2. Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. A primeira vez, 
deve usar a estrutura de repetição for, a segunda while e a terceira do while
*/
package secao04.Exercicios;

public class Exercicio02 {
	
	public static void main(String[] args) {
		
		// Utilizando a estrutura de repetição 'for'
		System.out.println("--- Contagem de 1 a 100 usando 'for' ---");
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
		}
		
		
		// Utilizando a estrutura de repetição 'while'
		System.out.println("\n--- Contagem de 1 a 100 usando 'while' ---");
		
		int j = 1; // Inicialização da variável de controle
		
		while (j <= 100) { // Condição de continuação
			System.out.println(j);
			j++; // Incremento
		}
		
		
		// Utilizando a estrutura de repetição 'do-while'
		System.out.println("\n--- Contagem de 1 a 100 usando 'do-while' ---");
		
		int k = 1; // Inicialização da variável de controle
		
		do {
			System.out.println(k);
			k++; // Incremento
		} while (k <= 100); // Condição de continuação
	}
}