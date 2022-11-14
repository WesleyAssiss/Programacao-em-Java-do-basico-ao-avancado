/*
Wesley Elbert Assis
 */

 /*
3-> Ler um conjunto de números reais, armazendando-o em vetor e calcular o 
quadrado das componentes deste vetor, armazenando o resultado em outro vetor.
Os conjuntos têm 10 elementos cada. Imprimir todos os conjuntos.

 */
package Secao4;

import java.util.Scanner;

public class programa012 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // declaração de vetor
        float vetor[] = new float[10];
        float quadrados[] = new float[10];

        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: " );//Usuário digita 10 números
            vetor[i] = entrada.nextFloat();
            quadrados[i] = vetor[i] * vetor[i];//Calculando cada número digitado ao quadrado
            System.out.println("O quadrado do número " + vetor[i] + " é: " + quadrados[i]);//Imprimindo o valor do número
            System.out.println();
        }
        System.out.println();
    }
}
