/*
Wesley Elbert Assis
 */

 /*
18-> Faça um programa que leia um vetor de 10 números. Leia um número x. Conte os
múltiplos de um número inteiro x num vetor e mostre-os na tela.
 */
package Secao4;

import java.util.Scanner;

public class programa026 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }
        System.out.println();

        for (int j = 0; j <= vetor.length - 1; j++) {
            if (vetor[j] % 2 == 0) {
                System.out.print(vetor[j] + " -> " + " É par ");
                if (vetor[j] == 2) { // 2 é o único número par que é primo
                    System.out.print(" e primo");
                } else if (vetor[j] % 4 == 0) { // só faz sentido ver se é múltiplo de 4 se for par
                    System.out.print(" e múltiplo de 4");
                }
            } else { // se for ímpar, verifica se é primo
                System.out.print(vetor[j] + " -> " + " É ímpar");
                boolean primo = true;
                if (vetor[j] > 2) { // só tem esse if porque o número 1 não é primo
                    for (int i = 3; i < vetor[j] / 2; i += 2) { // não precisa iterar até vetor[i], e só itero pelos ímpares
                        if (vetor[j] % i == 0) {
                            primo = false;
                            break;
                        }
                    }
                }
                if (primo) {
                    System.out.print(" e primo");
                }
            }
            if (vetor[j] % 3 == 0) {
                System.out.print(" e múltiplo de 3");

                if (vetor[j] % 5 == 0) {
                    System.out.print(" e múltiplo de 5. Múltiplos menores que " + vetor[j] + ":");
                    // imprimir múltiplos de 5 menores que n em ordem descrescente
                    for (int mult = vetor[j] - 5; mult >= 0; mult -= 5) {
                        System.out.print(" " + mult);
                    }
                }
            }

            System.out.println();

        }
    }
}
