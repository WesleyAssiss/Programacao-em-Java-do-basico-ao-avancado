/*
Wesley Elbert Assis
*/

/*

10 -> Leia uma matriz 3x3 elementos. Calcule a soma dos elementos que estão na diagonal
principal.

*/
package Secao4.Matrizes;

public class programa010 {
    
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
        System.out.println("Soma dos elementos que estão na diagonal principal");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {                             
//Observação: Para melhor compreensão, analise um por um dos 4 System.
//System.out.println(i + " = " + j + " ?");// ( = ) -> igual

                matriz[i][j] = (i == j) ? (i + 1) + (j + 1) : 0;
               
                
              
//              System.out.print(" " + (i + 1) );//Posição do i               
//               System.out.print(" " + (j + 1));// Posição do j               
//               System.out.print(" " + (i == j));//Onde for true é (i + j) onde for false é 0.
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        System.out.println();

    }

}
