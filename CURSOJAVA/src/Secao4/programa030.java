/*
Wesley Elbert Assis
 */

 /*
22-> Faça um programa que leia dois vetores de 10 posições e calcule outro vetor contendo,
nas posições pares os valores do primeiro e nas posições ímpares e os valores do segundo.
 */
package Secao4;

import java.util.Scanner;

public class programa030 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetorA[] = new int[10];//Declarando e especificando o tamanho do vetor
        int vetorB[] = new int[10];//Declarando e especificando o tamanho do vetor
        int vetorC[] = new int[20];//VetorC será o dobro, pois necessita receber o vetorA e vetorB

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetorA.length + " do vetor A: ");
            vetorA[i] = entrada.nextInt();
        }
        System.out.println("\n \n");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetorB.length + " do vetor B: ");
            vetorB[i] = entrada.nextInt();
        }
        System.out.println();
        for (int i = 0, j = 0, k = 0; i < vetorC.length; i++) {
            if (i % 2 == 0) {
                vetorC[i] = vetorA[j++];

            } else if (i % 2 == 1) {
                vetorC[i] = vetorB[k++];

            }

        }

        System.out.println();
        for (int i = 0; i < vetorC.length; i++) {
            
            if (vetorC[i] % 2 == 0) {
                System.out.println(vetorC[i] + " -> número par");
            } else {
                System.out.println(vetorC[i] + " -> número ímpar");
            }
        }

    }
}
