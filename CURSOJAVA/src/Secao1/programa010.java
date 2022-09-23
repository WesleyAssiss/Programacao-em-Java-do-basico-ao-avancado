package Secao1;


import java.util.Scanner;

//Leia um número inteiro e imprima  o seu antecessor e o seu sucessor.
public class programa010 {
    public static void main (String[]args){
        
        Scanner entrada = new Scanner (System.in);
        
        int numero;
        int antecessor;
        int sucessor;
        
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        
        antecessor = numero -1;
        sucessor = numero + 1;
        
        System.out.println("O antecessor do número " + numero + " é: " + antecessor);
        System.out.println("O sucessor do número " + numero + " é: " + sucessor);
        
        
    }
    
}
