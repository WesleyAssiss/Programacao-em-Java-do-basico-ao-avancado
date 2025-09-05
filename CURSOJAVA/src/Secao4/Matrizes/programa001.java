/*
Wesley Elbert Assis
 */

 /*

1 -> Leia uma matriz 4x4, conte e escreva quantos valores maiores que 10 ela possui

 */
package Secao4.Matrizes;

import java.util.Scanner;

public class programa001 {

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String RED_BRIGHT = "\033[0;91m";    // RED

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int[4][4];
        int maior[][] = new int[4][4];
        int cont = 0;
        int pula_linha = 0;

        System.out.println(YELLOW_BOLD + "   ---MATRIZ---   ");
        System.out.println();
        System.err.println(RED_BRIGHT + "OBS: Segue exemplo para a Matriz [4x4]: [Linhas] [Colunas]\n"
                + YELLOW_BOLD + "Número digitado pelo usário:                  1    2   3   4   5\n"
                + RED_BRIGHT + "Resultado dos números digitado pelo usuário: [1]  [2] [3] [4] \n"
                + "                                             [5]...\n");

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite na posição " + "[" + (j + 1) + "]" + " os valores da matriz: " );
                matriz1[j] = entrada.nextInt();
                pula_linha++;
                if (pula_linha == 4 || pula_linha == 8 || pula_linha == 12) {
                    System.out.println();
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] > 10) {
                    maior[i][j] = matriz[i][j];
                    cont++;
                } else {
                    maior[i][j] = 0;

                }
            }
        }
        System.out.println();
        System.out.println(YELLOW_BOLD + "   ---Valores da matriz sao---   \n");
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println(GREEN_BOLD + "   ---Valores maiores que 10 sao---   \n");
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                System.out.print("[" + maior[i][j] + "]");
            }

            System.out.println();
        }
        System.out.println();
        System.out.println(GREEN_BOLD + "Quantidade de valores maiores que 10: " + cont);

    }

}
