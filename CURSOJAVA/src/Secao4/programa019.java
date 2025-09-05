/*
Wesley Elbert Assis
 */

 /*

10-> Faça um programa para ler a nota da prova de 15 alunos e armazene num vetor,
calcule e imprima a média geral.
 */
package Secao4;

import java.util.Scanner;

public class programa019 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int prova[] = new int[15];//Armazenando 15 notas de alunos.
        int cont = 0;
        float soma = 0, media = 0;

        // entrada de dados
        for (int i = 0; i < prova.length; i++) {
            System.out.print("Digite o valor das notas dos alunos: ");
            prova[i] = entrada.nextInt();//Armazenando os números inseridos pelo usuário
            soma += prova[i];//Realizando a soma total dos números inseridos.  
            cont++;
            media = soma / cont; //Divindo a soma total das notas pelo número de notas inseridas para encontrar
                                 // a média total das notas.

        }

        System.out.println();

        System.out.println("A soma total das notas dos alunos é: " + soma);
        System.out.println();
        System.out.println("A média total das notas dos alunos é: " + media);

    }
}
