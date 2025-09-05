/*
Wesley Elbert Assis
*/

package Secao1;


import java.util.Scanner;

//Leia o valor do raio de um circulo e calcule e imprima a área do circulo
//correspondente. A área do circulo é PI * raio ^ 2, considere PI = 3.141592.
public class programa012 {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
 
        
        
        double valor_raio;
        double area_circulo;
        valor_raio = entrada.nextDouble();
        
       area_circulo = 3.14159*Math.pow(valor_raio,2);
       
       System.out.println("A área do circulo é: " + area_circulo);
        
        
    }
}
