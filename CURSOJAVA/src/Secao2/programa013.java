/*
Wesley Elbert Assis
*/

/*
 Ler um número inteiro. Se o número lido for negativo, escreva a mensagem "Número
Inválido". Se o número for positivo, calcular o logaritmo deste número.
 */
package Secao2;

import java.util.Scanner;


public class programa013 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner (System.in);
        
        int numero;
        
        
        System.out.println("Digite um número");
        numero = entrada.nextInt();
        
        if (numero < 0) {
            System.out.println("Número Inválido");
        } else {
            System.out.println(Math.log(numero));
            
        }
        
    }
}
