/*
Wesley Elbert Assis
 */

 /*
24->Faça um programa que leia 10 conjuntos de dois valores, o primeiro 
representando o número do aluno e o segundo representando a sua altura em metros.
Encontre o aluno mais baixo e o mais alto.Mostre o número do aluno mais baixo e 
do mais alto, juntamente com suas alturas.
 */
package Secao4;

import java.util.Scanner;

public class programa032 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

		
        
        
        float altura_baixo = 10;
        float altura_alto = 0;
        int numbaixo = 0;
        int numalto = 0;
        
        int num[] = new int[10];
        float altura[] = new float[10];
                
        for (int i = 0; i < num.length; i++) {
                System.out.println("Número do aluno!");
        	System.out.println("Digite o número do  aluno: " + i);
        	num[i] = entrada.nextInt();
        	System.out.println("Altura do aluno!");
        	System.out.println("Digite a altura do aluno: " + i);
                altura[i] = entrada.nextFloat();
            
            System.out.println("");
            
            if(altura[i] < altura_baixo){
                altura_baixo = altura[i];
                numbaixo = num[i];
            } 
            if (altura[i] > altura_alto){
                altura_alto = altura[i];
                numalto = num[i];
            }
        }
        System.out.println("O Aluno de número "+ numbaixo+" é o mais baixo e mede "+ altura_baixo +"m");
        System.out.println("O Aluno de número "+ numalto+" é o mais alto e mede "+ altura_alto +"m");
        
        entrada.close();
    }
} 
