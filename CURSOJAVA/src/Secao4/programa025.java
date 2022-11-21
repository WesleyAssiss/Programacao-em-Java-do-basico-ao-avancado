/*
Wesley Elbert Assis
 */

 /*

17-> Leia um vetor de 10 posições e atribua o valor 0 para todos os elementos que 
possuirem valores negativos.

 */
package Secao4;

import java.util.Scanner;

public class programa025 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // declaração de vetor
        int[] vetor = new int[10];

        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                
                vetor[i] = 0;

            }

            System.out.println("atribuindo o valor 0 para todos os elementos que possuem valores negativos: "
                    + vetor[i]);

        }
    }
}
