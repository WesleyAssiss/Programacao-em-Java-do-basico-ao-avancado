/*
Matrizes
 */
package Secao4;

public class programa009 {

    public static void main(String[] args) {
        //Matriz 3x3 -> 3 linhas e 3 colunas
        int numeros[][] = new int[3][3];

        numeros[0][0] = 1;
        numeros[0][1] = 3;
        numeros[0][2] = 5;

        numeros[1][0] = 7;
        numeros[1][1] = 9;
        numeros[1][2] = 11;

        numeros[2][0] = 13;
        numeros[2][1] = 15;
        numeros[2][2] = 17;

        //System.out.println(numeros[1][2]);
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                 System.out.println("Números[" + i + "][" + j + "] = " + numeros[i][j]);
                 
                numeros[i][j] = i + j * 2;
                
            }
        }
        System.out.println("\n");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                
                System.out.println("Números[" + i + "][" + j + "] = " + numeros[i][j]);

            }
        }

    }
}
