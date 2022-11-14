/*
Wesley Elbert Assis
 */

 /*
7-> escreva um programa que leia 10 números inteiros e os armazene em um vetor.
Imprima o vetor, o maior elemento e a posição que ele se encontra.
 */
package Secao4;

import java.util.Scanner;


public class programa016 {
    public static void main(String[] args) {
        
    
      Scanner entrada = new Scanner(System.in);
 // declaração de vetor
        int vetor[] = new int[5];
        int maior = -999999999;
        int menor = 999999999;
        int posicao = 0,posicao1 = 0;

        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = entrada.nextInt();
            
        }
    
        //Realizando o teste de qual o maior número e onde ele está posicionado no vetor.
        //Lembrando o vetor começa do 0.
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                posicao = i;
                maior = vetor[i];
            }
        }
        //Realizando o teste de qual o menor número e onde ele está posicionado no vetor.
        //Lembrando o vetor começa do 0.
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] < menor) {
                posicao1 = j;
                menor = vetor[j];
            }
        }
   
        System.out.println();
        System.out.println("O maior número é: " + maior + ". A posição do vetor é: " + posicao);//Imprimindo o maior número e sua posição.
        System.out.println("O menor número é: " + menor + ". A posição do vetor é: " + posicao1);//Imprimindo o menor número e sua posição.
        System.out.println();

         
         
    }
}


