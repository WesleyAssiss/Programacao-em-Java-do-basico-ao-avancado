/*
Wesley Elbert Assis
*/

package Secao1;


import java.util.Scanner;

/*  Faça um programa para ler as dimensões de um terreno (comprimento 𝑐 e largura 𝑙), bem
como o preço do metro do arame 𝑝, então fornecer como saída o custo para cercar este
mesmo terreno*/
public class programa027 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float largura, comprimento, preco, total;

        System.out.println("Qual a largura do terreno: ");
        largura = entrada.nextFloat();

        System.out.println("Qual o comprimento do terreno: ");
        comprimento = entrada.nextFloat();

        System.out.println("Qual o preco do terreno: ");
        preco = entrada.nextFloat();

        total = (comprimento * largura * preco);

        System.out.println("Voce gastara para cercar o terreno: " + total);

    }

}
