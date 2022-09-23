package Secao1;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/* Escreva um programa que leia as coordenadas 𝑥 e 𝑦 de pontos no plano cartesiano e
calcule sua distância da origem (0, 0)*/
public class programa025 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float x = 0;
        float y = 0;
        float R = 0;
        
         System.out.println("Digite a coordenada x ");
        x = entrada.nextFloat();
        
         System.out.println("Digite a coordenada y ");
         y = entrada.nextFloat();
        
        R = (float) sqrt(pow(x, 2) + pow(y, 2)); //pow(base, expoente) pra elevar ao quadrado e sqrt() é raíz quadrada
         System.out.println("A distancia e: " + R);
        
       
    }
}
