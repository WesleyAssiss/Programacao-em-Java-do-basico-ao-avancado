package secao08.Exercicio;

/*
 * EXERCICIO 01: Programa principal que testa a classe Contato.
 * Cria, manipula e imprime os dados de um objeto.
 * 
 * 1. Crie uma classe para representar um contato, com os atributos privados de nome, email e telefone. 
 * Crie os métodos públicos necessários para sets e gets e também um método para imprimir os dados
 * de uma pessoa.
 */
public class Exercicio01 {

	public static void main(String[] args) {
		
		// 1. Instanciando o objeto Contato usando o construtor parametrizado 
		Contato contato1 = new Contato("Wesley Assis", "wesley@email.com", "(31) 99876-5432");
		
		System.out.println("### Teste 1: Dados Originais ###");
		contato1.imprimirDados();
		
		
		// 2. Demonstrando o uso de Setters para modificar dados [cite: 5]
		System.out.println("\n### Teste 2: Modificando dados (Setters) ###");
		
		contato1.setEmail("novo_email_wesley@dominio.com");
		contato1.setTelefone("N/A"); // Telefone removido

		System.out.println("Novo E-mail (via get): " + contato1.getEmail());
		System.out.println("Novo Telefone (via get): " + contato1.getTelefone());
		
		
		// 3. Imprimindo os dados modificados [cite: 5]
		System.out.println("\n### Teste 3: Dados Modificados ###");
		contato1.imprimirDados();
	}

}