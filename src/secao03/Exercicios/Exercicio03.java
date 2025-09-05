/*
Faça um programa que peça ao usuário para digitar um número e diga se o número digitado é
par ou ímpar.
*/

package secao03.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int numero = teclado.nextInt();
		
		teclado.close();
		
		if(numero % 2 == 0) {
			System.out.println("O número: " + numero + " é par.");
		}else {
			System.out.println("O número: " + numero + " é ímpar.");
		}
	}
}
