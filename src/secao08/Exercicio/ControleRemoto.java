package secao08.Exercicio;

/*
 * CLASSE CONTROLE REMOTO
 * Controla uma instância da classe Televisao, chamando seus métodos.
 */
public class ControleRemoto {
	
	// Atributo: O controle remoto está associado a uma Televisao (Composição)
	private Televisao tv;
	
	// Construtor: O controle remoto precisa saber qual TV ele vai controlar
	public ControleRemoto(Televisao tv) {
		this.tv = tv;
	}
	
	// =======================================================
	// Métodos de Controle
	// =======================================================
	
	public void power() {
		if (tv.isLigada()) {
			tv.desligar(); // Desliga a TV 
		} else {
			tv.ligar(); // Liga a TV 
		}
	}
	
	public void volumeMais() {
		tv.aumentarVolume(); // Aumenta o volume em 1 [cite: 14]
	}
	
	public void volumeMenos() {
		tv.diminuirVolume(); // Diminui o volume em 1 [cite: 14]
	}
	
	public void canalMais() {
		tv.proximoCanal(); // Aumenta o canal em 1 [cite: 15]
	}
	
	public void canalMenos() {
		tv.canalAnterior(); // Diminui o canal em 1 [cite: 15]
	}
	
	public void setCanal(int canalDesejado) {
		tv.trocarCanal(canalDesejado); // Troca para um canal específico [cite: 15]
	}
	
	public void mostrarStatus() {
		System.out.println("\n--- Status Atual da TV ---");
		System.out.println("Ligada: " + (tv.isLigada() ? "Sim" : "Não"));
		System.out.println("Canal Atual: " + tv.getCanal());
		System.out.println("Volume Atual: " + tv.getVolume());
	}
}