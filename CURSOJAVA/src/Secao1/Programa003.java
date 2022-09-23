package Secao1;

import java.util.Scanner;

//Peça ao usuário para digitar três valores inteiros e imprima a soma deles.
   
public class Programa003 {
     public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        int num1,num2,num3;
        int soma;
        
        System.out.print("Digite o primeiro número: ");
        num1 = entrada.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = entrada.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = entrada.nextInt();
        
        soma = num1 + num2 + num3;
        
        System.out.println("A soma dos números é: " + soma);
        
     }
}
