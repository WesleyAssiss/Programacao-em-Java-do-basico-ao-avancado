/*
Wesley Elbert Assis
 */

 /*
26-> Faça um programa que calcule o desvio padrão de um vetor v contendo n = 10
números, onde m é a media do vetor


                        n
Desvio Padrão =    1    ∑ (v[i]− m)^2 
                  n−1  i=1

 */
package Secao4;

import java.util.Scanner;

public class programa034 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[10];
        int soma = 0;
        float media;
        float variacoes = 0;
        float v;
        float sigma;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor 1: ");
            vetor[i] = entrada.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        media = (float) soma / vetor.length;
        for (int i = 0; i < vetor.length; i++) {
            v = vetor[i] - media;
            variacoes += v * v;
        }
        sigma = (float) Math.sqrt(variacoes / vetor.length);
        System.out.println("Resultado: " + sigma);
    }
}
