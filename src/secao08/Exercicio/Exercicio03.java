package secao08.Exercicio;

/*
 * EXERCICIO 03: Programa principal que testa a relação entre
 * ControleRemoto e Televisao.
 * 
 * 3. Crie uma classe Televisao e uma classe ControleRemoto que pode controlar a televisão, como ligar e desligar, trocar canais e aumentar e diminuir o volume.
- O controle de volume permite aumentar ou diminuir a potência do volume de som em uma unidade de cada vez.
- O controle de canal permite aumentar ou diminuir o número do canal em uma unidade, porém também possibilita trocar para um canal indicado.
 */
public class Exercicio03 {

	public static void main(String[] args) {
		
		// 1. Cria a Televisão
		Televisao minhaTV = new Televisao();
		
		// 2. Cria o Controle Remoto, associando-o à TV
		ControleRemoto controle = new ControleRemoto(minhaTV);
		
		System.out.println("--- Início do Teste do Controle Remoto ---");
		
		// Teste 1: Ligar e Aumentar Volume
		controle.power(); // Liga a TV 
		controle.mostrarStatus();
		
		controle.volumeMais(); // Aumenta volume para 1 [cite: 14]
		controle.volumeMais(); // Aumenta volume para 2 [cite: 14]
		
		// Teste 2: Troca de Canal
		controle.canalMais(); // Vai para o canal 2 [cite: 15]
		controle.canalMais(); // Vai para o canal 3 [cite: 15]
		
		// Trocar para um canal específico [cite: 15]
		controle.setCanal(15);
		
		// Teste 3: Diminuir Volume e Canal
		controle.volumeMenos(); // Volume 1 [cite: 14]
		controle.canalMenos(); // Canal 14 [cite: 15]
		
		controle.mostrarStatus();
		
		// Teste 4: Desligar
		controle.power(); // Desliga a TV 
	}
}