/*
Wesley Elbert Assis
 */

 /*

15 -> Leia uma matriz 5x10 que se refere respostas de 10 questões de múltiplas escolha,
referente a 5 alunos. Leia também um vetor de 10 posições contendo o gabarito de respostas
que podem ser a,b,c ou d. Seu programa deverá comparar as respostas de cada candidato
com o gabarito e emitir um vetor denominado resultado, contendo a pontuação correspondente
a cada aluno.

 */
package Secao4.Matrizes;

import java.util.Scanner;

public class programa015 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        char gabarito[] = new char[10];
        int resultado[] = new int[10];
        char respA;
        char continuar = 0;
        int nota;
        int alunos = 5;
        int pula_linha = 0;
        
        System.out.println("   ---GABARITO DA PROVA---   ");
         System.out.println();
        System.out.println("Digite o gabarito da prova:\n");
        for (int i = 0; i < gabarito.length; i++) {
            
            do {
                System.out.println("Questao " + (i + 1) + ":");
                gabarito[i] = entrada.next().charAt(0);
                
                 } while (gabarito[i] != 'a' && gabarito[i] != 'b' && gabarito[i] != 'c'
                    && gabarito[i] != 'd' && gabarito[i] != 'e');
        }
        System.out.println();
         System.out.println("   ---RESPOSTAS DOS ALUNOS---   ");
          System.out.println();
        do {
            for (int j = 0; j < alunos; j++) {
                nota = 0;
                System.out.println("Digite as respostas do Aluno: " + (j + 1));

                for (int i = 0; i < gabarito.length; i++) {
                    do {
                        System.out.println("Questao " + (i + 1) + ":");
                        respA = entrada.next().charAt(0);
                         pula_linha++;
                if (pula_linha == 10 || pula_linha == 20 || pula_linha == 30
                        || pula_linha == 40 || pula_linha == 50) {
                    System.out.println();

                }} while (respA != 'a' && respA != 'b' && respA != 'c' && respA != 'd' && respA != 'e');
                    if (respA == gabarito[i]) {
                        nota++;

                    }

                }
                resultado[j] = nota;
            }
            for (int j = 0; j < alunos; j++) {
                System.out.println("ALUNO " +  (j + 1) +   " NOTA = " + resultado[j]);
              

            }
        } while (continuar == '1');
    }
}
