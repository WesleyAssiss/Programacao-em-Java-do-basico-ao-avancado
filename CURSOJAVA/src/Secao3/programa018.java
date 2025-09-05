/*
Wesley Elbert Assis
*/

/*
Escreva um algoritmo que leia certa quantidade de números e imprima 
o maior deles e quantas vezes o maior número foi lido. A quantidade
de números a serem lidos deve ser fornecida pelo usuário.
 */
package Secao3;

import java.util.Scanner;

public class programa018 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        int n = 10; // tamanho do vetor
        int v[] = new int[n]; // declaração do vetor "v"
        int numero;
        int i; // índice ou posição
        
        System.out.println("Digite a quantidade de números");
        numero = entrada.nextInt();

        for ( i = 0; i < numero; i++) {
             // Entrada de Dados
            System.out.printf("Informe %2do. valor de %d: ", (i + 1), n);
            v[i] = entrada.nextInt();
        }

// Processamento: somar todos os valores, definir o maior e o menor valor
        int soma = 0;
        int menor = v[0]; // v[0] = 1o. valor armazenador no vetor "v"
        int maior = v[0];
        for (i = 0; i < n; i++) {
            soma = soma + v[i];

            if (v[i] < menor) {
                menor = v[i];
            }

            if (v[i] > maior) {
                maior = v[i];
            }
        }

// Saída (resultados)
        System.out.printf("\n");
        for (i = 0; i < n; i++) {
            if (v[i] == menor) {
                System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
            } else if (v[i] == maior) {
                System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
            } else {
                System.out.printf("v[%d] = %2d\n", i, v[i]);
            }
        }

        System.out.printf("\nSoma = %d\n", soma);
    }
}
 
