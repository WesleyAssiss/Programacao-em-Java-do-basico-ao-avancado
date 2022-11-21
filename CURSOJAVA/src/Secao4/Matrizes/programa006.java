/*
Wesley Elbert Assis
 */

 /*

6 -> Leia duas matrizes 4x4 e escreva uma terceira com os maiores valores de cada posição
das matrizes lidas.

 */
package Secao4.Matrizes;

import java.util.Scanner;

public class programa006 {

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String RED_BRIGHT = "\033[0;91m";    // RED

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz1[][] = new int[4][4];
        int matriz2[][] = new int[4][4];
        int matriz3[][] = new int[8][8];

        int i;
        int j = 0;

        int pula_linha = 0;
        int pula_linha1 = 0;

        int cont1 = 0;
        int cont2 = 0;

        System.out.println(YELLOW_BOLD + "   ---MATRIZ---   ");
        System.out.println();
        System.out.println(RED_BRIGHT + "OBS: Segue exemplo para a Matriz [4x4]: [Linhas] [Colunas]\n"
                + YELLOW_BOLD + "Número digitado pelo usário:                  1    2   3   4   5\n"
                + RED_BRIGHT + "Resultado dos números digitado pelo usuário: [1]  [2] [3] [4] \n"
                + "                                             [5]...\n");

        System.out.println();
        System.out.println(GREEN_BOLD + "   ---ENTRADA DA PRIMEIRA MATRIZ---   ");
        System.out.println();
        for (int[] matriz11 : matriz1) {
            for (j = 0; j < matriz1.length; j++) {
                System.out.print("Digite na posição " + "[" + (j + 1) + "]" + " os valores da matriz 1: ");
                matriz11[j] = entrada.nextInt();
                pula_linha++;
                if (pula_linha == 4 || pula_linha == 8 || pula_linha == 12) {
                    System.out.println();
                }
            }
        }
        System.out.println();
        System.out.println(GREEN_BOLD + "   ---ENTRADA DA SEGUNDA MATRIZ---   ");

        for (int[] matriz21 : matriz2) {
            for (j = 0; j < matriz2.length; j++) {
                System.out.print("Digite na posição " + "[" + (j + 1) + "]" + " os valores da matriz 2: ");
                matriz21[j] = entrada.nextInt();
                pula_linha1++;
                if (pula_linha1 == 4 || pula_linha1 == 8 || pula_linha1 == 12) {
                    System.out.println();
                }
            }
        }
        System.out.println("\n \n");
        System.out.println(YELLOW_BOLD + "  ----RESULTADO DAS COMPARAÇÕES----  \n");
        for (i = 0; i < matriz1.length; i++) {
            for (j = 0; j < matriz1.length; j++) {

                if (matriz1[i][j] > matriz3[i][j]) {
                    cont1 = matriz1[i][j];

                    System.out.println("Elemento da posição " + "[" + (i + 1) + "]" + "[" + (j + 1) + "]" + " da Matriz 1: " + cont1);
                    if (matriz2[i][j] > matriz3[i][j]) {
                        cont2 = matriz2[i][j];

                        System.out.println("Elemento da posição " + "[" + (i + 1) + "]" + "[" + (j + 1) + "]" + " da Matriz 2: " + cont2);

                    }

                }

                System.out.println();

            }
        }

        System.out.println(GREEN_BOLD + "   ---MAIOR ELEMENTO---   \n");
        if (cont1 > cont2) {
            System.out.println("O maior elemento da posição " + "[" + i + "]" + "[" + j + "]" + " da Matriz 1 é: " + cont1);
        } else {
            System.out.println("O maior elemento da posição " + "[" + i + "]" + "[" + j + "]" + " da Matriz 2 é: " + cont2);
        }
        System.out.println("");

    }
}
