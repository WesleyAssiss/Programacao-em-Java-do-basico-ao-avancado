/*
Wesley Elbert Assis
*/

package Secao1;


import java.util.Scanner;

/*
Uma empresa contrata um encanador a 30,00 por dia. Faça um programa que solicite
o numero de dias trabalhados pelo encanador e imprima a quantia líquida que deverá 
ser paga, sabendo-se que são descontados 8% para imposto de renda.
 */
public class programa017 {
    public static void main (String[]args){
        
        Scanner entrada = new Scanner (System.in);
        int num1;
        float dias = (float) 30.00;
        float total,descontos,impostos;
        
        
        System.out.println("Insira o número de dias trabalhados ");
        num1 = entrada.nextInt();
        
        total = dias * num1;
        
       System.out.println("O valor total liquido é :" + total);
       
       impostos = (float) (total * 0.8);
       
       System.out.println("O valor total com os impostos é :" + impostos);
        
        descontos = total - impostos;
        
         System.out.println("O valor do IRF é :" + descontos);
    }
}
