package secao03.Exercicios;

import java.util.Scanner;

/*
 1. Faça um programa que peça ao usuário para digitar dois números e mostre
 qual deles é o maior.
*/
public class Exercicio01 {

	public static void main(String[] args) {
			
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.print("Informe o primeiro número: ");
		int num1 = teclado.nextInt();
		
		System.out.print("Informe o segundo número: ");
		int num2 = teclado.nextInt();
		
		teclado.close();
		
		if(num1 > num2) {
			System.out.println("O primeiro número: " + num1 + " é maior.");
			
		}else if (num1 == num2) {
			System.out.println("Os dois números são iguais.");
		
		}else {
			System.out.println("O segundo número é maior.");
		}
	}

}
