/*
Wesley Elbert Assis
 */

 /*
27-> Leia 10 números inteiros e armazene em um vetor v. Crie dois novos vetores v1 e
v2. Copie os valores ímpares de v para v1, e os valores pares de v para v2. Note que cada
um dos vetores v1 e v2 têm no máximo 10 elementos, mas nem todos os elementos são
utilizados. No final escreva os elementos UTILIZADOS de v1 e v2.
 */
package Secao4;

import java.util.Scanner;

public class programa035 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor[] = new int[10];

        //ler valores para o primeiro vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor: ");
            vetor[i] = entrada.nextInt();
            
            
        }
        System.out.println("");
        //Preenche o terceiro vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 1) {
                vetor1[i] = vetor[i];
                System.out.println("[Vetor1] números ímpares: " + vetor1[i]);
            }
        }
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] % 2 == 0) {
             vetor2[i] = vetor[i];
                System.out.println("[Vetor2] números pares: " + vetor2[i]);
            }
        }
        
    }
}
