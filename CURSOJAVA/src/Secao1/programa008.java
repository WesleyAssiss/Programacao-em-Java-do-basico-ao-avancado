package Secao1;


import java.util.Scanner;
//Leia quatro notas, calcule a média aritmética e imprima o resultado.

public class programa008 {
    public static void main (String[]args){
        Scanner entrada = new Scanner (System.in);
        
        
        int nota1,nota2,nota3,nota4;
        int media;
        
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextInt();
         System.out.println("Digite a segunda nota: ");
         nota2 = entrada.nextInt();
          System.out.println("Digite a terceira nota: ");
          nota3 = entrada.nextInt();
           System.out.println("Digite a quarta nota: ");
           nota4 = entrada.nextInt();
       
           
           
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A media das notas é: " + media);
        
    }
}
