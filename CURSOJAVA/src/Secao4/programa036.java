/*
Wesley Elbert Assis
 */

 /*
​28-> Leia 10 números inteiros e armazene em um vetor.Em seguida escreva os elementos
que são primos e suas respectivas posições no vetor.
 */
package Secao4;

import java.util.Scanner;

public class programa036 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetor[] = new int[10];

        //ler valores para o primeiro vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor: ");
            vetor[i] = entrada.nextInt();
        }
        for (int i = 0; i < vetor.length; i++) {
            if (numPrimo(vetor[i])) {
                System.out.println(vetor[i] + " é primo. Posição no vetor: [" + i + "]");
            }
        }
    }

    private static boolean numPrimo(int vetor) {
        for (int j = 2; j < vetor; j++) {
            if (vetor % j == 0) {
                return false;
            } else if (vetor % j == 1) {
                return true;
            }

        }
        return true;
    }
}
/*
        for (int i = 0; i < vetor.length; i++) {
            if (numPrimo(vetor[i])) {
                System.out.println(vetor[i] + " é primo. Posição no vetor: [" + i + "]");
            }
        }
    }

    private static boolean numPrimo(int vetor) {
        for (int j = 2; j < vetor; j++) {        
            if (vetor % j == 0) {
                return false;
            } else if (vetor % j == 1){   
                return true;
            }

        }
        return true;
    }
}
 */
