package secao08;

/*
 * PROGRAMA02: Demonstra a criação de objetos (instanciação)
 * das classes Produto e Pessoa e a chamada de métodos,
 * utilizando construtores e o conceito de 'this'.
 */
public class Programa02 {

	public static void main(String[] args) {
		
		// --- 1. Instanciando a Classe Produto ---
		
		// Criação Otimizada: Usando o construtor parametrizado para Produto
		Produto produtoOtimizado = new Produto("Teclado Mecânico RGB", 550.0f, 12.5f);
		
		System.out.println("===== Produto Otimizado =====");
		System.out.println("Nome: " + produtoOtimizado.nome);
		System.out.println("Preço Original: R$ " + produtoOtimizado.preco);
		System.out.println("Desconto: " + produtoOtimizado.desconto + "%");
		
		// Demonstrando o método que usa 'this'
		System.out.println("Preço Final (c/ desconto): R$ " + produtoOtimizado.precoComDesconto());
		
		// Chamada do método para aumentar o preço
		produtoOtimizado.aumentarPreco(25.0f);
		
		System.out.println("\n(Após aumento de R$ 25,00)");
		System.out.println("Novo Preço: R$ " + produtoOtimizado.preco);
		System.out.println("Novo Preço Final: R$ " + produtoOtimizado.precoComDesconto());

		
		// --- 2. Instanciando a Classe Pessoa ---
		
		// Criação Otimizada: Usando o construtor parametrizado para Pessoa
		Pessoa pessoaOtimizada = new Pessoa("Ana Paula", "ana.paula@teste.com", 2000);
		
		System.out.println("\n===== Pessoa Otimizada =====");
		System.out.println("Nome: " + pessoaOtimizada.nome);
		System.out.println("E-mail: " + pessoaOtimizada.email);
		System.out.println("Ano de Nascimento: " + pessoaOtimizada.anoNascimento);
	}

}