/*
Operações Matemáticas Básicas em Java

Este programa demonstra as principais operações matemáticas (aritméticas)
e o uso de diferentes tipos de dados numéricos.
*/
package secao05;

public class Operacoes_matematicas {

	public static void main(String[] args) {
		
		// --- Declaração e Inicialização de Variáveis ---
		
		// Usamos o tipo 'int' por ser o mais comum para operações inteiras
		int num1 = 10;
		int num2 = 5;
		
		// Usamos o tipo 'double' para operações com casas decimais
		double num3 = 10.0;
		double num4 = 4.0;
		
		
		// --- Operações Aritméticas Básicas ---
		
		// Adição (+)
		int soma = num1 + num2;
		System.out.println("Soma: " + num1 + " + " + num2 + " = " + soma);
		
		// Subtração (-)
		int subtracao = num1 - num2;
		System.out.println("Subtração: " + num1 + " - " + num2 + " = " + subtracao);
		
		// Multiplicação (*)
		int multiplicacao = num1 * num2;
		System.out.println("Multiplicação: " + num1 + " * " + num2 + " = " + multiplicacao);
		
		// Divisão (/)
		int divisao = num1 / num2; // Divisão entre inteiros resulta em um inteiro
		System.out.println("Divisão: " + num1 + " / " + num2 + " = " + divisao);
		
		// Módulo (%) - Resto da divisão
		int modulo = num1 % 3; // 10 / 3 = 3, com resto 1
		System.out.println("Módulo: " + num1 + " % 3 = " + modulo);
		
		
		// --- Exemplo de Operação com Ponto Flutuante ---
		
		System.out.println("\n--- Operação com Ponto Flutuante ---");
		double resultado_divisao_real = num3 / num4;
		System.out.println("Divisão Real: " + num3 + " / " + num4 + " = " + resultado_divisao_real);
		
		
		// --- Análise de Tipos de Dados ---
		// As operações em si não têm tamanho fixo. O que importa é o tamanho dos dados.
		System.out.println("\n--- Análise de Capacidade dos Tipos ---");
		System.out.println("Os tipos usados nas operações são:");
		System.out.println("int/Integer: " + Integer.SIZE + " bits (" + (Integer.SIZE / 8) + " bytes)");
		System.out.println("double/Double: " + Double.SIZE + " bits (" + (Double.SIZE / 8) + " bytes)");
	}
}