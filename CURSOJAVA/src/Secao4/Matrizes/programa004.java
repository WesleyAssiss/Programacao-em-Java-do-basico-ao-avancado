/*
Wesley Elbert Assis
 */

 /*

4 -> Leia uma matriz 4x4, imprima a matriz e retorne a localização(linha e a coluna)
do maior valor.

 */
package Secao4.Matrizes;

public class programa004 {

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW

    public static void main(String[] args) {
        int matriz[][] = new int[4][4];
        int maior = matriz[0][0];
        int posI = 1;
        int posJ = 1;
       
        int pula_linha = 0;

        System.out.println(YELLOW_BOLD + "   ---Matriz---   \n");
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                System.out.println("Valor [Linha][Coluna]: " + (i + 1) + (j + 1));
            }
            System.out.println();
        }
        System.out.println(YELLOW_BOLD + "   ---Resultado da Matriz---   \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                if (pula_linha == 4 || pula_linha == 8 || pula_linha == 12) {
                    System.out.println();
                }
                pula_linha++;

                System.out.print("[" + (i + 1) + (j + 1) + "]");
            }
        }
        System.out.println("\n \n");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] >= maior) {
                    maior = matriz[i][j];
                    posI = i + 1;
                    posJ = j + 1;
                }
            }

        }
        System.out.println("O maior numero da matriz [i][j] é: " + posI + posJ);
    }
}
