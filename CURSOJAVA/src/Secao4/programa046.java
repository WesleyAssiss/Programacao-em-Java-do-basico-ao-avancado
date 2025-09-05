/*
Wesley Elbert Assis
 */

 /*

38-> Peça ao usuário para digitar dez valores numéricos e ordene por ordem crescente
esses valores, guardando-os num vetor.Ordene o valor assim que ele for digitado. Mostre
ao final na tela os valores em ordem.

 */
package Secao4;

import java.util.Scanner;

public class programa046 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[2];
        int vetorOrdenado[] = new int[10];
        
        int PosMaior = 0;// assume que o maior está na posição
        int PosMenor = 0;// assume que o primeiro é o menor

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor1: ");
            vetor[i] = entrada.nextInt();
        }
        System.out.println("\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor2: ");
            vetor[i] = entrada.nextInt();

        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > vetor[PosMaior]) {
                PosMaior = i;// acha a posição do maior
            }
        }
        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] > vetor[PosMenor]) {
                    PosMenor = i;
                }
            }
            
            
            vetorOrdenado[j] = vetor[PosMenor]; // copia menor para o novo vetor
            // inutiliza a posição do menor colocando nela um número grande
            vetor[PosMenor] = vetor[PosMaior]; // no caso o maior do vetor

        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Vetor Ordenado: " + vetorOrdenado[i]);// Imprime os dados
        }
    }
}
