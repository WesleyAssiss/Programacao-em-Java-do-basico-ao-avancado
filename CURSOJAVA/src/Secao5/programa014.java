/*
Wesley Elbert Assis
 */

 /*

12 -> Escreva uma função que receba um número inteiro maior do que zero e retorne
a soma de todos seus algarismo. Por exemplo, ao número 251 corresponderá o valor 8
(2 + 5 + 1). Se o número lido não for maior do que zero, o programa terminará com a 
mensagem "Número Inválido".

 */
package Secao5;

import java.util.Scanner;

public class programa014 {

    private static int num;
    private static int soma = 0;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero:");
        setNum(entrada.nextInt());

        algarismo();
    }

    static int algarismo() {
        if (getNum() > 0) {
            while (getNum() > 0) {
                setSoma(getSoma() + getNum() % 10);
                setNum(getNum() / 10);
            }
            System.out.println("A soma dos algoritmos: " + getSoma());//251 corresponderá o valor 8 (2 + 5 + 1).
            return getSoma();
        } else {
            System.out.println("O numero é inválido");
            return 0;
        }

    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int aNum) {
        num = aNum;
    }

    public static int getSoma() {
        return soma;
    }

    public static void setSoma(int aSoma) {
        soma = aSoma;
    }
}
