/*
A nota final de um estudante é calculada a partir de três notas atribuídas 
entre o intervalo de 0 a 10, respectivamente, a um trabalho de laboratório,
a uma avaliação semestral e a um exame final. A média das três notas mencionadas
anteriormente obedece aos pesos: 1; Trabalho de Laboratório: 2;Avaliação Semestral
3; Exame Final 5; De acordo com o resultado, mostre na tela se o aluno está reprovado
(média entre 0 e 2,9), de recuperação (entre 3 e 4,9) ou se foi aprovado.
Faça todas as verificações necessárias.
 */
package Secao2;

import java.util.Scanner;

public class programa015 {

    public static void main(String[] args) {

        float media, nota1, nota2, nota3, total;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a nota do Trabalho de Laboratório 0 a 10");
        nota1 = entrada.nextInt();

        System.out.println("Digite a segunda nota da Avaliação Semestral 0 a 10");
        nota2 = entrada.nextInt();

        System.out.println("Digite a terceira nota do Exame Fina 0 a 10");
        nota3 = entrada.nextInt();

        total = nota1 + nota2 + nota3;
        media = total / 3;

        if (media <= 2.9) {

            System.out.println("Você está reprovado ");
        } else if (media <= 4.9) {

            System.out.println("Você está de recuperação ");
        } else {
            System.out.println("Você está de aprovado ");
        }

    }
}
