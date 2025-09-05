/*
Wesley Elbert Assis
 */

 /*

39-> Escreva um programa que leia um número inteiro positivo n e em seguida imprima
n linhas do chamado Triângulo de Pascal:

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
...

 */
package Secao4;

import java.util.Scanner;

class programa047 {

    public int factorial(int i) {
        if (i == 0) {
            return 1;
        }
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        programa047 pascal = new programa047();

        
        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = Integer.parseInt(entrada.nextLine());         
        int[] vetor = new int[tamanho];  // cria um array com o tamanho especificado
        
 
        System.out.println();
        
      

        for (int i = 0; i <= vetor.length; i++) {
            for (int j = 0; j <= vetor.length - i; j++) {

              
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

               
                System.out.print(
                        " "
                        + pascal.factorial(i)
                        / (pascal.factorial(i - j)
                        * pascal.factorial(j)));
            }

            
            System.out.println();
        }
    }
}
