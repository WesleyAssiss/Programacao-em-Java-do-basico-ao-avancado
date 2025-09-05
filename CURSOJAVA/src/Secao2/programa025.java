/*
Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado
possui una taxa diferente de imposto sobre o produto (MG 7%; SP 12%; RJ 15%;
MS 8%;) Faça um programa em que o usuário entre com o valor e o estado destino do
produto e o programa retorne o preço final do produto acrescido do imposto do estado
em que ele será vendido. Se o estado digitado não for válido, mostrar uma mensagem de erro.
 */
package Secao2;

import java.util.Scanner;

public class programa025 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int opcao;
        int valor;
        float total_produto;

        System.out.println("Qual o valor do produto? ");
        valor = entrada.nextInt();

        System.out.println("Para qual Estado o produto irá? \n"
                + " 1 - MG \n"
                + " 2 - SP \n"
                + " 3 - RJ \n"
                + " 4 - MS ");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:

                total_produto = (float) (valor * 0.07) + valor;

                System.out.println("O valor do produto é : " + total_produto);

                break;

            case 2:

                total_produto = (float) (valor * 0.12)+ valor;

                System.out.println("O valor do produto é : " + total_produto);

                break;

            case 3:

                total_produto = (float) (valor * 0.15)+ valor;

                System.out.println("O valor do produto é : " + total_produto);

                break;

            case 4:

                total_produto = (float) (valor * 0.08)+ valor;

                System.out.println("O valor do produto é : " + total_produto);

                break;

            default:
                System.out.println("Número digitado inválido");
        }
    }
}
