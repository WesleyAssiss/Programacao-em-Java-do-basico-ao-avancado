/*
Determine se um determinado ano lido é bissexto. Sendo que um ano é bissexto se 
for divisel por 400 ou se for divisivel por 4 e não for divisel por 100. 
Por exemplo: 1988, 1992, 1996
 */
package Secao2;

import java.util.Scanner;

public class programa024 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int ano;
        
        
        System.out.println("Digite o ano");
        ano = entrada.nextInt();
        
        if (ano % 400 == 0 || ano % 4 == 0 ) {
            System.out.println("É ano bissexto");
        } else {
            System.out.println("Não ano bissexto");
        }
    }
}
