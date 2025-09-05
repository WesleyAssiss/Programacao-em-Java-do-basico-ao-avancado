/*
Wesley Elbert Assis
*/

/*
Leia um número fornecido pelo usuário. Se esse número for positivo, calcule a raiz
quadrada do número. Se o número for negativo, mostre uma mensagem dizendo que o número
é inválido
 */
package Secao2;

import java.util.Scanner;


public class programa003 {
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner (System.in);
        
                
        int numero;
        
        System.out.println("Digite um número");
        numero = entrada.nextInt();
        
      if(numero >= 0){
          System.out.println("A raiz do número" + numero + "é: " + Math.sqrt(numero));
       
      }else{
          System.out.println("O número é negativo por isso não possui raiz");
      }
    }
}
