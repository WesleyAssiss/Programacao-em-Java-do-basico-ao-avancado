//Exercicio 1: Faça um programa que leia um número inteiro e o imprima

package secao02.Exercicios;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {	
		
		Scanner teclado = new Scanner(System.in);
			
		System.out.print("Por favor, digite um número: ");
		
		// Lê o número digitado
		int num = teclado.nextInt();
		
		
		// Imprime o resultado formatado
		System.out.println("O número digitado é: " + num);
	}
}
