/*
 Faça um programa que leia três números inteiros positivos e efetue o cálculo 
de uma das seguinte médias e acordo com  um valor numérico digitado pelo usuário:

(a) Geométrica: 

 */
package Secao2;

import java.util.Scanner;

public class programa028 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float x, y, z;
        
        float Geometrica,
            Ponderada,
            Harmonica,
            Aritmetica;

        System.out.println("Digite o primeiro número");
        x = entrada.nextInt();

        System.out.println("Digite o primeiro número");
        y = entrada.nextInt();

        System.out.println("Digite o primeiro número");
        z = entrada.nextInt();
         
        
        //raiz cúbica
        Geometrica = (float) Math.cbrt(x * y * z);
        
        Ponderada = ((x + 2 * y + 3  * z)  / 6);
        
        Harmonica = (1 / ((1 / x) + (1 / y) + (1 / z))); 
       
        Aritmetica = ((x + y + z )/ 3);
        
        System.out.println("Média Geométrica é : " + Geometrica);
         System.out.println("Média Ponderada é : " + Ponderada);
          System.out.println("Média Harmônica é : " + Harmonica);
           System.out.println("Média Aritmética é : " + Aritmetica);
    }
}
