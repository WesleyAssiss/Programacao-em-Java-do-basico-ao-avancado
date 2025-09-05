//Faça um programa que peça ao usuário para digitar um número real e imprima o resultado do
//quadrado desse número.

package secao02.Exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Cria o objeto Scanner para ler a entrada do teclado
		try (Scanner teclado = new Scanner(System.in)) {
			
			// Solicita o número ao usuário
			System.out.print("Por favor, digite um número real: ");
			
			// Lê o número real digitado
			double numero = teclado.nextDouble();
			
			// Calcula o numero elevado à potência de 2
			double elevado = Math.pow(numero, 2);
			
			// Imprime o resultado formatado
			System.out.println("O quadrado de " + numero + " é " + elevado);
		}
	}
}