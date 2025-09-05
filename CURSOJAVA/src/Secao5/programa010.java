/*
Wesley Elbert Assis
 */

 /*

8 -> Sejam a e b os catetos de um triângulo, onde a hipotenusa é obtida pela equação:
hipotenusa = ( RAIZ (a^2) + (b^2) ). Faça uma função que receba os valores de a e b e 
calcule o valor da hipotenusa através da equação.

 */
package Secao5;

import java.util.Scanner;

public class programa010 {

    private static float a;
    private static float b;
    private static float hipotenusa;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        setA(entrada.nextFloat());

        System.out.println("Digite o valor de B: ");
        setB(entrada.nextFloat());

        System.out.println("O valor da hipotenusa é: " + hipotenusa());

    }

    static float hipotenusa() {
        setHipotenusa((float) Math.hypot(getA(), getB()));
        return getHipotenusa();
    }

    public static float getA() {
        return a;
    }

    public static void setA(float aA) {
        a = aA;
    }

    public static float getB() {
        return b;
    }

    public static void setB(float aB) {
        b = aB;
    }

    public static float getHipotenusa() {
        return hipotenusa;
    }

    public static void setHipotenusa(float aHipotenusa) {
        hipotenusa = aHipotenusa;
    }
}
