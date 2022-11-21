/*
Wesley Elbert Assis
 */

 /*

9 -> Leia uma matriz de 3x3 elementos. Calcule a soma dos elementos que estão abaixo da 
diagonal principal.

 */
package Secao4.Matrizes;

public class programa009 {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];

        System.out.println("---Matriz Identidade---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Soma dos elementos que estão abaixo da diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
//Observação: Para melhor compreensão, analise um por um dos 4 System.
//System.out.println(i + " = " + j + " ?");// ( = ) -> igual

                matriz[i][j] = ((i <= j)) ? 0 : (i + 1) + (j + 1);
//System.out.print(" " + (i + 1) );//Posição do i               
//System.out.print(" " + (j + 1));// Posição do j               
//System.out.print(" " + ((i < j) || (i == j)));//Onde for true é 0 onde for false é (i + j).

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        System.out.println();

    }

}
