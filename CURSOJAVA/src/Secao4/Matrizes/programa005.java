/*
Wesley Elbert Assis
 */

 /*

5 -> Leia uma matriz 5x5. Leia também um valor X. O programa deverá fazer uma busca
desse valor na matriz e, ao final, escrever a localização(linha e coluna) ou uma mensagem
de "não encontrado".

 */
package Secao4.Matrizes;

import java.util.Scanner;

public class programa005 {

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW

    public static void main(String[] args) {
        int matriz[][] = new int[5][5];
        Scanner entrada = new Scanner(System.in);

        /*verificador para dizer se o número foi encontrado ou não*/
        char verificador = 'n';
        /*variáveis para o armazenamento das linhas e colunas.*/
        int linha = 0;
        int coluna = 0;
        int pula_linha = 0;
        int num;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Digite na posição " + "[" + (j + 1) + "]" + " os valores da matriz: ");
                matriz[i][j] = entrada.nextInt();
                pula_linha++;
                if (pula_linha == 5 || pula_linha == 10 || pula_linha == 15 || pula_linha == 20) {
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

        /*entrada do número a ser procurado*/
        System.out.print("Entre com o numero a ser procurado: ");
        num = entrada.nextInt();
        System.out.println("");

        /*verificar em toda matriz o valor procurado, caso encontrado armazanar sua linha e coluna
	   Também alterar o verificar para s*/
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (matriz[i][j] == num) {
                    linha = i + 1;
                    coluna = j + 1;
                    verificador = 's';
                }
            }
        }

        /*se o número foi encontrado(verificador == 's'), imprima a linha e coluna em que o número esta armazenado
	  caso contrário imprima "número não encontrado"*/
        if (verificador == 's') {
            System.out.println("Numero " + num + " encontrado na linha " + linha
                    + " e coluna " + coluna);
        } else {
            System.out.println("Numero nao encontrado");
        }

    }

}
