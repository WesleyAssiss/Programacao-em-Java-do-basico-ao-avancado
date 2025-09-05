/*
Wesley Elbert Assis
*/

/*
Faça um programa que leia um número inteiro positivo N e imprima todos os
números ímpares de 0 até N em ordem decrescente.
 */
package Secao3;

import java.util.Scanner;

public class programa016 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        System.out.println("Digite um número: ");
        n = entrada.nextInt();

        for (int i = 0, num = n - 1 - (n % 2); i < n; i++, num -= 2) {
            System.out.println(num);
        }
        if (n < 0) {
            System.err.println("ERRO Digitar apenas valores Positivos");
            System.exit(0);
        }
    }
}
