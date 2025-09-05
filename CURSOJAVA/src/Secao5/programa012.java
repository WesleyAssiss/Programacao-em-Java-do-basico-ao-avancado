/*
Wesley Elbert Assis
 */

 /*

10 - > Faça uma função que receba dois números e retorne qual deles é o maior.

 */
package Secao5;

import java.util.Scanner;

public class programa012 {

    private static float num1;
    private static float num2;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        setNum1(entrada.nextFloat());

        System.out.println("Digite o segundo numero: ");
        setNum2(entrada.nextFloat());

        maior();
    }

    static float maior() {
        if (getNum1() > getNum2()) {
            System.out.println("O número " + getNum1() + " é maior do que o número " + getNum2());
            return getNum1();
        } else {
            System.out.println("O número " + getNum2() + " é maior do que o número " + getNum1());
            return getNum2();
        }

    }

    public static float getNum1() {
        return num1;
    }

    public static void setNum1(float aNum1) {
        num1 = aNum1;
    }

    public static float getNum2() {
        return num2;
    }

    public static void setNum2(float aNum2) {
        num2 = aNum2;
    }
}
