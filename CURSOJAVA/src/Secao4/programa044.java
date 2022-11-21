/*
Wesley Elbert Assis
 */

 /*

36-> Leia um vetor com 10 números reais, ordene os elementos deste vetor, e no
final escreva os elementos do vetor ordenado.

 */
package Secao4;

import java.util.Arrays;
import java.util.Scanner;

public class programa044 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float vetor[] = new float[10];
       

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor: ");
            vetor[i] = entrada.nextFloat();
        }
        Arrays.sort(vetor);
        System.out.print("Seu vetor ordenado: [");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
        System.out.print("]");
        System.out.println("\n \n");
    }
}
