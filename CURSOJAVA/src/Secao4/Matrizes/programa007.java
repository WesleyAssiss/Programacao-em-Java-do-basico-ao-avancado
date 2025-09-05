/*
Wesley Elbert Assis
 */

 /*

7 -> Gerar e imprimir uma matriz de tamanho 10x10, onde seus elementos são da forma:
A[i][j] = 2i + 7j - 2 se i < j;
A[i][j] = 3i^2 - 1 se i = j;
A[i][j] = 4i^3 - 5j^2 + 1 se i > j.

 */
package Secao4.Matrizes;

public class programa007 {

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String RED_BRIGHT = "\033[0;91m";    // RED

    public static void main(String[] args) {

        int matriz[][] = new int[10][10];
        int pula_linha = 0;
        System.out.println("           ---MATRIZ--- \n"
                + " matriz[i][j] = 2i + 7j - 2 se i < j \n"
                + " matriz[i][j] = 3i^2 - 1 se i = j \n"
                + " matriz[i][j] = 4i^3 - 5j^2 + 1 se i > j \n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
             
                if (i < j) {
                    matriz[i][j] = 2 * i + 7 * j - 2;
                    System.out.println(" i:[" + i + "]" + " j:" + "[" + j + "]" + " -> Matriz i < j = " + matriz[i][j]);

                } else if (i == j) {
                    matriz[i][j] = 3 * i ^ 2 - 1;
                    System.out.println(" i:[" + i + "]" + " j:" + "[" + j + "]" + " -> Matriz i == j = " + matriz[i][j]);

                } else if (i > j) {
                    matriz[i][j] = 4 * i ^ 3 - 5 * j ^ 2 + 1;
                    System.out.println(" i:[" + i + "]" + " j:" + "[" + j + "]" + " -> Matriz i > j = " + matriz[i][j]);
                }
                pula_linha++;
                if (pula_linha == 10 || pula_linha == 20 || pula_linha == 30
                        || pula_linha == 40 || pula_linha == 50 || pula_linha == 60
                        || pula_linha == 70 || pula_linha == 80 || pula_linha == 90 || pula_linha == 100) {
                    System.out.println();
                }

            }
        }
        System.out.println();
        System.out.println(YELLOW_BOLD + "    ---Resultado da Matriz---   \n");
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println(GREEN_BOLD + "      ----Matriz 10x10----      \n");
    }
}
