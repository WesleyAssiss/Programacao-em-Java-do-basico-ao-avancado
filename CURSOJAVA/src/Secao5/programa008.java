/*
Wesley Elbert Assis
 */

 /*

6 -> Faça uma função que receba 3 números inteiros como parâmetro, representando horas,
minutos e segundos, e os converta em segundos.

 */
package Secao5;

import java.util.Scanner;

public class programa008 {

    private static int tempo;
    private static int horas;
    private static int minutos;
    private static int segundos;

    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a hora");
        setHoras(entrada.nextInt());
        System.out.println("Digite os minutos");
        setMinutos(entrada.nextInt());
        System.out.println("Digite os segundos");
        setSegundos(entrada.nextInt());

        System.out.println("O total de segundos são: " + segundos() + " segundos");
    }

    static float segundos() {

        setTempo(getSegundos() + (getMinutos() * 60) + (getHoras() * 60 * 60));
        return getTempo();
    }

    public static int getTempo() {
        return tempo;
    }

    public static void setTempo(int aTempo) {
        tempo = aTempo;
    }

    public static int getHoras() {
        return horas;
    }

    public static void setHoras(int aHoras) {
        horas = aHoras;
    }

    public static int getMinutos() {
        return minutos;
    }

    public static void setMinutos(int aMinutos) {
        minutos = aMinutos;
    }

    public static int getSegundos() {
        return segundos;
    }

    public static void setSegundos(int aSegundos) {
        segundos = aSegundos;
    }

}
