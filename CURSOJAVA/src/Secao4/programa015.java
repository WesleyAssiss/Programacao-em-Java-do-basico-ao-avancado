
/*
Wesley Elbert Assis
 */

 /*
6-> Faça um programa que receba do usuário um vetor com 10 posições. Em seguida 
deverá ser impresso o maior e o menor elemento do vetor.
 */
package Secao4;

import java.util.Scanner;

public class programa015 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // declaração de vetor
        int vetor[] = new int[10];
        int maior = -999999999;
        int menor = 999999999;

        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = entrada.nextInt();

        }
        //O maior número digitado pelo usario ficara armazenado na variavel -> maior
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
         //O menor número digitado pelo usario ficara armazenado na variavel -> menor
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] < menor) {
                menor = vetor[j];
            }
        }

        System.out.println();
        System.out.println("O maior número é: " + maior);//Imprimindo o maior número
        System.out.println("O menor número é: " + menor);//Imprimindo o menor número

    }
}
