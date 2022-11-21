/*
Wesley Elbert Assis
 */

 /*

14 -> Faça um programa para gerar automaticamente números entre 0 e 99 de uma cartela
de bingo. Sabendo que cada cartela deverá conter 5 linhas de 5 números, gere estes dados
de modo a não ter números repetidos dentro das cartelas. O programa deve exibir na tela
a cartela gerada.

 */
package Secao4.Matrizes;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class programa014 {

    public static void main(String[] args) {

        int matriz[][] = new int[5][5];
        int pula_linha = 0;

        Set<Integer> numeros = new HashSet<>();
        Random aleatorio = new Random();

       for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {   
                int num = aleatorio.nextInt(100);
                numeros.add(num);
               matriz[i][j] = num;
                pula_linha++;
                if (pula_linha == 5 || pula_linha == 10
                        || pula_linha == 15 || pula_linha == 20
                        || pula_linha == 25) {
                    System.out.println();
                }
            }
        }

        System.out.println();
        System.out.println("   ---Valor da Matriz---   \n");
        System.out.println("\nGerando números aleatórios entre 0 e 99 de uma cartela de bingo");
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

    }
}
