/*
Wesley Elbert Assis
 */

 /*

13 -> Faça uma função que receba dois valores númericos e um símbolo. Este símbolo
representará a operação que se deseja efetuar com os números. Se o símbolo for + deverá 
ser realizada uma adição, se for - uma subtração, se for / uma divisão e se for * 
será efetuada uma multiplicação.

                CONSUMO          (KM/L)          MENSAGEM
                Menor que          8             Venda o carro!
                 Entre           8 e 12           Econômico!
                Maior que          12            Super ecônomico!

 */
package Secao5;

import java.util.Scanner;

public class programa015 {

    private static float distancia;
    private static float volume;
    private static float consumo;

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual a distância percorrida (km):");
        setDistancia(entrada.nextFloat());

        System.out.println("Volume gasto de combustivel (l):");
        setVolume(entrada.nextFloat());

        mensagem();

    }

    static float mensagem() {
        setConsumo(getDistancia() / getVolume());

        System.out.println("Seu consumo medio é: ");
        System.out.println(getConsumo() + "\n");

        if (getConsumo() < 8) {
            System.out.println("Venda seu carro!");

        } else if (getConsumo() == 8 || getConsumo() <= 12) {
            System.out.println("Econômico");

        } else if (getConsumo() > 12) {
            System.out.println("Super Econômico");

        }

        return getConsumo();

    }

    public static float getDistancia() {
        return distancia;
    }

    public static void setDistancia(float aDistancia) {
        distancia = aDistancia;
    }

    public static float getVolume() {
        return volume;
    }

    public static void setVolume(float aVolume) {
        volume = aVolume;
    }

    public static float getConsumo() {
        return consumo;
    }

    public static void setConsumo(float aConsumo) {
        consumo = aConsumo;
    }
}
