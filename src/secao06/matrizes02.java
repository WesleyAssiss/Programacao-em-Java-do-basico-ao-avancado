/*
Matrizes com Números Pares e Ímpares

Este programa demonstra como preencher matrizes com números pares e ímpares
de forma dinâmica, utilizando laços de repetição.
*/
package secao06;

public class matrizes02 {

	public static void main(String[] args) {
		
		// --- 1. Matriz de Números Ímpares ---
		
		// Cria uma matriz 3x3
		int[][] matrizImpares = new int[3][3];
		int numeroImpar = 1; // Começa a contagem com o primeiro número ímpar
		
		System.out.println("--- Matriz de Números Ímpares ---");
		
		// Laços aninhados para preencher a matriz com números ímpares
		for (int linha = 0; linha < matrizImpares.length; linha++) {
			for (int coluna = 0; coluna < matrizImpares[linha].length; coluna++) {
				matrizImpares[linha][coluna] = numeroImpar;
				System.out.print(matrizImpares[linha][coluna] + " ");
				numeroImpar += 2; // Pula de 2 em 2 para o próximo ímpar
			}
			System.out.println();
		}
		
		
		// --- 2. Matriz de Números Pares ---
		
		// Cria uma matriz 3x3
		int[][] matrizPares = new int[3][3];
		int numeroPar = 0; // Começa a contagem com o primeiro número par
		
		System.out.println("\n--- Matriz de Números Pares ---");
		
		// Laços aninhados para preencher a matriz com números pares
		for (int linha = 0; linha < matrizPares.length; linha++) {
			for (int coluna = 0; coluna < matrizPares[linha].length; coluna++) {
				matrizPares[linha][coluna] = numeroPar;
				System.out.print(matrizPares[linha][coluna] + " ");
				numeroPar += 2; // Pula de 2 em 2 para o próximo par
			}
			System.out.println();
		}
	}
}