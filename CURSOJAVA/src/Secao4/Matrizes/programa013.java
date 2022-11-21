/*
Wesley Elbert Assis
 */

 /*

13 -> Gere matriz 4x4 com valores no intervalo [1,20]. Escreva um programa que transforme
a matriz gerada numa matriz triangular inferior, ou seja, atribuindo zero a todos os 
elementos acima da diagonal principal. Imprima a matriz original e a matriz transformada.

 */
package Secao4.Matrizes;



public class programa013 {

    static void imprime(int matriz[][]) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matriz[i][j]);
                System.out.println("");
            }
            System.out.println("");
        }
        System.out.println("");

    }

    public static void main(String[] args) {

        //Declarar,definir o tamanho e inicializar
        int matriz[][] = {{1, 2, 3, 4},
        {4, 5, 6, 7},
        {8, 9, 5, 2},
        {2, 3, 6, 9}};
        

        System.out.println();
        System.out.println("   ---Matriz Original---   \n");
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j > i) {
                    matriz[i][j] = 0;

                } else {

                }

            }
        }
        System.out.println();
        System.out.println("Triangular inferior zerando o que está acima da diagonal principa\n");
        System.out.println("   ---Resultado da matriz Triangular Inferior---   \n");
        for (int i = 0; i < matriz.length; ++i) {
            for (int j = 0; j < matriz.length; ++j) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}
