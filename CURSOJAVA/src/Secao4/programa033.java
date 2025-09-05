/*
Wesley Elbert Assis
 */

 /*
25->Faça um programa que preencha um vetor de tamanho 100 com os 100 primeiros
naturais que não são multiplos de 7 ou que terminam com 7.
 */
package Secao4;



public class programa033 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {//todos os números inteiros de 0 a 100  
            if (i % 7 == 0) {//o simbolo % tem como resultado o resto da divisão entre 2 números, neste caso i/7  
           
                System.out.println("Múltiplos de 7: " + i);
            }
        }
        System.out.println("\n");
            for (int i = 7; i <= 100; i += 10) {
               System.out.println("Números que terminam com 7: " + i);
        }

    }
}
