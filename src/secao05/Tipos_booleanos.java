/*
Tipos de Dados em Java: Booleanos

Este programa demonstra o tipo de dado booleano, que representa um valor
lógico verdadeiro ou falso.
*/
package secao05;

public class Tipos_booleanos {

	public static void main(String[] args) {
		
		// Tipo Primitivo: armazena um valor lógico (true ou false).
		// O tamanho em memória pode variar dependendo da JVM, mas
		// geralmente ocupa 1 byte.
		boolean verdadeiro = true;
		boolean falso = false;
				
		// Tipo Wrapper (não primitivo): é uma classe que "empacota" o 'boolean'.
		Boolean v = true;
		Boolean f = false;
		
		// --- Impressão dos Valores ---
		
		System.out.println("--- Tipos Primitivos ---");
		System.out.println("Valor 'verdadeiro': " + verdadeiro);
		System.out.println("Valor 'falso': " + falso);
		
		System.out.println("\n--- Tipos Wrapper ---");
		System.out.println("Valor 'v': " + v);
		System.out.println("Valor 'f': " + f);
		
		// --- Análise de Capacidade ---
		
		System.out.println("\n--- Análise de Tamanho ---");
		System.out.println("O tipo boolean/Boolean não tem um tamanho fixo em bits definido.");
		System.out.println("Geralmente, ele é otimizado pela JVM para usar 1 byte (8 bits).");
	}
}