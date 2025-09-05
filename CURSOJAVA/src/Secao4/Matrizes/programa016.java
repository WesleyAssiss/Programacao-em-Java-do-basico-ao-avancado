/*
Wesley Elbert Assis
 */

 /*

16 -> Faça um programa para corrigir uma prova com 10 questões de múltipla escolha
(a,b,c,d ou e) em uma turma com 3 alunos. Cada questão vale 1 ponto. Leia o gabarito, e
para cada aluno leia sua matricula(número inteiro) e suas respostas.Calcule e escreva:
Para cada aluno,escreva sua matricula,suas respostas, e sua nota. O percentual de aprovação
assumindo média 7.0;

 */
package Secao4.Matrizes;

import java.util.Scanner;

public class programa016 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
// contadores
        // controle de equaçoes
        int qtd; //quantidade de alunos
        int resp; //resposta para comparar com o gabarito
        int acertos;//quantidade de acertos
        int maior = 0;//maior nota
        String nome = " ";//nome do aluno q tirou a maior nota
        int not = 0;//nota do aluno
        int apr = 0;// quantidade de aprovados
        int pApr;//porcentagem de aprovados

        int gabarito[] = new int[10];
        String name[] = new String[10];
        int nota[] = new int[10];

        System.out.println("   ---Gabarito---   ".toUpperCase());
        for (int x = 0; x < gabarito.length; x++) {
            System.out.print((x + 1) + "ª questao :");
            gabarito[x] = entrada.nextInt();
        }
        System.out.println();
        System.out.println("Quantidade de alunos");
        qtd = entrada.nextInt();
        System.out.println();

        System.out.println("   ---RESPOSTAS DAS PROVAS---   \n");
        //quantidade de alunos       
        for (int y = 0; y < qtd; y++) {
            System.out.print("Aluno: ");
            name[y] = entrada.next();
            acertos = 0;

            //quantidade de questoes
            for (int x = 0; x < 10; x++) {
                System.out.print((x + 1) + "ª questao :");
                resp = entrada.nextInt();
                if (resp == gabarito[x]) {
                    acertos += 1;

                }

                not = acertos;

            }
            if (not >= 6) {
                apr += 1;
            }
            if (not > maior) {
                nome = name[y];
                maior = not;
            }
        }
        System.out.println();
        System.out.println(nome + " tirou " + maior + " e teve a maior nota");
        pApr = apr * 100 / qtd;

        System.out.println("\n");

        for (int x = 0; x < gabarito.length; x++) {
            if (name[x] != null) {

                System.out.println("Aluno " + name[x] + " nota: " + nota[x]);
            }
        }
        System.out.println();
         System.out.println(pApr + "% foram aprovados ");

    }
}
