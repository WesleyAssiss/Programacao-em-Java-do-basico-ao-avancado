/*
Wesley Elbert Assis
 */

 /*
12-> fazer um programa para ler 5 valores e, em seguida, mostrar todos os valores 
lidos juntamente com o maior e menor e a média dos valores e mostrar a posição
onde se encontram o maior e o menor valor.
 */
package Secao4;

import java.util.Scanner;

public class programa021 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int vetor[] = new int[5];
        int maior = -999999999, menor = 999999999;
        int posicao = 0, posicao1 = 0;
        float media = 0, soma = 0;
        int cont = 0;

        // entrada de dados
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor dos números: ");
            vetor[i] = entrada.nextInt();//Armazenando os números inseridos pelo usuário
            soma += vetor[i];//Realizando a soma total dos números inseridos.  
            cont++;
            media = soma / cont; //Divindo a soma total das notas pelo número de notas inseridas para encontrar
            // a média total das notas.

        }

        //Realizando o teste de qual o maior número e onde ele está posicionado no vetor.
        //Lembrando o vetor começa do 0.
        for (int i = 0; i < vetor.length; i++) {

            //Realizando o teste de qual o menor número e onde ele está posicionado no vetor.
            //Lembrando o vetor começa do 0.
            for (int j = 0; j < vetor.length; j++) {

                if (vetor[i] > maior) {
                    posicao = i;
                    maior = vetor[i];

                    System.out.println("Números[" + i + "] = " + maior);//Para ficar mais fácil a vizualização
                    // da posição do vetor e se o resultado
                    //está correto.
                }

                if (vetor[j] < menor) {
                    posicao1 = j;
                    menor = vetor[j];

                }

            }
        }

        System.out.println();

        System.out.println("O maior número é: " + maior + ". A posição do vetor é: " + posicao);//Imprimindo o maior número e sua posição.
        System.out.println("O menor número é: " + menor + ". A posição do vetor é: " + posicao1);//Imprimindo o menor número e sua posição.
        System.out.println("A soma total dos números é: " + soma);//Imprimindo o menor número e sua posição.
        System.out.println("A média dos números é: " + media);//Imprimindo o menor número e sua posição.
        System.out.println();

    }
}
