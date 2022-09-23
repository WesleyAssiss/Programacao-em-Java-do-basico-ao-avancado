package Secao1;


import java.util.Scanner;

/*
Escreva um programa de ajuda para os vendedores.A partir de um valor total
lido, mostre:
> O total a pagar com desconto de 10%
> O valor de cada parcela, no parcelamento de 3x sem juros
> A comissao do vendedor, no caso da venda ser a vista(5% sobre o valor com desconto)
> A comissão do vendedor, no caso da venda ser parcelada(5% sobre o valor total)
 */
public class programa018 {

    public static void main (String[]args){
        
        Scanner entrada = new Scanner (System.in);
       
        float Total_Pagar,Comissao1,Comissao2,Parcelas,desconto;
        float valor_total;
        
       
        System.out.println("Qual o valor total? ");
        valor_total = entrada.nextFloat();
       
        desconto = (float) (valor_total * 0.10);
         Total_Pagar = valor_total - desconto;
     
        System.out.println("Total a pagar com desconto de 10%: " + Total_Pagar);
       
        Parcelas= valor_total / 3;
        System.out.println("Total do parcelamento em 3x sem juros: " + Parcelas);
        
        Comissao1= (float) (Total_Pagar * 0.05);
    System.out.println("Comissao venda a vista: " + Comissao1);
    
    
   Comissao2= (float) (valor_total * 0.05);
    System.out.println("Comissao venda parcelada: " + Comissao2);


    }
}

