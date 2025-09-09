/*
Exercício 3: Busca de Valor em uma Matriz

Este programa cria uma matriz 5x5, lê um valor do usuário e busca esse valor
na matriz, informando sua localização ou uma mensagem de "não encontrado".
*/
package secao06.Exercicio;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		// 1. Criação da Matriz e Variáveis
		
		int[][] matriz = new int[2][2];
		int valor_X;
		
		// Variáveis para armazenar a localização e o status da busca
		int linha_encontrada = -1;
		int coluna_encontrada = -1;
		boolean encontrado = false;
		
		try (Scanner teclado = new Scanner(System.in)) {
			
			// 2. Preenchendo a Matriz com a Entrada do Usuário
			
			System.out.println("--- Preencha a Matriz 5x5 ---");
			for (int linha = 0; linha < matriz.length; linha++) {
				for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
					System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
					matriz[linha][coluna] = teclado.nextInt();
				}
			}
			
			// 3. Lendo o Valor de Busca (X)
			
			System.out.print("\nDigite o valor que deseja buscar na matriz (X): ");
			valor_X = teclado.nextInt();
			
			// 4. Buscando o Valor na Matriz
			
			// Percorre a matriz para encontrar o valor X
			for (int linha = 0; linha < matriz.length; linha++) {
				for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
					if (matriz[linha][coluna] == valor_X) {
						// Se o valor for encontrado, armazena a localização e altera o status
						linha_encontrada = linha;
						coluna_encontrada = coluna;
						encontrado = true;
					}
				}
			}
		} // O Scanner é fechado automaticamente aqui
		
		// 5. Exibindo o Resultado
		
		System.out.println("\n--- Resultado da Busca ---");
		if (encontrado) {
			System.out.println("O valor " + valor_X + " foi encontrado na posição [" + linha_encontrada + "][" + coluna_encontrada + "].");
		} else {
			System.out.println("Valor não encontrado na matriz.");
		}
	}
}