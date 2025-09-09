/*
Vetores (Arrays) em Java

Este programa demonstra a criação, manipulação e impressão de vetores
usando diferentes tipos de laços de repetição.
*/
package secao06;

import java.util.Arrays;

public class vetores02 {

	public static void main(String[] args) {
		
		// --- 1. Criação e Propriedades do Vetor ---
		
		// Declaração do vetor 'numeros' do tipo 'int' com 10 posições
		int[] numeros = new int[10];
		
		System.out.println("--- Propriedades do Vetor ---");
		// A propriedade '.length' retorna o tamanho do vetor
		System.out.println("Tamanho do vetor: " + numeros.length);
		
		
		// --- 2. Inserindo Valores de Forma Sequencial ---
		
		System.out.println("\n--- Inserindo Valores Sequenciais (i + 3) ---");
		// Laço 'for' para percorrer o vetor do índice 0 ao 9
		for(int i = 0; i < numeros.length; i++) {
			// Atribui o valor de (i + 3) a cada posição
			numeros[i] = i + 3;
		}
		
		// Imprime os valores dos elementos nas posições inicial e final
		System.out.println("Primeiro elemento (índice 0): " + numeros[0]);
		System.out.println("Último elemento (índice 9): " + numeros[9]);
		
		// Nota: Um vetor tem índice fixo e causa erro se você tentar acessar uma posição fora do limite.
		// Exemplo de erro: numeros[10] = 42;
		
		
		// --- 3. Atribuindo Valores Aleatórios ---
		
		System.out.println("\n--- Atribuindo Valores Aleatórios ---");
		// Laço 'for' para preencher o vetor com números aleatórios
		for (int i = 0; i < numeros.length; i++) {
			// Math.random() gera um double entre 0 e 1.
			// Multiplicamos por 10, arredondamos e convertemos para 'int'.
			numeros[i] = (int)Math.round(Math.random() * 10);
		}
		
		// Imprime os novos valores nas posições inicial e final
		System.out.println("Primeiro elemento (novo): " + numeros[0]);
		System.out.println("Último elemento (novo): " + numeros[9]);
		
		// Nota: Para vetores, o tipo é fixo e não aceita tipos diferentes.
		// Exemplo de erro: numeros[0] = 23.4f;
		
		
		// --- 4. Impressão de todos os elementos ---
		
		System.out.println("\n--- Imprimindo o Vetor Completo ---");
		// O laço 'for-each' é mais simples para percorrer e imprimir todos os elementos
		for(int i : numeros) {
			System.out.println("Valor: " + i);
		}
		
		// Outra forma fácil de imprimir o vetor inteiro (necessita de 'import java.util.Arrays')
		System.out.println("\n--- Usando a Classe Arrays ---");
		System.out.println("Vetor: " + Arrays.toString(numeros));
	}
}