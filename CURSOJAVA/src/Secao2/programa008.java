/*
Wesley Elbert Assis
*/

/*
Faça um programa que receba dois números e mostre o maior. Se por acaso, os dois
números forem iguais, imprima a mensagem Números iguais.
*/
package Secao2;

import java.util.Scanner;

public class programa008 {
     public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         int numero1,numero2,numero;
         
        System.out.println("Digite o primeiro número : ");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite o segundo número : ");
        numero2 = entrada.nextInt();
        

        if (numero1 > numero2) {
            System.out.println("O maior número é: "  + numero1 );
        } else if (numero2 >  numero1) {
            System.out.println("O maior número é: "  + numero2);
        } 
         else if (numero1 == numero2) {
            System.out.println("os números" + numero1 + "e" + numero2 + " são iguais.");
        } 
    }
}

