/*
Wesley Elbert Assis
 */

 /*

11 -> Elabore uma função que receba três notas de um aluno como parâmetros e uma letra.
Se a letra for A, a função deverá calcular a média aritmetica das notas do aluno; se for
B, deverá calcular a média ponderada, com pesos 5,3 e 2.

 */
package Secao5;

import java.util.Scanner;

public class programa013 {

    private static char opcao;

    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        int nota[] = new int[3];

        for (int i = 0; i < nota.length; i++) {
            System.out.println("Digite a " + (i + 1) + "ª nota: ");
            nota[i] = getEntrada().nextInt();
        }

        System.out.println("   ---Cálculo---   ");
        System.out.println("Digite uma opção: \n"
                + " A -> Média aritmetica\n"
                + " B -> Média ponderada\n");
        setOpcao(getEntrada().next().charAt(0));
        if (getOpcao() == 'A' || getOpcao() == 'a') {
            System.out.println("A média aritmética dos alunos é: " + media_aritmetica(nota[0], nota[1], nota[2]));

        } else if (getOpcao() == 'B' || getOpcao() == 'b') {

            System.out.println("A média ponderada dos alunos é: " + media_ponderada(nota[0], nota[1], nota[2]));
        }
    }

    static float media_aritmetica(int nota1, int nota2, int nota3) {

        int mediaAritmetica;

        mediaAritmetica = (nota1 * nota2 * nota3) / 3;

        return mediaAritmetica;

    }

    static float media_ponderada(int nota1, int nota2, int nota3) {

        int mediaPonderada;

        mediaPonderada = ((nota1 * 5) * (nota2 * 3) * (nota3 * 2)) / 3;

        return mediaPonderada;

    }

    public static char getOpcao() {
        return opcao;
    }

    public static void setOpcao(char aOpcao) {
        opcao = aOpcao;
    }

    public static Scanner getEntrada() {
        return entrada;
    }

    public static void setEntrada(Scanner aEntrada) {
        entrada = aEntrada;
    }

}
