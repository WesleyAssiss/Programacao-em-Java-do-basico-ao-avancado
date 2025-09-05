// Faça um programa que peça ao usuário para digitar três valores inteiros e imprima a soma deles.
package secao02.Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		//Criando o leitor de teclado
		try(Scanner teclado = new Scanner(System.in)){
			
			//Declara a variável para a soma
			int soma = 0;
			
			//Loop para ler os 3 números e somar
			for(int i = 1; i <= 3; i++) {
				System.out.print("Digite o " + i + "º número: ");
				soma += teclado.nextInt(); //Soma o número lido diretamente
			}
			//Imprime o resultado final
			System.out.println("A soma dos números é: " + soma);
		}
	}
}
			
			