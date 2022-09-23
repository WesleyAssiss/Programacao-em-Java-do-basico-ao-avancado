/*
Escreva um programa que leia 10 números e escreva o menor valor lido e o maior valor lido
 */
package Secao3;

import java.util.Scanner;

public class programa008 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0, maior = 0, menor = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Insira um valor:");
            numero = entrada.nextInt();

            if (i == 0) {

                maior = numero;
                menor = numero;
            }

            if (numero > maior) {

                maior = numero;
            }

            if (numero < menor) {

                menor = numero;
            }
        }
        System.out.println("\n");
        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

    }
}
