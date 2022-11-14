/*
Wesley Elbert Assis
*/

/*
Faça um programa que receba um número inteiro e verifique se este número
é par ou ímpar.
 */
package Secao2;

import java.util.Scanner;

public class programa006 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         int numero;
         
         
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        
        
       
        if (numero % 2 == 0 ) {
            
            System.out.println("O número digitado é par: " + numero);

        } else {
            System.out.println("O número é ímpar");
        }

    }

}
