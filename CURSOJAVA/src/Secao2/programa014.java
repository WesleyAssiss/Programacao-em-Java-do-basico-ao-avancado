/*
Wesley Elbert Assis
*/

/*
Faça um algoritmo que calcule a média ponderada de 3 notas de prova. A primeira
e a segunda prova tem peso 1 e a terceira tem peso 2.Ao final, mostrar a média do aluno
e indicar se o aluno foi aprovado ou reprovado. A nota para aprovação deve ser igual
ou superior a 60 pontos.

 */
package Secao2;

import java.util.Scanner;

public class programa014 {
    public static void main(String[] args) {
       
        float media,nota1,nota2,nota3,total;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Digite a primeira nota 0 a 35");
        nota1 = entrada.nextInt();
        
        System.out.println("Digite a primeira nota 0 a 25");
        nota2 = entrada.nextInt();
        
        System.out.println("Digite a primeira nota 0 a 40");
        nota3 = entrada.nextInt();
        
        
        total = nota1 + nota2 + nota3;
        
        
        
        if (total >= 60) {
            media = total / 3;
            System.out.println("Você está aprovado " + media);
        } else {
            media = total / 3;
            System.out.println("Você está reprovado " + media);
        }
        
        
        
    }
}
