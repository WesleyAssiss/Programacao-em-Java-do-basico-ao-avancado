/*
Faça um programa que leia um número inteiro N e depois imprima os N primeiros números naturais ímpares.
 */
package Secao3;

import java.util.Scanner;

public class programa009 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0, i = 0, menor = 0, impar = 1;

        System.out.println("Digite um valor inteiro:");
        numero = entrada.nextInt();

        while (i < 100) {
            System.out.println(impar);
            i = i + 1;
            impar = impar + 2;

        }
    }

}
