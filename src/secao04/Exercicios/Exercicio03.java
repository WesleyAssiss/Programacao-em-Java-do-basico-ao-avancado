/*
 3. Faça um programa que declara um valor inteiro, inicialize-o com 0, incremente-o de 1000 em 
1000, imprimindo seu valor na tela, até que seu valor seja 100000 (cem mil)
*/
package secao04.Exercicios;

public class Exercicio03 {
	public static void main(String[] args) {
		
		System.out.println("Contagem de 0 a 100.000, de 1000 em 1000 utilizando for:");
		
		// O incremento de 1000 é feito diretamente no cabeçalho do laço 'for'
		for (int i = 0; i <= 100000; i += 1000) {
			System.out.println(i);
		}
		
		System.out.println("\n Contagem de 0 a 100.000, de 1000 em 1000, utilizando while:");
		int j = 0;
		while(j <= 100000) {
			System.out.println(j);
			j += 1000;
		}
		
		System.out.println("\n Contagem de 0 a 100.000, de 1000 em 1000, utilizando do while:");
		
		int k = 0;
		do {
			System.out.println(k);
			k += 1000;
		} while (k <= 100000);
		
	}
}