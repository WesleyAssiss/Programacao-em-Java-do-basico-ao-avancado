/*
Wesley Elbert Assis
 */

 /*
16-> Faça um programa que leia um vetor de 5 posições para números reais e, depois,
um código inteiro. Se o código for zero, finalize o programa; se for 1, mostre o vetor
na ordem direta; se for 2 mostre o vetor na ordem  inversa.Caso, o código for diferente
de 1 e 2 escreva uma mensagem informando que o código é inválido.
 */
package Secao4;

import java.util.Scanner;

public class programa024 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[3];
        int opcao;
        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor dos números: ");
            vetor[i] = entrada.nextInt();//Armazenando os números inseridos pelo usuário

        }

        do {
            System.out.println("\n Digite o código: \n 0 -> Para finalizar o programa \n"
                    + " 1 -> Para mostrar o vetor em ordem direta \n"
                    + " 2 -> Para mostrar o vetor em ordem indireta \n");
            opcao = entrada.nextInt();
            switch (opcao) {
                case 0:
                    System.out.println("Finalizando...");
                    break;
                case 1:
                    for (int i = 0; i < vetor.length; i++) {
                        System.out.println("Imprimindo na ordem direta... " + vetor[i]);
                    }
                    break;

                case 2:
                    for (int i = vetor.length - 1; i >= 0; i--) {
                        System.out.println("Imprimindo na ordem inversa... " + vetor[i]);
                    }
                    break;
                default:
                    System.out.println("Opção Inválida \n"
                            + "Digite novamente. ");

            }

        } while (opcao != 0);

    }
}
