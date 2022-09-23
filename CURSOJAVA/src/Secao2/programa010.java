/*
Leia um salário de um trabalhador e o valor  da prestação de um empréstimo.
Se a prestação for maior que 20% do salário imprima: Empréstimo não concedido,
caso contrário imprima : Emprestimo concedido.
 */
package Secao2;

import java.util.Scanner;


public class programa010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        float salario, valor_prestacao;
       
        
        System.out.println("Digite o salário do trabalhador");
        salario = entrada.nextFloat();
        
        System.out.println("Digite o valor da prestação em porcentagem");
        valor_prestacao = entrada.nextFloat();
        
   
        
        
        if (valor_prestacao > salario * 0.2) {
            System.out.println("Empréstimo não concedido ");
        } else {
            System.out.println("Empréstimo concedido ");
        }
    }
}
