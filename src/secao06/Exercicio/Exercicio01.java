/*
1. Faça um programa que possua um vetor, denominado A, que armazene 6 números inteiros. O
programa deve executar os seguintes passos:
a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2,-5, 7;
b) Armazene em uma variável inteira a soma entre os valores das posições A[0], A[1] e A[5] do
vetor e mostre na tela esta soma;
c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100;
d) Mostre na tela cada valor do vetor A, um em cada linha.
*/
/*
Exercício 1: Manipulação de Vetor

Este programa cria um vetor de 6 posições e realiza uma série de operações
de atribuição, soma e impressão, conforme as instruções do exercício.
*/
package secao06.Exercicio;

public class Exercicio01 {

	public static void main(String[] args) {
		
		// 1.a) Atribuindo os valores iniciais ao vetor
		int[] A = new int[6];
		A[0] = 1;
		A[1] = 0;
		A[2] = 5;
		A[3] = -2;
		A[4] = -5;
		A[5] = 7;
		
		// 1.b) Armazenando e mostrando a soma
		int soma = A[0] + A[1] + A[5];
		System.out.println("A soma dos valores A[0], A[1] e A[5] é: " + soma);
		
		// 1.c) Modificando o valor na posição 4
		A[4] = 100;
		
		System.out.println("\n--- Valores do Vetor ---");
		
		// 1.d) Mostrando cada valor do vetor em uma nova linha
		for (int i = 0; i < A.length; i++) {
			System.out.println("Posição " + i + ": " + A[i]);
		}
		
		// Outra forma, usando o for-each
		/*
		System.out.println("\n--- Valores do Vetor (for-each) ---");
		for (int valor : A) {
			System.out.println(valor);
		}
		*/
	}
}