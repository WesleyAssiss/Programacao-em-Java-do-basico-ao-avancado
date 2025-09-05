/*
Wesley Elbert Assis
*/

/*
Usando Switch, escreva um programa que leia um inteiro entre 1 e 7 e imprima
o dia da semana correspondente a este número. Isto é, domingo se 1, segunda - feira se 2
e assim por diante.
 */
package Secao2;

import java.util.Scanner;

public class programa016 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        numero = entrada.nextInt();


        
        switch (numero) {
            case 1:
                System.out.println("Domingo");
                break;

            case 2:
                System.out.println("Segunda - Feira");
                break;

            case 3:
                System.out.println("Terça - Feira");
                break;

            case 4:
                System.out.println("Quarta - Feira");
                break;

            case 5:
                System.out.println("Quinta - Feira");
                break;

            case 6:
                System.out.println("Sexta - Feira");
                break;

            case 7:
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Opcãp Inválida");

        }

    }
}
