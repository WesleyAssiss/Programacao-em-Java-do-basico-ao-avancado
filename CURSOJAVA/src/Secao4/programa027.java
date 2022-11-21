/*
Wesley Elbert Assis
 */

 /*
19-> Faça um vetor de tamanho 50 preenchido com o seguinte valor: (i+5*i)%(i+1),
sendo i a posição do elemento no vetor. Em seguida imprima o vetor na tela.
 */
package Secao4;

import java.util.Scanner;

public class programa027 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[50];
        int posicao = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (i + 5 * i) % (i + 1);
            posicao = i;

            System.out.println("Números[" + i + "] = " + vetor[i]);
            

        }
    }

}
