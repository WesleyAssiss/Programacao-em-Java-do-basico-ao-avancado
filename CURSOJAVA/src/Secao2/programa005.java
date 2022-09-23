/*
Faça um programa que leia um número e,caso ele seja positivo,calcule e mostre:
> O número digitado ao quadrado
> A raiz quadrada do número digitado
 */
package Secao2;

import java.util.Scanner;

public class programa005 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero, raiz_quadrada;

        System.out.println("Digite um número: ");
        numero = entrada.nextInt();

        
        
       
        if (numero >= 0) {
            
            System.out.println("O número digitado ao quadrado é: " + Math.pow(numero,2));
            raiz_quadrada = numero;
            System.out.println("A raiz de " + raiz_quadrada + " é: " + Math.sqrt(raiz_quadrada));

            
        } else {
            System.out.println("Nao existe raiz para número negativos");
        }

    }

}
