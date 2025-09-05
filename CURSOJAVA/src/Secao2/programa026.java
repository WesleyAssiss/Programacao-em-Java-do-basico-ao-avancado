/*
Leia a distância em KM e a quantidade de litros de gasolina consumidos por um carro em 
um percurso, cacule o consumo em KM/l e escreva uma mensagem de acordo com a tabela abaixo:


Consumo         (KM/L)          Mensagem
1- menor que      8           Venda o carro!
2- entre        8 e 14          Econômico!
3- maior que     12           Super Ecônomico!
 */
package Secao2;

import java.util.Scanner;

public class programa026 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float distancia, volume, consumo;

        System.out.println("Distancia percorrida eh de (km):");
        distancia = entrada.nextFloat();

        System.out.println("Volume gasto de combustivel (l):");
        volume = entrada.nextFloat();

        consumo = distancia / volume;

        System.out.println("Seu consumo medio eh de: ");
        System.out.println(consumo + "\n");

        if (consumo < 8) {
            System.out.println("Venda seu carro!");
        } else if (consumo == 8 && consumo <= 14) {
            System.out.println("Econômico");
        } else if (consumo > 12) {
            System.out.println("Super Econômico");
        }

        System.out.println("\n Obrigado por usar nossos servicos!\n");

    }
}
