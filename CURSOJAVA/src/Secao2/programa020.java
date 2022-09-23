/*
Faça um programa para verificar se um determinado número inteiro e divisível 
por 3 ou 5, mas não simultaneamente pelos dois
 */
package Secao2;

import java.util.Scanner;


public class programa020 {
    public static void main(String[] args) {
        
        Scanner entrada  = new Scanner (System.in);
        int numero;
        
        System.out.println("Digite um número");
        numero = entrada.nextInt();
        
        if (numero % 3 == 0) {
            System.out.println("O número " + numero + " é divisivel por 3");
        } if(numero % 5 == 0) {
             System.out.println("O número " + numero + " é divisivel por 5");
        }else{
             System.out.println("O número não é divisivel por 3 e não é divisel por 5");
        }
    }
}
