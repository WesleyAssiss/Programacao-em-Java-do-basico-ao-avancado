/*
Wesley Elbert Assis
 */

 /*

3 -> Faça uma função para verificar se um número é positivo ou negativo. Sendo que o valor
de retorno será 1 se positivo, -1 se negativo e 0 se for igual a 0;

 */
package Secao5;

import java.util.Scanner;

public class programa005 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int num;
        
        System.out.println("Digite um número: ");
        num = entrada.nextInt();
        
        verifica(num);
    }

    static int verifica(int num) {
        
        if (num < 0) {
            System.out.println("O numero é negativo! ");
        } else if (num == 0) {
            System.out.println("O número é igual 0");
        } else {
            System.out.println("O número é positivo! ");
        }
        return num;
    }
}
