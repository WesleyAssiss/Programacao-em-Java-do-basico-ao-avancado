/*
Wesley Elbert Assis
 */

 /*

18 -> Faça um programa que permita ao usuário entrar com uma matriz 3x3 números inteiros.
Em seguida, gere um array unidimensional pela soma dos números de cada coluna da matriz
e mostrar na tela esse array. Por exemplo, a matriz: 

5 -8 10
1  2 15
25 10 7

Vai gerar um vetor, onde cada posição é a soma das colunas da matriz. A primeira posição
será 5 + 1  + 25, e assim por diante:

31 4 32

 */
package Secao4.Matrizes;

import java.util.Scanner;

public class programa018 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int soma_coluna[] =  new int[3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite na posição " + "[" + (j + 1) + "]" + " os valores da matriz: ");
                matriz[i][j] = entrada.nextInt();

                soma_coluna[j] += matriz[i][j];
            }

        }
        System.out.println();
        System.out.println("   ---Valores da matriz sao---   \n");
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("O array formado pela soma das colunas é: ");
        for (int i = 0; i < soma_coluna.length; i++) {
            System.out.println(soma_coluna[i]);
        }
    }
}
