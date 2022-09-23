/*
Faça um programa que mostre ao usuário um menu com 4 opções de operações matemáticas
( as Básicas, por exemplo). O usuário escolhe uma das opções e o seu programa então pede 
dois valores numéricos e realiza a operação, mostrando resultado e saindo.
*/
package Secao2;

import java.util.Scanner;

public class programa019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcao;
        int numero1,numero2,total;
        
        
        
        
    System.out.println("Escolha qual a opção desejada: \n "
                + "1 - Adição \n"
                + " 2 - Subtração"
                + " 3 - Multiplicação"
                + "4 - Divisão");
        
        opcao = entrada.nextInt();
        
        switch(opcao){
            case 01: 
                System.out.print("Digite o primeiro numero : ");
                numero1 = entrada.nextInt();
                  
                System.out.print("Digite o segundo numero : ");
                numero2 = entrada.nextInt();
                
                total = numero1 + numero2;
                
                System.out.println("O total da Adição é : " + total);
               break;  
             case 02: 
                System.out.print("Digite o primeiro numero : ");
                numero1 = entrada.nextInt();
                  
                System.out.print("Digite o segundo numero : ");
                numero2 = entrada.nextInt();
                
                total = numero1 - numero2;
                
                System.out.println("O total da Subtração é : " + total);
               break;  
               
               
                case 03: 
                System.out.print("Digite o primeiro numero : ");
                numero1 = entrada.nextInt();
                  
                System.out.print("Digite o segundo numero : ");
                numero2 = entrada.nextInt();
                
                total = numero1 * numero2;
                
                System.out.println("O total da Multiplicação é : " + total);
               break;  
               
               
                case 04: 
                System.out.print("Digite o primeiro numero : ");
                numero1 = entrada.nextInt();
                  
                System.out.print("Digite o segundo numero : ");
                numero2 = entrada.nextInt();
                
                total = numero1 / numero2;
                
                System.out.println("O total da Divisão é : " + total);
               break;  
               
               
                default:
                    System.out.println("Opção inválida");
        }
    }
}
