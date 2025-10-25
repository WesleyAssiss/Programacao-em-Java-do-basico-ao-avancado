package secao08.Exercicio;

/*
 * CLASSE CONTATO
 * Implementa encapsulamento com atributos privados e métodos públicos
 * para acesso (getters e setters), conforme a POO.
 */
public class Contato {
	
	// Atributos Privados (Encapsulamento) [cite: 4]
	private String nome;
	private String email;
	private String telefone;

	// Construtor Vazio (Padrão)
	public Contato() {
		// Inicializador
	}
	
	// Construtor Parametrizado (Otimização)
	public Contato(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	// =======================================================
	// Métodos Getters e Setters (Acesso Público aos Atributos Privados) [cite: 5]
	// =======================================================
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	// =======================================================
	// Outros Métodos
	// =======================================================

	/**
	 * Imprime os dados completos do contato[cite: 5].
	 */
	public void imprimirDados() {
		System.out.println("--- Dados do Contato ---");
		System.out.println("Nome: " + this.nome);
		System.out.println("E-mail: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}
}