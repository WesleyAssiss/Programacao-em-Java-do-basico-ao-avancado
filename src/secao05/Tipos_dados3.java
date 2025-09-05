/*
Tipos de Dados em Java: Primitivos e Wrappers

Este programa demonstra a diferença e as características de alguns tipos
de dados numéricos (inteiros), incluindo seus tamanhos e limites de valor.
*/
package secao05;

public class Tipos_dados3 {

	public static void main(String[] args) {
		
		// Tipos de dados primitivos: armazenam o valor diretamente na memória.
		// São mais rápidos e eficientes.
		int num1 = 4;   // Inteiro de 32 bits.
		short num2 = 6; // Inteiro curto de 16 bits.
		byte num3 = 4;  // Inteiro muito curto de 8 bits.
		
		
		// Tipos de dados Wrapper (não primitivos): são classes que "empacotam"
		// os tipos primitivos. Oferecem métodos úteis e podem ser nulos.
		Integer num4 = 98;
		Short num5 = 7;
		Byte num6 = 9;
		
		
		System.out.println("--- Tipos Primitivos (Valores Diretos) ---");
		System.out.println("int: " + num1);
		System.out.println("short: " + num2);
		System.out.println("byte: " + num3);
		
		
		System.out.println("\n--- Tipos Wrapper (Objetos) ---");
		System.out.println("Integer: " + num4);
		System.out.println("Short: " + num5);
		System.out.println("Byte: " + num6);
		
		
		System.out.println("\n--- Análise de Tamanho e Capacidade ---");
		System.out.println("Tipo int/Integer: " + Integer.SIZE + " bits (" + (Integer.SIZE / 8) + " bytes)");
		System.out.println("Valor Mínimo: " + Integer.MIN_VALUE + " | Valor Máximo: " + Integer.MAX_VALUE);
		
		System.out.println("\nTipo short/Short: " + Short.SIZE + " bits (" + (Short.SIZE / 8) + " bytes)");
		System.out.println("Valor Mínimo: " + Short.MIN_VALUE + " | Valor Máximo: " + Short.MAX_VALUE);
		
		System.out.println("\nTipo byte/Byte: " + Byte.SIZE + " bits (" + (Byte.SIZE / 8) + " bytes)");
		System.out.println("Valor Mínimo: " + Byte.MIN_VALUE + " | Valor Máximo: " + Byte.MAX_VALUE);
		
	}

}