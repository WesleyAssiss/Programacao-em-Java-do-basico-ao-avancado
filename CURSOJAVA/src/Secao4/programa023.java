/*
Wesley Elbert Assis
 */

 /*

15-> Leia um vetor com 20 números inteiros.Escreva os elementos do vetor eliminando
elementos repetidos.
 */
package Secao4;

import java.util.Scanner;

public class programa023 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[5];
        int n = 0;
        int j;

        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor dos números: ");
            vetor[i] = entrada.nextInt();//Armazenando os números inseridos pelo usuário
        }

        /* Remove elementos com valor duplicado */
        for (int i = 0; i < vetor.length; i++) {
            for (j = 0; j < n; j++) {
                if (vetor[i] == vetor[j]) {
                    break;
                }
            }
            

            if (j == n) {
                vetor[n] = vetor[i];
                n++;
            }
        }
        System.out.println();
        /* Exibe Vetor de Saida */
        System.out.println("Exibindo os valores... (Eliminandos os valores repetidos)");

        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }

    }
}
