package secao08;

/*
 * CLASSE PESSOA: Modelo de dados para representar uma pessoa.
 */
public class Pessoa {
	
	// Atributos
	String nome;
	String email;
	int anoNascimento;
	
	// Construtor Vazio (Padrão)
	// Chamado em: new Pessoa()
	public Pessoa() {
		// Inicialização básica
	}

	// Construtor Parametrizado
	// Utiliza 'this' para atribuir valores na criação do objeto
	public Pessoa(String nome, String email, int anoNascimento) {
		this.nome = nome;
		this.email = email;
		this.anoNascimento = anoNascimento;
	}
}