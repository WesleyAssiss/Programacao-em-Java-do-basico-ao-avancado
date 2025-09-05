/*
Wesley Elbert Assis
 */

 /*
29-> Faça um programa que receba 6 números inteiros e mostre:

. Os números pares digitados;
. A soma dos números pares digitados;
. Os números ímpares digitados;
. A quantidade de números ímpares digitados;
 */
package Secao4;

import java.util.Scanner;

public class programa037 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[6];
        int cont0 = 0;//Variavel para contar a quantidade de números pares
        int cont1 = 0;//Variavel para contar a quantidade de números ímpares
        int soma0 = 0;//Variavel para somar a quantidade de números pares
        int soma1 = 0;//Variavel para somar a quantidade de números ímpares
        
       
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor: ");
            vetor[i] = entrada.nextInt();
        }
        System.out.println("\n \n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                soma0 += vetor[i];
                cont0++;

                System.out.println(vetor[i] + " é par. Posição no vetor: [" + i + "]");

            }
        }
        System.out.println("A soma dos números pares digitados é: " + soma0);
        System.out.println("A quantidade de números pares digitados é: " + cont0);
        System.out.println("\n \n \n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                soma1 += vetor[i];
                cont1++;

                System.out.println(vetor[i] + " é ímpar. Posição no vetor: [" + i + "]");

            }
        }
        System.out.println("A soma dos números ímpares digitados é: " + soma1);
        System.out.println("A quantidade de números ímpares digitados é: " + cont1);
    }
}
