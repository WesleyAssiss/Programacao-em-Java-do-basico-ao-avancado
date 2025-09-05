/*
Receba os dados do usuário enquanto a idade for maior que 0
*/

package secao04;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// A variável 'idade' precisa ser inicializada para entrar no loop
		int idade;
		String nome;

		// Cria o objeto Scanner
		try (Scanner teclado = new Scanner(System.in)) {

			// Primeiro laço para solicitar o nome e idade
			System.out.print("Informe seu nome: ");
			nome = teclado.nextLine();

			System.out.print("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());

			// O laço while executa enquanto a idade for positiva
			while (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos.");

				// Solicita novos dados para a próxima iteração
				System.out.print("Informe seu nome: ");
				nome = teclado.nextLine();

				System.out.print("Informe sua idade: ");
				idade = Integer.parseInt(teclado.nextLine());
			}

		}
	}
}