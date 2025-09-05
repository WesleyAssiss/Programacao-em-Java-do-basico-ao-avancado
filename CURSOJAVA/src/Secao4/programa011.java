/*
Wesley Elbert Assis
 */

/*
2-> Crie um programa que lê 6 números inteiros e, em seguida, mostre na tela 
os valores lidos.
*/

package Secao4;

import java.util.Scanner;


public class programa011 {
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
        // declaração de vetor
        int vetor[] = new int[6];
        
        // entrada de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um número");
            vetor[i] = entrada.nextInt();
        }
        System.out.println();
       
         // saída de dados
        for (int i = 0; i < vetor.length; i++) {
        System.out.println(vetor[i]);
        }
        
    }
}

