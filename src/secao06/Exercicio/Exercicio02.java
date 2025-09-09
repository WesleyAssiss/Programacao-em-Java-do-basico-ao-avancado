/*
Exercício 2: Análise de Matriz

Este programa lê uma matriz 4x4, preenche seus valores com a entrada do usuário
e, em seguida, conta e exibe quantos valores são maiores que 10.
*/
package secao06.Exercicio;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		// 1. Criação da Matriz e Ferramentas
		
		int[][] matriz = new int[4][4];
		int contador = 0; // Inicializa o contador de valores > 10
		
		// Usa o try-with-resources para garantir que o Scanner será fechado
		try (Scanner teclado = new Scanner(System.in)) {
			
			// 2. Preenchendo a Matriz com a Entrada do Usuário
			
			System.out.println("--- Preencha a Matriz 4x4 ---");
			for (int linha = 0; linha < matriz.length; linha++) {
				for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
					System.out.print("Digite o valor para a posição [" + linha + "][" + coluna + "]: ");
					matriz[linha][coluna] = teclado.nextInt();
				}
			}
			
			// 3. Contando Valores Maiores que 10 e Imprimindo a Matriz
			
			System.out.println("\n--- Matriz Digitada ---");
			for (int linha = 0; linha < matriz.length; linha++) {
				for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
					// Verifica se o valor é maior que 10
					if (matriz[linha][coluna] > 10) {
						contador++; // Incrementa o contador
					}
					System.out.print(matriz[linha][coluna] + "\t"); // Imprime o valor da matriz
				}
				System.out.println(); // Quebra de linha
			}
			
		} // O Scanner é fechado automaticamente aqui
		
		// 4. Imprimindo o Resultado Final
		
		System.out.println("\nA matriz possui " + contador + " valores maiores que 10.");
	}
}