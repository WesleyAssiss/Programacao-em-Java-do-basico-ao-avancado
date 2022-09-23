/*
Escreva um programa que, dados dois números inteiros, mostre na tela o maior deles,
assim como a diferença existente entre ambos.
 */
package Secao2;

import java.util.Scanner;

public class programa007 {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);
         
         int numero1,numero2;
         
        System.out.println("Digite o primeiro número : ");
        numero1 = entrada.nextInt();
        
        System.out.println("Digite o segundo número : ");
        numero2 = entrada.nextInt();
        
        if (numero1 > numero2) {
            System.out.println("O maior número é: "  + numero1 + ". A diferença entre eles é: " + (numero1 - numero2));
        } else {
            System.out.println("O maior número é: "  + numero2 + ". A diferença entre eles é: " + (numero2 - numero1));
        } 
    }
}
