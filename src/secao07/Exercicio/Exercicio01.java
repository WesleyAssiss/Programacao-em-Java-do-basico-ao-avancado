package secao07.Exercicio;

/*
1. Faça um programa que possua uma função que recebe como parâmetro um número inteiro e
 devolve seu dobro.
*/
/*
Exercício 1: Dobro de um Número Inteiro

Este programa define uma função que calcula e retorna o dobro de um
número inteiro passado como parâmetro e o demonstra na função principal (main).
*/

import java.util.Scanner;

public class Exercicio01 {

	/**
	 * Função que calcula o dobro de um número inteiro.
	 *
	 * @param numero O número inteiro a ser dobrado.
	 * @return O dobro do número (numero * 2).
	 */
	public static int dobrarNumero(int numero) {
		return numero * 2;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite um número inteiro: ");
		// Lendo o número que será passado para a função
		int valorEntrada = scanner.nextInt();

		// Chamando a função para obter o resultado
		int resultado = dobrarNumero(valorEntrada);

		System.out.printf("O dobro de %d é: %d\n", valorEntrada, resultado);

		scanner.close();
	}
}