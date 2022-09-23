/*
 Leia um número real. Se o número for positivo imprima a raiz quadrada
Do contrário, imprima o número ao quadrado.
 */
package Secao2;

import java.util.Scanner;

public class programa004 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numero;

        System.out.println("Digite um número");
        numero = entrada.nextFloat();

        if (numero >= 0) {
            System.out.println("A raiz de " + numero + " é: " + Math.sqrt(numero));
        } else {
            System.out.println("Nao existe raiz para número negativos");
        }

    }

}
