/*
Wesley Elbert Assis
 */

 /*

4 -> Faça uma função para verificar se um número é um quadrado perfeito. Um quadrado
perfeito é um número inteiro não negativo que pode ser expresso como o quadrado de 
outro número inteiro. EX: 1,4,9...

 */
package Secao5;

import java.util.Scanner;

public class programa006 {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        
        double num;

        System.out.println("Digite um numero: ");
        num = entrada.nextDouble();

        if (verifica(num)) {
            System.out.println("Quadrado Perfeito");
        } else {
            System.out.println("Não é quadrado perfeito");
        }
    }

    public static boolean verifica(double numero) {
        Double resultado = Math.sqrt(numero);
        if (resultado != null) {
            return (resultado.intValue() == resultado.doubleValue());
        } else {
            return false;
        }
    }
}
