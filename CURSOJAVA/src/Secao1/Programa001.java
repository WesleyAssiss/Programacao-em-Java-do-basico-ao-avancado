package Secao1;


import java.util.Scanner;

//Faça um programa que leia um número inteiro e imprima.
public class Programa001 {
    public static void main (String[]args){
        
        Scanner s = new Scanner (System.in);
        int num1;
        
        System.out.print("Digite um número: ");
        num1 = s.nextInt();
        
        System.out.println("O número digitado foi: " + num1);
    }
}
