/*
Wesley Elbert Assis
 */

/*
9-> Crie um progrma que lê 6 valores inteiros pares e, em seguida, mostre na tela
os valores  lidos na ordem inversa.
*/
package Secao4;

import java.util.Scanner;

public class programa018 {
     public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
        
        // declaração de vetor
        int[] vetor = new int[6];
        
        // entrada de dados
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite um número: ");
            vetor[i] = entrada.nextInt();
        }
        System.out.println();
        // saída de dados
        //Invertendo os numeros de baixo para cima
        for(int i = vetor.length-1; i >= 0; i--){
            if (vetor[i] % 2 == 0) {   
                 System.out.println("Os valores pares lidos na ordem inversa são: " + vetor[i]);
            }     
        }
        
    }
}



