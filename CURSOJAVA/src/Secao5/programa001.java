/*
Wesley Elbert Assis
 */

 /*

Faça um programa que receba diversos nomes de frutas do usuário
e no final imprima essas frutas em ordem contrária. O programa deve
solicitar ao usuário quantas frutas ele quer informar.

Informe a quantidade:
2

Informe o nome de uma fruta:
Goiaba 
Manga
 */
package Secao5;

import java.util.Scanner;

public class programa001 {
    //Variáveis Globais
    //Declaração do vetor
    static String frutas[];
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        //Variavel local
        int qtd;

        System.out.println("Informe a quantidade de frutas para cadastrar: ");
        qtd = Integer.parseInt(entrada.nextLine());

        cadastrar_dados(qtd);
        mostrar_dados(qtd);
        
        entrada.close();
    }

    /*
    Uma função deve ter o seguinte:
    a) Tipo de retorno (Tipo de dado que a função vai retornar)
    b) Nome; (Corresponde a ação que a função realiza)
    c) Parâmetros/Argumentos de entrada(Opcional)
    d) Retorno(Opcional = depende do tipo de retorno)
     */
    //void = vazio (sem retorno)
    static void cadastrar_dados(int quantidade) {
        //Definindo o tamanho do vetor
        frutas = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {// i++ -> i = i + 1;
            System.out.println("Informe a " + (i + 1) + " fruta: ");
            frutas[i] = entrada.nextLine();
        }

    }

    static void mostrar_dados(int quantidade) {

        for (int i = (quantidade - 1); i >= 0; i--) {//i-- -> i = i - 1;
            System.out.println(frutas[i]);

        }
    }
}
