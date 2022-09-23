package Secao1;


import java.util.Scanner;
// Leia uma distância em milhas e apresente-a convertida em quilômetros. A fórmula
// de conversão é K = 1,61 * M, sendo K a distância em quilômetros e M em milhas.

// Leia uma distância em milhas e apresente-a convertida em milhas. A fórmula
// de conversão é M = k, sendo K a distância em quilômetros e M em milhas.
//                   1,61
public class Programa006 {
    public static void main (String[]args){
        
        Scanner entrada = new Scanner (System.in);
        
        float quilometros;
        float milhas;
        int opcao;
        System.out.println("Escolha qual a opção desejada: \n "
                + "1 - Distância convertida de milhas para quilômetros \n"
                + " 2 - Distância convertida de quilômetros para milhas");
        
        opcao = entrada.nextInt();
        
        switch(opcao){
            case 01: 
                System.out.print("Qual a distância em milhas? : ");
                milhas = entrada.nextFloat();
                
                quilometros = (float) (1.61 * milhas);
                
                System.out.println("A distância convertida de milhas para quilômetros é : " + quilometros);
               break;  
            case 02:
                System.out.print("Qual a distância em quilômetros? : ");
                quilometros = entrada.nextFloat();
                
                milhas = (float) (quilometros / 1.61);
                
                System.out.println("A distância convertida de milhas para quilômetros é : " + milhas); 
                break;
                default:
                    System.out.println("Opção inválida");
        }
    }
}
