/*
Wesley Elbert Assis
 */

 /*
5-> Leia um vetor de 10 posições.Contar e escrever quantos valores pares ele possui.
 */
package Secao4;

import java.util.Scanner;

public class programa014 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // declaração de vetor
        int vetor[] = new int[10];
        int par = 0;
        int cont = 0;

        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = entrada.nextInt();

        }
        //Analisando quantos valores pares tem nos números digitados.
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                cont++;
            }
        }
            System.out.println("O total de números pares é: "  + cont);
  
    }
}
