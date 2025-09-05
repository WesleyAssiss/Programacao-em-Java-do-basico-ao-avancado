/*
Escreva o menu de opções abaixo. Leia a opção do usuário e execute a 
operação escolhida.Escreva um mensagem de erro se a opção for inválida.

Escolha a opção:
1 - Soma de 2 números.
2 - Diferença entre 2 números(mair pelo menor)
3 - Produto entre 2 números
4 - Divisão entre 2 números (o denominador não pode ser 0)
*/
package Secao2;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class programa022 {
      public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int opcao;
        int numero1,numero2,total;
        
        
          System.out.println("Escolha qual a opção desejada: \n "
                + "1 - Adição \n"
                + " 2 - Diferença entre 2 números(mair pelo menor) \n"
                + " 3 - Produto entre 2 números \n"
                + " 4 - Divisão entre 2 números (o denominador não pode ser 0)");
        
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
                
                System.out.println("Diferença entre 2 números é : " + total);
               break;  
               
               
                case 03: 
                System.out.print("Digite o primeiro numero : ");
                numero1 = entrada.nextInt();
                  
                System.out.print("Digite o segundo numero : ");
                numero2 = entrada.nextInt();
                
                total = ((numero1 * numero1) + (numero2 * numero2));
                
                System.out.println("O Produto entre 2 números é : " + total);
               break;  
               
               
                case 04: 
                System.out.print("Digite o numerador : ");
                numero1 = entrada.nextInt();
                  
                System.out.print("Digite o denominado : ");
                numero2 = entrada.nextInt();
                
                    if (numero2 != 0) {
                        total = numero1 / numero2;
                        System.out.println("Divisão entre 2 números é : " + total);
                    } else {
                         System.out.println("ERRO, não pode haver 0 no demoninador");
                    }
                
                
               
               break;  
               
               
                default:
                    System.out.println("Opção inválida");
        }
    }
}
        
        
      
