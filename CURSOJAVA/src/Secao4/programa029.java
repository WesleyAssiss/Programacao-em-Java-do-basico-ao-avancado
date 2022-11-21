
/*
Wesley Elbert Assis
 */

 /*
 21-> Faça um programa que receba do usuário dois vetores,A e B, com 10 números
inteiros cada.Crie um novo vetor denominado C calculando C = A - B. Mostre na 
tela os dados do vetor C.
 */
package Secao4;

import java.util.Scanner;

public class programa029 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int vetorC[] = new int[10];

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
        for (int k = 0; k < vetorC.length; k++) {
            vetorC[k] = vetorA[k] - vetorB[k];

            System.out.println("->Subtraindo os valores<-");
            System.out.println("VetorA - VetorB -> " + vetorA[k] + " - " + vetorB[k]);
            System.out.println();
            System.out.println("->Resultado Final<-");
            System.out.println("VetorC  = " + vetorC[k] + "\n");
            System.out.println("-----------------------------------------------------");

        }
    }
}
