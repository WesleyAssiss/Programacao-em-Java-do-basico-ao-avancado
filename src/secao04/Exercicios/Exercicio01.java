/*
1. Faça um programa que determine e mostre os cinco primeiros múltiplos de 3, considerando 
números maiores que 0.
*/
package secao04.Exercicios;

public class Exercicio01 {

	public static void main(String[] args) {
		
		int contador = 0;
		int numero = 1;
		
		System.out.print("Os cinco primeiros múltiplos de 3 maiores que zero são: ");
		
		while (contador < 5) {
			if (numero % 3 == 0) {
				System.out.print(numero);
				contador++;
				// Verifica se não é o último número. Se não for, adiciona a vírgula e espaço.
				if (contador < 5) {
					System.out.print(", ");
				} else {
					// Se for o último, adiciona o ponto final.
					System.out.print(".");
				}
			}
			numero++;
		}
	}
}