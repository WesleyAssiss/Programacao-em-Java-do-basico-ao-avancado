/*
Wesley Elbert Assis
 */

 /*

9 -> Faça um função que receba a altura e o raio de um cilindro circular e retorne
o volume do cilindro. O volume de um cilindro é calculado por meio da seguinte
fórmula: V = PI * raio^2 * altura, onde PI = 3.141592

 */
package Secao5;


import java.util.Scanner;

public class programa011 {

    private static float raio;
    private static float altura;
    private static float PI = (float) 3.141592;
    private static float volume;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a altura do cilindro: ");
        setAltura(entrada.nextFloat());
        System.out.print("Digite o raio do cilindro: ");
        setRaio(entrada.nextFloat());

        calculo();
    }

    static float calculo() {

        setVolume((float) (getPI() * Math.pow(getRaio(), 2) * getAltura()));

        System.out.println("O valor do volume do Cilindro é: " + getVolume());
        return getVolume();
    }

    public static float getVolume() {
        return volume;
    }

    public static void setVolume(float aVolume) {
        volume = aVolume;
    }

    public static float getRaio() {
        return raio;
    }

    public static void setRaio(float aRaio) {
        raio = aRaio;
    }

    public static float getAltura() {
        return altura;
    }

    public static void setAltura(float aAltura) {
        altura = aAltura;
    }

    public static float getPI() {
        return PI;
    }

    public static void setPI(float aPI) {
        PI = aPI;
    }
}
