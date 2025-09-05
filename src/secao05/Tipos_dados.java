/*
Tipos de Dados em Java: Numéricos Inteiros e Caracteres

Este programa demonstra a diferença e as características dos tipos de dados
primitivos e wrappers, com foco em números inteiros e caracteres.
*/
package secao05;

public class Tipos_dados {

	public static void main(String[] args) {
		
		// Tipos Primitivos (armazenam valores diretamente na memória, são mais eficientes)
		byte num1 = 127;    
		short num2 = 32767;   
		int num3 = 2147483647;   
		long num4 = 9223372036854775807L; 
		
		char letra = 'a'; // Representa um único caractere, usa aspas simples
		
		
		// Tipos Wrapper (objetos que "empacotam" os primitivos)
		Byte num5 = 127;
		Short num6 = 32767;
		Integer num7 = 2147483647;
		Long num8 = 9223372036854775807L;
		
		Character letra2 = 34; //Tabela ASCII
		
		
		// --- Impressão dos Valores ---
		
		System.out.println("--- Tipos Primitivos ---");
		System.out.println("byte: " + num1);
		System.out.println("short: " + num2);
		System.out.println("int: " + num3);
		System.out.println("long: " + num4);
		System.out.println("char: " + letra);
		
		System.out.println("\n--- Tipos Wrapper ---");
		System.out.println("Byte: " + num5);
		System.out.println("Short: " + num6);
		System.out.println("Integer: " + num7);
		System.out.println("Long: " + num8);
		System.out.println("Character: " + letra2);
		
		
		// --- Análise de Capacidade ---
		
		System.out.println("\n--- Análise de Tamanho e Limites (Números) ---");
		System.out.println("byte/Byte: " + Byte.SIZE + " bits (Min: " + Byte.MIN_VALUE + " | Máx: " + Byte.MAX_VALUE + ")");
		System.out.println("short/Short: " + Short.SIZE + " bits (Min: " + Short.MIN_VALUE + " | Máx: " + Short.MAX_VALUE + ")");
		System.out.println("int/Integer: " + Integer.SIZE + " bits (Min: " + Integer.MIN_VALUE + " | Máx: " + Integer.MAX_VALUE + ")");
		System.out.println("long/Long: " + Long.SIZE + " bits (Min: " + Long.MIN_VALUE + " | Máx: " + Long.MAX_VALUE + ")");
		
		System.out.println("\n--- Análise de Tamanho e Limites (Caracteres) ---");
		System.out.println("char/Character: " + Character.SIZE + " bits (Min: " + (int)Character.MIN_VALUE + " | Máx: " + (int)Character.MAX_VALUE + ")");
	}

}