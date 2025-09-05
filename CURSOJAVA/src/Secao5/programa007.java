/*
Wesley Elbert Assis
 */

 /*

5 -> Faça uma função e um programa de teste para cálculo do volume de uma esfera.
Sendo que o raio é passado por parâmetro.
V = 4 * PI * R^3
    3

 */
package Secao5;

import java.util.Scanner;

public class programa007 {

    private static float raio;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o raio da esfera: ");
        setRaio(entrada.nextFloat());

        System.out.println("O volume do raio é: " + calculo());
    }

    static float calculo() {

        float volume = 4;
        float PI = (float) 3.141592;

        setRaio((float) (volume * PI * (Math.pow(getRaio(), 3))) / 3);

        return getRaio();
    }

  
    public static float getRaio() {
        return raio;
    }

    public static void setRaio(float aRaio) {
        raio = aRaio;
    }
}
