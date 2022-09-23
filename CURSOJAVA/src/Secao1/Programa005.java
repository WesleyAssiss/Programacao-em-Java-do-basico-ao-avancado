package Secao1;


import java.util.Scanner;

//Leia uma velocidade em KM/H e apresente - a convertida em m/s. A fórmula da 
//da conversão é M = K/3.6, sendo K a velocidade em KM/h e M em m/s.

//Leia a velocidade em m/s e apresente-a convertida em Km/h. A fórmula da 
//conversão é K = M *3.6, sendo K a velocidade em KM/h e M em m/s.
public class Programa005 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        int Velocidade;
        float K = 0;
        float M = 0;
        

        System.out.println("Digite qual a conversão de velocidade deseja: \n"
                + " 1 - Conversão de KM/H para m/s \n"
                + " 2 - Conversão de m/s para KM/H ");

        Velocidade = entrada.nextInt();

        switch (Velocidade) {
            case 01:
                System.out.println("Qual é a velocidade em KM/H: ");
                Velocidade = entrada.nextInt();

                K = Velocidade;

                M = (float) (K/3.6);

                System.out.println("A velocidade convertida para m/s (metros por segundo) é : " + M);
                break;
                
            case 02:
                System.out.println("Qual é a velocidade em m/s ");
                Velocidade = entrada.nextInt();

                M = Velocidade;
                K = (float) (M *3.6);
                System.out.println("A velocidade convertida para KM/H (quilometros por hora) é :  " + K);
                break;
           
           
                
            default:
                System.out.println("Nenhuma opção desejada, desde já obrigado!");
        }
    }
}
        
    
