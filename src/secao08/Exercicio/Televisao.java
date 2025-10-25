package secao08.Exercicio;

/*
 * CLASSE TELEVISAO
 * Representa o objeto TV, mantendo seu estado (ligada/desligada, volume e canal).
 * Os atributos são privados para garantir que sejam alterados somente pelos métodos.
 */
public class Televisao {

	private boolean ligada = false;
	private int volume = 0;
	private int canal = 1;
	
	// =======================================================
	// Métodos Getters (Apenas para Leitura do Estado)
	// =======================================================

	public boolean isLigada() {
		return ligada;
	}

	public int getVolume() {
		return volume;
	}

	public int getCanal() {
		return canal;
	}

	// =======================================================
	// Métodos de Controle (Ações que o Controle Remoto chamará)
	// =======================================================
	
	public void ligar() {
		if (!this.ligada) {
			this.ligada = true;
			System.out.println("TV LIGADA.");
		}
	}
	
	public void desligar() {
		if (this.ligada) {
			this.ligada = false;
			System.out.println("TV DESLIGADA.");
		}
	}
	
	// Controle de Volume [cite: 14]
	public void aumentarVolume() {
		if (this.ligada) {
			this.volume++; // Aumenta em uma unidade [cite: 14]
			System.out.println("Volume: " + this.volume);
		}
	}
	
	public void diminuirVolume() {
		if (this.ligada && this.volume > 0) {
			this.volume--; // Diminui em uma unidade [cite: 14]
			System.out.println("Volume: " + this.volume);
		}
	}
	
	// Controle de Canal [cite: 15]
	public void proximoCanal() {
		if (this.ligada) {
			this.canal++; // Aumenta o número do canal em uma unidade [cite: 15]
			System.out.println("Canal: " + this.canal);
		}
	}
	
	public void canalAnterior() {
		if (this.ligada && this.canal > 1) {
			this.canal--; // Diminui o número do canal em uma unidade [cite: 15]
			System.out.println("Canal: " + this.canal);
		}
	}
	
	public void trocarCanal(int novoCanal) {
		if (this.ligada && novoCanal > 0) {
			this.canal = novoCanal; // Troca para um canal indicado [cite: 15]
			System.out.println("Canal trocado para: " + this.canal);
		}
	}
}