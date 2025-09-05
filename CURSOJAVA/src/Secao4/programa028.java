/*
Wesley Elbert Assis
 */

 /*
20-> Escreva um programa que leia números inteiros no intervalo[0,50] e os 
armazene em um vetor com 10 posições.Preencha um segundo vetor  com os números
ímpares e pares do primeiro vetor.Imprima os dois vetores,2 elementos por linha.
 */
package Secao4;

import java.util.Scanner;

public class programa028 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[3];
        int vetorImpar[] = new int[3];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número ente [0,50]: ");
            vetor[i] = entrada.nextInt();
             
            if (vetor[i] > 50) {
               
                System.out.println("Erro números inválidos");
                break;

            }
            vetorImpar[i] = vetor[i];
           
            if (vetorImpar[i] % 2 == 1) {
                System.out.println("O número: " + vetorImpar[i] + " é ímpar");
                System.out.println();
            }else{
                System.out.println("O número: " + vetorImpar[i] + " é par");
                System.out.println();
            }

        }
        
    }
}
