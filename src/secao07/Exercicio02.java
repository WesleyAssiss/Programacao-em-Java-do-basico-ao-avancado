package secao07;

/*
2. Faça um programa que receba a data atual (dia, mês e ano) e exiba na tela no formato textual.
Exemplo: Data 01/01/2024, Imprimir: 1 de janeiro de 2024.
*/
/*
Exercício 2: Exibir Data no Formato Textual

Este programa recebe o dia, mês e ano e usa uma função para formatar
a data completa em formato textual (Ex: 1 de janeiro de 2024). A função é
refatorada para apenas retornar a String formatada, sem imprimir.
*/

import java.util.Scanner;

public class Exercicio02 {
    
    /**
     * Função que formata a data no formato textual: "dia de [nome do mês] de ano".
     *
     * @param dia O dia da data.
     * @param mes O mês da data (1 para Janeiro, 12 para Dezembro).
     * @param ano O ano da data.
     * @return A data formatada em formato textual (Exemplo: "1 de janeiro de 2024").
     */
    public static String formatarDataTextual(int dia, int mes, int ano) {
        // Array para mapear o número do mês para o nome (meses começam no índice 1).
        // Índice 0 é vazio.
        String[] nomesDosMeses = {
            "", "janeiro", "fevereiro", "março", "abril", "maio", "junho", 
            "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };
        
        String nomeMes;

        // Verifica se o mês é válido (entre 1 e 12)
        if (mes >= 1 && mes <= 12) {
            // Obtém o nome do mês usando o array
            nomeMes = nomesDosMeses[mes];
        } else {
            // Caso o mês seja inválido
            nomeMes = "Mês Inválido";
        }

        // Formato textual solicitado: "dia de [nome do mês] de ano"
        return String.format("%d de %s de %d", dia, nomeMes, ano);
    }
    
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("--- Entrada de Data ---");

		System.out.print("Digite o dia atual: ");
		int dia = scanner.nextInt();

		System.out.print("Digite o mês atual (1 a 12): ");
		int mes = scanner.nextInt();

		System.out.print("Digite o ano atual: ");
		int ano = scanner.nextInt();
        
        // Chamando a função para obter a string formatada
		String dataFormatada = formatarDataTextual(dia, mes, ano);

		System.out.println("\nData no formato textual: " + dataFormatada);

		scanner.close();
    }
}