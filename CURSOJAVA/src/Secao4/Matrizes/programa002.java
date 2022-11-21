/*
Wesley Elbert Assis
 */

 /*

2-> Declare uma matriz 5x5. Preencha com 1 a diagonal principal e com 0 os demais
elementos.Escreva ao final a matriz obtida.

 */
package Secao4.Matrizes;



public class programa002 {

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String RED_BRIGHT = "\033[0;91m";    // RED

    public static void main(String[] args) {
        

        int matriz[][] = new int[5][5];
        
        
        
        System.out.println("---Matriz Identidade---");
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {

                //Observação: Para melhor compreensão, analise um por um dos 3 System.
                /*
                System.out.print(" " + i );//Posição do i               
                System.out.print(" " + j);// Posição do j               
                System.out.print(" " + (i == j));//Onde for true é 1 onde for false é 0.
                 */
                
                
                //Matriz[i][j] recebe 1 quando i e j for igual
                //caso contrário recebe o valor 0;               
                matriz[i][j] = (i == j) ? 1 : 0;
                System.out.print("[" + matriz[i][j] + "]");
            }

            System.out.println();
        }

    }
}
