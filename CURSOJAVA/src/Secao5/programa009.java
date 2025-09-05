/*
Wesley Elbert Assis
 */

 /*

7 -> Faça uma função que receba uma temperatura em graus Celsius e retorne-a convertida
em graus Fahrenheit. A fórmula de conversão é: F = C * (9.0/5.0) + 32.0, sendo F a 
temperatura em Fahrenheit e C a temperatura em Celsius.

 */
package Secao5;

import java.util.Scanner;

public class programa009 {

    static float Celsius;
    static float Fahrenheit;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("   ----Conversão de Celsius para Fahrenheit----");

        System.out.print("Qual é a temperatura em Celsius: ");
        Celsius = entrada.nextFloat();

        System.out.println("A temperatura convertida para Fahrenheit é: " + conversao() + "°C");
    }

    static float conversao() {

        Fahrenheit = (float) (Celsius * (9.0 / 5.0) + 32);
        return Fahrenheit;

    }
}
