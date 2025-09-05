package secao04;

import java.util.Scanner;

public class For {
	public static void main(String[] args) {
		int idade;
		String nome;

		try (Scanner teclado = new Scanner(System.in)) {
			
		for(int i = 0; i < 3; i++) {
			// Solicita e lê o nome do usuário
			System.out.print("Informe seu nome: ");
			nome = teclado.nextLine();
			
			// Solicita e lê a idade do usuário
			System.out.print("Informe sua idade: ");
			idade = Integer.parseInt(teclado.nextLine());

			// Imprime a mensagem apenas se a idade for positiva
			if (idade > 0) {
				System.out.println(nome + " tem " + idade + " anos. \n");
				
			
			}
			
			}
		}
	}
}
