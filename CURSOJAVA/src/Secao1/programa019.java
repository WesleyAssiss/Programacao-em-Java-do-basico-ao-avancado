/*
Wesley Elbert Assis
*/

package Secao1;


import java.util.Scanner;

/* Receba a altura do degrau de uma escada e a altura que o usuário deseja alcançar subindo
a escada. Calcule e mostre quantos degraus o usuário deverá subir para atingir seu objetivo,
sem se preocupar com a altura do usuário */
public class programa019 {

    public static void main(String[] args) {
        float degrau, altura, quantidade;
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Insira a altura do degrau em centimetros: ");
        degrau = entrada.nextFloat();
        System.out.println("Qual altura deseja alcancar em metros:");
        altura = entrada.nextFloat();
        quantidade = (degrau * 100) / altura;
        System.out.println("A quantidade de degraus para alcancar a altura e " + quantidade);
        
    }
}
