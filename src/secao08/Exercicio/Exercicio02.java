package secao08.Exercicio;

/*
 * EXERCICIO 02: Programa principal que testa a classe Agenda.
 * Demonstra as operações de armazenar, buscar, remover e imprimir.
 * 
 * 2. Crie uma classe Agenda que pode armazenar contatos, podendo realizar as seguintes operações:
- void armazenarContato(Contato contato);
- void removeContato(Contato contato);
- int buscaContato(String nome); // Informa em que posição da agenda está o contato.
- void imprimeAgenda(); // Imprime os dados de todos os contatos da agenda.
- void imprimeContato(int index); // Imprime os dados do contato que está no índice informado.
 */
public class Exercicio02 {

	public static void main(String[] args) {
		
		// Criação da Agenda
		Agenda minhaAgenda = new Agenda();
		
		// 1. Criação e Armazenamento de Contatos
		Contato c1 = new Contato("Ana Silva", "ana.s@email.com", "1111-1111");
		Contato c2 = new Contato("Bruno Costa", "bruno.c@email.com", "2222-2222");
		Contato c3 = new Contato("Carlos Souza", "carlos.s@email.com", "3333-3333");
		
		minhaAgenda.armazenarContato(c1);
		minhaAgenda.armazenarContato(c2);
		minhaAgenda.armazenarContato(c3);

		// Imprime todos os contatos
		minhaAgenda.imprimeAgenda();

		// 2. Busca de Contato
		String nomeBusca = "Bruno Costa";
		int indexBusca = minhaAgenda.buscaContato(nomeBusca); // Informa em que posição da agenda está o contato. [cite: 10]
		
		System.out.println("\n--- Teste de Busca ---");
		if (indexBusca != -1) {
			System.out.println("O contato '" + nomeBusca + "' foi encontrado no índice: " + indexBusca);
		} else {
			System.out.println("Contato não encontrado.");
		}
		
		// 3. Imprime Contato por Índice
		minhaAgenda.imprimeContato(1); // Índice do Bruno [cite: 12]
		
		// 4. Remoção de Contato
		minhaAgenda.removeContato(c2); // Remove Bruno [cite: 9]
		
		// Imprime Agenda após a remoção para verificar
		minhaAgenda.imprimeAgenda();
		
		// Tenta buscar o contato removido
		System.out.println("\n--- Teste de Busca Pós-Remoção ---");
		System.out.println("Busca por 'Bruno Costa': " + minhaAgenda.buscaContato("Bruno Costa"));
	}
}