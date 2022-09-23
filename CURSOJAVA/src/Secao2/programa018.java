/*
 Faça um programa que calcule e mostre a área de um trapézio. Sabe-se que:

A = (BaseMaior + BaseMenor) * altura
    -----------------------
              2

Lembre-se que a base maior e base menor devem ser números maiores que 0.
 */
package Secao2;

import java.util.Scanner;

public class programa018 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int BaseMaior,BaseMenor,Altura,Area;
        
        System.out.println("Digite a Base Maior do Trapézio");
        BaseMaior = entrada.nextInt();
        
        System.out.println("Digite a Base Menor do Trapézio");
        BaseMenor = entrada.nextInt();
        
        System.out.println("Digite a Altura do Trapézio");
        Altura = entrada.nextInt();
        
        if (BaseMaior > 0 && BaseMenor > 0 && Altura > 0) {
             Area = ((BaseMaior + BaseMenor) * Altura)/ 2;
              System.out.println("A Área do Trapézio é: " + Area);
        } else {
             System.out.println("Base Maior,Base Menor e Altura devem ser obrigatoriamente maiores que 0");
        }
        
        
       
        
        
    }
}
