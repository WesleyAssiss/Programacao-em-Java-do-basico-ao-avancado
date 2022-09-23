/*
Faça um programa que leia 10 inteiros positivos, ignorando não positivos, e imprima sua média.
 */
package Secao3;

import java.util.Scanner;

public class programa007 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int soma = 0, numero, media;
        int cont = 0;

        while (cont < 10) {
            numero = entrada.nextInt();
            if (numero > 0) {
                 soma = soma + numero;
                 cont++;
                     
            } else {
                System.out.println("ERRO Digitar apenas valores Positivos");
                System.exit(0);
            }

        }

                 media = soma / cont;
                System.out.println("A média é: " + media);
    }
}
