/*
Escreva um programa que declare um inteiro, incialize-o com 0, e incremente-o de 1000
em 1000, imprimindo seu valor na tela, até que seu valor seja 1000000(cem mil)
 */
package Secao3;

public class programa004 {

    public static void main(String[] args) {
        int numero = 0;

        System.out.println("Número de mil(1.000) em mil(1.000) até 100.000 (cem mil)");
        do {
            System.out.println(numero);
            numero = numero + 1000;
        } while (numero <= 100000);
//while(i != 1);
    }
}
