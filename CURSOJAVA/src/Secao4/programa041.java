/*
Wesley Elbert Assis
 */

 /*

33-> Faça um programa que leia um vetor de 15 posições e o compacte, ou seja, elimine
as posições com o valor zero. Para isso, todos os elementos à frente do valor zero,
devem ser movidos uma posição para trás no vetor.

 */
package Secao4;

import java.util.Scanner;

public class programa041 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[5];
        int cont = 0;
        int limite = 5;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor: ");
            vetor[i] = entrada.nextInt();
        }
        do {
            for (int i = 0; i < limite; i++) {
                if (vetor[i] == 0) {
                    for (int j = i + 1; j < limite; j++) {
                        vetor[j - 1] = vetor[j];
                    }
                    limite--;
                    cont++;
                }
            }
        } while (cont > 0);
        System.out.println("\n");

        for (int i = 0; i < limite; i++) {
            System.out.println("VetorFinal: " + i + " " + vetor[i]);

        }

    }
}
