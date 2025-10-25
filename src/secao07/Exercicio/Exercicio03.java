package secao07.Exercicio;

/*
3. Escreva um programa que tenha uma função que recebe dois valores inteiros e retorna o
 maior.
*/
/*
Exercício 3: Maior entre Dois Valores Inteiros

Este programa define uma função que compara dois números inteiros
e retorna o maior deles, utilizando a classe utilitária Math para refatoração.
*/

import java.util.Scanner;

public class Exercicio03 {

	/**
	 * Função que compara dois números inteiros e retorna o maior.
     *
     * **Refatoração:** Usa o método estático Math.max() para maior concisão.
	 *
	 * @param valor1 O primeiro número inteiro.
	 * @param valor2 O segundo número inteiro.
	 * @return O maior valor entre valor1 e valor2.
	 */
	public static int maiorValor(int valor1, int valor2) {
		// Retorna o maior dos dois valores usando o método Math.max()
		return Math.max(valor1, valor2);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("--- Comparação de Valores ---");

		System.out.print("Digite o primeiro número inteiro: ");
		int num1 = scanner.nextInt();

		System.out.print("Digite o segundo número inteiro: ");
		int num2 = scanner.nextInt();

		// Chamando a função para encontrar o maior valor
		int maior = maiorValor(num1, num2);

		System.out.printf("\nO maior valor entre %d e %d é: %d\n", num1, num2, maior);

		scanner.close();
	}
}