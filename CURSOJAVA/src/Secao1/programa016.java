/*
Wesley Elbert Assis
*/

package Secao1;


import java.util.Scanner;

public class programa016 {

    public static final String WHITE = "\033[0;37m";   // WHITE
    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float pressao, forca, area;
        float densidade, massa, volume;
        float altura, gravidade;
        float Fluxo_Sanguineo, Variacao_Pressao, Resistencia;
        float Empuxo;

        int opcao;

        System.out.println(BLACK_BOLD + "Escolha qual a opção desejada: \n "
                + WHITE + "1 - Fórmula Pressão \n"
                + WHITE + " 2 - Fórmula Densidade da Solução \n"
                + WHITE + " 3 - Fórmula Pressão Hidrostática \n"
                + WHITE + " 4 - Fórmula Fluxo Sanguineo - Lei de Poiseuille \n"
                + WHITE + " 5 - Fórmula Empuxo exercido por um Fluido - Princípio de Arquimedes \n");

        opcao = entrada.nextInt();

        switch (opcao) {
            case 01:
                System.out.print("Qual o valor da força? : ");
                forca = entrada.nextFloat();

                System.out.print("Qual o valor da Área? : ");
                area = entrada.nextFloat();

                pressao = (float) (forca / area);

                System.out.println(" O valor da Pressão é : " + pressao);
                break;

            case 02:
                System.out.print("Qual o valor da massa? : ");
                massa = entrada.nextFloat();

                System.out.print("Qual o volume?  : ");
                volume = entrada.nextFloat();

                densidade = (float) (massa / volume);

                System.out.println("A Densidade é : " + densidade);
                break;

            case 03:
                System.out.print("Qual o valor da Densidade?  : ");
                densidade = entrada.nextFloat();

                System.out.print("Qual a altura?  : ");
                altura = entrada.nextFloat();

                System.out.print("Qual o valor da gravidade?  : ");
                gravidade = entrada.nextFloat();

                pressao = (float) (densidade * altura * gravidade);
                System.out.println("O valor da Pressão é " + pressao);
                break;

            case 04:
                System.out.print("Qual o valor da Pressão? : ");
                Variacao_Pressao = entrada.nextFloat();

                System.out.print("Qual o valor da Resistencia?  : ");
                Resistencia = entrada.nextFloat();

                Fluxo_Sanguineo = (float) (Variacao_Pressao / Resistencia);
                System.out.println("O Fluxo Sanguineo  é " + Fluxo_Sanguineo);
                break;

            case 05:
                System.out.print("Qual o valor da Densidade? :");
                densidade = entrada.nextFloat();

                System.out.print("Qual o valor do Volume? :");
                volume = entrada.nextFloat();

                System.out.print("Qual o valor da Gravidade? :");
                gravidade = entrada.nextFloat();

                Empuxo = (float) (densidade * volume * gravidade);

                System.out.println("O Valor do Empuxo é:  " + Empuxo);
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}
