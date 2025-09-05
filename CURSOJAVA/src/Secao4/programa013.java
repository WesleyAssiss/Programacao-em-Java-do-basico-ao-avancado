/*
Wesley Elbert Assis
*/

/*
4-> Faça um programa que leia um vetor de 8 posições e, em seguida, leia também
dois valores X e Y quaisquer correspondentes a duas posiçoes no vetor. Ao final
seu programa deverá escrever a soma dos valores encontrados nas respectivas posições
X e Y.
*/
package Secao4;

import java.util.Scanner;


public class programa013 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        // declaração de vetor
        int vetor[] = new int[8];
        int soma = 0;
        
        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: " );
            vetor[i] = entrada.nextInt();
 
        }
        //Soma das posições
        soma = vetor[3] + vetor[4];
        System.out.println("A soma da posição do vetor[3] = " + vetor[3] + " e vetor[4] = " + vetor[4] + " é: " + soma);
        
        
        
    }
}
