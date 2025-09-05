/*
Wesley Elbert Assis
*/

/*
Faça um programa que receba a altura e o sexo de uma pessoa e calcule 
e mostre seu peso ideal, utilizando as seguintes fórmulas (onde H ocorre à altura)
Homens (72.7 * H ) - 58
Mulheres (62.1 * H) - 44.7
 */
package Secao2;

import java.util.Scanner;

public class programa011 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

       


        
        float altura, peso;
        char sexo;    
        float resultado;

        System.out.println("Qual a sua altura");
        altura = entrada.nextFloat();

        System.out.println("Digite seu peso:");
        peso = entrada.nextFloat();

        System.out.println("Digite seu sexo [F] ou [M]:");
        sexo = entrada.next().charAt(0);

        if (sexo == 'M' || sexo == 'm' ) {
            resultado = (float) ((72.7 * altura) - 58);
            System.out.println("O seu peso ideal e: " + resultado);

        } else if (sexo == 'F' || sexo == 'f') {

            resultado = (float) ((62.1 * altura) - 44.7);
            System.out.println("O seu peso ideal e: " + resultado);
        }

    }

}
