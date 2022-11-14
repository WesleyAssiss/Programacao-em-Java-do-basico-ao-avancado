/*
Faça um programa que leia um número inteiro positivo N e 
calcule a soma dos N primeiros números naturais.
*/
package Secao3;

import java.util.Scanner;


public class programa017 {
    
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero; //guarda o numero fornecido pelo usuário
        int cont = 1; // contador 
        int soma = 0; // guarda as somas parciais

        System.out.println("Cálculo da soma dos N primeiros números positivos ");
        System.out.println();
        System.out.println("Digite o valor de N: ");
        numero = entrada.nextInt();
        
        
        
        // Cálculo da soma
        
        while (cont <= numero){
            soma = soma + cont;
            cont = cont + 1;
        }
         if (numero < 0) {
            System.err.println("ERRO Digitar apenas valores Positivos");
            System.exit(0);
        }
        System.out.println("A soma dos primeiros inteiros positivos é: " + soma);
       
       
    }
}
