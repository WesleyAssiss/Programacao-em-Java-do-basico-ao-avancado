/*
Wesley Elbert Assis
 */

 /*

3-> Faça um programa que preenche uma matriz 4x4 com o produto do valor da linha
e da coluna de cada elemento.Em seguida, imprima na tela a matriz.

 */
package Secao4.Matrizes;



public class programa003 {

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String RED_BRIGHT = "\033[0;91m";    // RED

    public static void main(String[] args) {
        
       

        int matriz[][] = new int[4][4];       
        

        
        System.out.println(YELLOW_BOLD + "   ---Matriz---   \n");
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(GREEN_BOLD + "---Valor do Produto--- \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i + 1) * (j + 1);
                 System.out.print(" [" + matriz[i][j] + "]");
               
            }
            System.out.println();
        }
        System.out.println("\n \n");
    }
}
