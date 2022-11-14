/*
Wesley Elbert Assis
 */

/*
11-> Faça um programa que preencha um vetor com 10 números reais, calcule e mostre
a quantidade de números negativos e a soma dos números positivos desse vetor.

*/
package Secao4;

import java.util.Scanner;

public class programa020 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num[] = new float[10];
        int cont0 = 0,cont1 = 0;
        float numNeg = 0, numPos = 0;
        int qtdNeg = 0, qtdPos = 0;

        // entrada de dados
        for (int i = 0; i < num.length; i++) {
            System.out.print("Digite um número: ");
            num[i] = entrada.nextFloat();//Armazenando os números inseridos pelo usuário
        }
           for (int i = 0; i < num.length; i++) {
               if (num[i] < 0) {                  
                   numNeg += num[i];
                   cont0++;
                   qtdNeg = cont0;
               }
           }
            for (int i = 0; i < num.length; i++) {
               if (num[i] > 0) {   
                   numPos += num[i];
                   cont1++;
                   qtdPos = cont1;
               }
            
        }

        System.out.println();

        System.out.println("A quantidade de números negativos é: " + qtdNeg);
        System.out.println("A soma dos números negativos desse vetor é: " + numNeg);
        
        System.out.println();
        System.out.println();
        
        System.out.println("A quantidade de números positivos é: " + qtdPos);
        System.out.println("A soma dos números positivos desse vetor: é: " + numPos);
        

    }
} 

