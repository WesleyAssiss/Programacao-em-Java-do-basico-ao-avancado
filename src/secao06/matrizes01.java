//Matrizes
/*
 * Matrizes são vetores de vetores, organizados em linhas e colunas.
 * int numeros[3][3] -> Uma matriz de inteiros com 3 linhas e 3 colunas.
 * numeros[0][0] = 1; -> Atribui o valor 1 à primeira linha e primeira coluna.
 * numeros[0][1] = 2;
 * numeros[0][2] = 3;
 * numeros[1][0] = 4;
 * numeros[1][1] = 5;
 * numeros[1][2] = 6;
 * numeros[2][0] = 7;
 * numeros[2][1] = 8;
 * numeros[2][2] = 9;
 *
 * O primeiro índice acessa a linha, e o segundo acessa a coluna.
*/
/*
Matrizes em Java: Uma Visão Geral

Este programa demonstra a criação, manipulação e impressão de matrizes
(arrays bidimensionais) em Java.
*/
package secao06;

public class matrizes01 {

	public static void main(String[] args) {
		
		// --- 1. Declaração e Criação de Matrizes ---
		
		// Declaração: apenas declara que a variável 'matriz1' é uma matriz de inteiros.
		int[][] matriz1;
		
		// Declaração e definição de tamanho: cria uma matriz de 3x3 e a inicializa com valores padrão (0).
		int[][] matriz2 = new int[3][3];
		
		// Declaração, definição de tamanho e inicialização: cria e inicializa a matriz com valores específicos.
		int[][] matriz3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		
		
		// --- 2. Atribuindo Valores à Matriz (Matriz2) ---
		
		matriz2[0][0] = 1;
		matriz2[0][1] = 2;
		matriz2[0][2] = 3;
		
		matriz2[1][0] = 4;
		matriz2[1][1] = 5;
		matriz2[1][2] = 6;
		
		matriz2[2][0] = 7;
		matriz2[2][1] = 8;
		matriz2[2][2] = 9;
		
		
		// --- 3. Percorrendo e Imprimindo a Matriz ---
		
		System.out.println("--- Matriz Inicializada (matriz3) ---");
		
		// Laço 'for' aninhado para percorrer a matriz e imprimir seus valores.
		for (int linha = 0; linha < matriz3.length; linha++) {
			for (int coluna = 0; coluna < matriz3[linha].length; coluna++) {
				System.out.print(matriz3[linha][coluna] + " ");
			}
			System.out.println();
		}
		
		
		// --- 4. Declaração de Matrizes Irregulares ---
		
		System.out.println("\n--- Matriz Irregular ---");
		
		// Declarar uma matriz informando somente as linhas.
		int[][] matriz_irregular = new int[3][];
		
		// Atribuir o número de colunas para cada linha individualmente.
		matriz_irregular[0] = new int[2]; // Linha 0 terá 2 colunas
		matriz_irregular[1] = new int[4]; // Linha 1 terá 4 colunas
		matriz_irregular[2] = new int[3]; // Linha 2 terá 3 colunas
		
		// Acessando e imprimindo o tamanho das linhas.
		System.out.println("Tamanho da linha 0: " + matriz_irregular[0].length);
		System.out.println("Tamanho da linha 1: " + matriz_irregular[1].length);
		System.out.println("Tamanho da linha 2: " + matriz_irregular[2].length);
		
		
		// --- 5. Atribuindo e Imprimindo uma Matriz Irregular ---
		
		System.out.println("\n--- Imprimindo Matriz Irregular ---");
		
		// Preenche e imprime os valores da matriz irregular.
		for (int linha = 0; linha < matriz_irregular.length; linha++) {
			for (int coluna = 0; coluna < matriz_irregular[linha].length; coluna++) {
				matriz_irregular[linha][coluna] = linha + coluna;
				System.out.print(matriz_irregular[linha][coluna] + " ");
			}
			System.out.println();
		}
	}
}