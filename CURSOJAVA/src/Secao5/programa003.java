/*
Wesley Elbert Assis
 */

 /*

1 -> Crie uma função que recebe como parâmetro um número inteiro e devolve o seu dobro.

 */
package Secao5;

import java.util.Scanner;

public class programa003 {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        
        System.out.println("Digite o número inteiro: ");
        num = entrada.nextInt();

        System.out.println("O resultado de " + num + " x " + num + " = " + dobro(num));

    }

    static int dobro(int valor1) {

        return valor1 * valor1;
    }

}
