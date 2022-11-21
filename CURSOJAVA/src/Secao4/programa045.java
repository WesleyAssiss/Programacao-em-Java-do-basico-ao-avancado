/*
Wesley Elbert Assis
 */

 /*

37-> Considere um vetor A com 11 elementos onde A1 < A2 < ... < A6 > A7 > A8 > ... > A11,
ou seja, está ordenado em ordem crescente até o sexto elemento, e apartir desse 
elemento está ordenado em ordem decrescente.Dado o vetor da questão anterior,
proponha um algoritmo para ordenar os elementos.

 */
package Secao4;

import java.util.Arrays;
import java.util.Scanner;

public class programa045 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[11];
        int i;      
        int codigo;

        for (i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor: ");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("Código: \n"
                + " 1 -> Ordem Crescente\n"
                + " 2 -> Ordem Decrescente\n"
                + " 0 -> Sair");
        codigo = entrada.nextInt();
        System.out.println();
        switch (codigo) {

            case 0:
                break;

            case 1:
                Arrays.sort(vetor);
                System.out.print("Seu vetor em ordem Crescente: [");
                for (i = 0; i < vetor.length; i++) {
                    System.out.print(vetor[i] + ", ");
                }
                System.out.print("]");
                System.out.println("\n \n");

                System.out.println();
                break;

            case 2:
                Arrays.sort(vetor);
                System.out.print("Seu vetor em ordem decrescente: [");
                for (i = vetor.length - 1; i >= 0; i--) {
                    System.out.print(vetor[i] + ", ");
                }
                System.out.print("]");
                System.out.println("\n \n");

                System.out.println();
                break;

            default:
                System.out.println("Código inválido!");
                break;
        }

    }
}
