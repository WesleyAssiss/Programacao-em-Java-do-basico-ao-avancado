/*
Wesley Elbert Assis
*/

package Secao1;


import java.util.Scanner;

//Leia um número inteiro e imprima a soma do sucessor de seu triplo com o antecessor
//de seu dobro.
public class programa011 {
        public static void main (String[]args){
        
        Scanner entrada = new Scanner (System.in);
        int soma;
        int numero;
        int antecessor;
        int sucessor;
        
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        
        antecessor = numero  * -2 ;
        sucessor = numero * 3;
        soma = antecessor + sucessor;
        
        System.out.println("O antecessor do número " + numero + " em dobro é : " + antecessor);
        System.out.println("O sucessor do número " + numero + " em triplo é : " + sucessor);
        System.out.println("A soma do sucessor com o antecessor é: " + soma);
        
        
    }
    
}


