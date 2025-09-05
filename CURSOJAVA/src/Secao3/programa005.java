/*
Wesley Elbert Assis
*/

/*
Faça um programa que peça ao usuário digitar 10 valores e some-os.
 */
package Secao3;

import java.util.Scanner;

public class programa005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        
        float soma = 0,num;
        int cont = 0;
        
        System.out.println("Digite 10 números");
        while (cont < 10) {            
            num = entrada.nextInt();
            soma = soma + num;
            cont++;
        }
       
        System.out.println("A soma é: " + soma);
        
    }
}
