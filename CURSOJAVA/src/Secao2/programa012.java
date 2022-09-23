/*
Escreva um programa que leia um número inteiro maior do que zero e devolva
na tela a soma de todos os seus algoritmos. Por exemplo, ao número 251 
corresponderá o valor 8 (2 + 5 + 1) Se o  número lido não for maior que zero,
o programa terminará com a mensagem : "Número inválida".
 */
package Secao2;

import java.util.Scanner;

public class programa012 {

    public static void main(String[] args) {
        int num, soma = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        num = entrada.nextInt();

        if (num > 0) {

            while (num > 0) {

                soma = soma + num % 10;

                num = num / 10;

            }

            System.out.println("A soma dos algoritmos: " + soma);

        } else {

            System.out.println("O numero é inválido");

        }

    }
}
