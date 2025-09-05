/*
2. Faça um programa que peça ao usuário para digitar um número.
Se esse número for positivo, calcule a raiz quadrada do número.
Se o número for negativo, mostre uma mensagem dizendo que o número é inválido.
*/

package secao03.Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		double numero = teclado.nextDouble();
		
		teclado.close();
		
		if(numero > 0) {
			//Usando Math.sqrt() para raiz quadrada
			System.out.println("A raiz quadrada de " + numero + " é: " + Math.sqrt(numero));
		} else if(numero < 0) { // Lógica para o número negativo
			System.out.println("O número é inválido, pois é negativo.");
		} else { // Caso o número seja 0
			System.out.println("O número é 0.");
		}
		
	}

}
