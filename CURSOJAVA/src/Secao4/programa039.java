/*
Wesley Elbert Assis
 */

 /*

31-> Faça um programa que leia dois vetores de 10 elementos.Crie um vetor que seja 
a união entre os 2 vetores anteriores, ou seja, que contém os números dos dois vetores.
Não deve conter números repetidos.

 */
package Secao4;

import java.util.Scanner;


public class programa039 {
  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[10];
        int vetor1[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor: ");
            vetor[i] = entrada.nextInt();
        }
        System.out.println("\n \n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor1: ");
            vetor1[i] = entrada.nextInt();
        }
        
        System.out.println("\n \n");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == vetor1[i]) {

                System.out.println("Os números que estão em ambos os vetores é: " + vetor[i]);

            }
        }

    }
}  

