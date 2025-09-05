/*
Tipos de Dados em Java: Alfanuméricos

Este programa demonstra a diferença entre os tipos de dados para caracteres e
textos: char (primitivo) e String (classe).
*/
package secao05;

public class Dados_alfanumericos {

	public static void main(String[] args) {
		
		// Tipos Primitivos para caracteres
		// char: armazena um único caractere. Usa aspas simples.
		char letra_primitiva = 'a';
		
		// O tipo 'char' também pode ser inicializado com um valor numérico (código Unicode/ASCII).
		// O valor 97 corresponde à letra 'a'.
		char letra2 = 97;
		
		// Ao somar 1 ao valor numérico, o caractere muda para o próximo na tabela.
		letra2 = (char) (letra2 + 1);
		
		
		// Tipos Wrapper e de Referência
		// Character: classe que "empacota" o tipo primitivo 'char'.
		Character letra_wrapper = 'b';
		
		// String: NÃO é um tipo primitivo. É uma classe de referência para
		// armazenar sequências de caracteres (textos). Usa aspas duplas.
		String texto = "Geek University";
		
		
		// --- Impressão dos Valores ---
		
		System.out.println("--- Tipos de Caracteres ---");
		System.out.println("char (primitivo) com 'a': " + letra_primitiva);
		System.out.println("char (primitivo) com valor 97: " + (char)97); // Mostra o valor original 'a'
		System.out.println("char (primitivo) após soma: " + letra2);      // Mostra o resultado 'b'
		System.out.println("Character (wrapper): " + letra_wrapper);
		
		System.out.println("\n--- Tipo de Texto (String) ---");
		System.out.println("String (classe): " + texto);
		
		
		// --- Análise de Capacidade ---
		
		System.out.println("\n--- Análise de Tamanho ---");
		System.out.println("char/Character: " + Character.SIZE + " bits (" + (Character.SIZE / 8) + " bytes)");
		System.out.println("\n--- Análise da String ---");
		System.out.println("Tamanho do texto: " + texto.length() + " caracteres");
		int bits_por_char = Character.SIZE; // 16 bits
		int total_bits = texto.length() * bits_por_char;
		System.out.println("Total de bits utilizados (aproximado): " + total_bits + " bits");
		System.out.println("Total de bytes utilizados (aproximado): " + (total_bits / 8) + " bytes");
	}

}