/*
Faça um programa que leia 10 inteiros e imprima sua média.
 */
package Secao3;

import java.util.Scanner;


public class programa006 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
  
        float soma = 0,num,media;
        int cont = 0;
        
        
        while (cont < 10) {            
            num = entrada.nextInt();
            soma = soma + num;
            cont++;
        }
        media = soma / cont;
        System.out.println("A média é: " + media);
        
    }
}
