package secao08.Exercicio;

import java.util.Arrays;

/*
 * CLASSE AGENDA
 * Armazena objetos Contato e gerencia as operações de inclusão,
 * remoção, busca e impressão.
 */
public class Agenda {
	
	private Contato[] contatos;
	private int ultimoIndex = 0; // Controla a próxima posição livre no vetor

	// Construtor: Cria uma agenda com capacidade para 10 contatos
	public Agenda() {
		// Define o tamanho inicial do vetor de Contatos
		this.contatos = new Contato[10]; 
	}
	
	// =======================================================
	// Operações da Agenda
	// =======================================================
	
	/**
	 * Armazena um novo contato na primeira posição livre da agenda.
	 * @param contato O objeto Contato a ser armazenado. [cite: 8]
	 */
	public void armazenarContato(Contato contato) {
		if (ultimoIndex < contatos.length) {
			this.contatos[ultimoIndex] = contato;
			ultimoIndex++; // Avança para a próxima posição
			System.out.println("Contato '" + contato.getNome() + "' armazenado com sucesso.");
		} else {
			System.out.println("Agenda cheia. Não é possível armazenar mais contatos.");
		}
	}

	/**
	 * Remove um contato da agenda (Busca por objeto/referência). [cite: 9]
	 * @param contato O objeto Contato a ser removido.
	 */
	public void removeContato(Contato contato) {
		int index = buscaContato(contato.getNome()); // Busca o contato pelo nome
		
		if (index != -1) {
			// Move os elementos para trás para cobrir o espaço vazio
			for (int i = index; i < ultimoIndex - 1; i++) {
				this.contatos[i] = this.contatos[i + 1];
			}
			this.contatos[ultimoIndex - 1] = null; // Limpa a última posição
			ultimoIndex--; // Diminui o contador de contatos
			System.out.println("Contato '" + contato.getNome() + "' removido com sucesso.");
		} else {
			System.out.println("Erro: Contato não encontrado para remoção.");
		}
	}
	
	/**
	 * Informa em que posição da agenda está o contato. [cite: 10]
	 * @param nome O nome do contato a ser buscado.
	 * @return O índice do contato na agenda ou -1 se não for encontrado.
	 */
	public int buscaContato(String nome) {
		for (int i = 0; i < ultimoIndex; i++) {
			if (this.contatos[i].getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return -1; // Não encontrado
	}

	/**
	 * Imprime os dados de todos os contatos da agenda. [cite: 11]
	 */
	public void imprimeAgenda() {
		System.out.println("\n--- Imprimindo Agenda Completa (" + ultimoIndex + " contatos) ---");
		if (ultimoIndex == 0) {
			System.out.println("A agenda está vazia.");
			return;
		}
		
		for (int i = 0; i < ultimoIndex; i++) {
			System.out.println("Posição [" + i + "]:");
			this.contatos[i].imprimirDados();
		}
	}

	/**
	 * Imprime os dados do contato que está no índice informado. [cite: 12]
	 * @param index O índice do contato a ser impresso.
	 */
	public void imprimeContato(int index) {
		System.out.println("\n--- Imprimindo Contato por Índice (" + index + ") ---");
		if (index >= 0 && index < ultimoIndex) {
			this.contatos[index].imprimirDados();
		} else {
			System.out.println("Erro: Índice inválido ou posição vazia.");
		}
	}
}