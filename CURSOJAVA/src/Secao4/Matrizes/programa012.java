/*
Wesley Elbert Assis
 */

 /*

12 -> Leia uma matriz de 3x3 elementos. Calcule e imprima a sua transposta.

 */
package Secao4.Matrizes;

import java.util.Scanner;

public class programa012 {

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String RED_BRIGHT = "\033[0;91m";    // RED 

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int matriz[][] = new int[3][3];       
        int pula_linha = 0;

        System.out.println(YELLOW_BOLD + "   ---MATRIZ---   ");
        System.out.println();
        System.err.println(RED_BRIGHT + "OBS: Segue exemplo para a Matriz [4x4]: [Linhas] [Colunas]\n"
                + YELLOW_BOLD + "Número digitado pelo usário:                  1    2   3   4   5\n"
                + RED_BRIGHT + "Resultado dos números digitado pelo usuário: [1]  [2] [3] [4] \n"
                + "                                             [5]...\n");

        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite na posição " + "[" + (j + 1) + "]" + " os valores da matriz: ");
                matriz1[j] = entrada.nextInt();
                pula_linha++;
                if (pula_linha == 4 || pula_linha == 8 || pula_linha == 12) {
                    System.out.println();
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
        
        
        System.out.println("\n \n ");
        
        
        System.out.println("   ---Transposta da Matriz---   ");
        for (int i = 0; i < matriz.length; i++) {
            for (int[] matriz1 : matriz) {
                System.out.print("[" + matriz1[i] + "]");
            }
            System.out.println("");
        }

    }
}

