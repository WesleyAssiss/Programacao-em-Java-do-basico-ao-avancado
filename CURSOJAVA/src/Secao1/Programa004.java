package Secao1;


import java.util.Scanner;

//Leia uma temperatura em graus Celsius e apresente-a convertida em graus
//Fahrenheit. A fórmula da conversão é F= C*(9.0/5.0)+32, sendo F a temperatura
//em Fahrenheit e a C a tempertaura em Celsius.

//Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus
//Celsius. A fórmula da conversão é C = 5.0 * (F - 32.0)/9.0, sendo F a temperatura
//em Fahrenheit e a C a tempertaura em Celsius.

//Leia uma temperatura em graus Kelvin e apresente-a convertida em graus
//Celsius. A fórmula da conversão é C = K - 273.15, sendo C a temperatura
// em Celsius e K temperatura de Kelvin.

//Leia uma temperatura em graus Celsius e apresente-a convertida em graus
//Kelvin. A fórmula da conversão é K = C + 273.15, sendo C a temperatura
// em Celsius e K temperatura de Kelvin.
public class Programa004 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int Temperatura;
        float Celsius = 0;
        float Fahrenheit = 0;
        float Kelvin = 0;

        System.out.println("Digite qual o modelo de temperatura deseja: \n"
                + " 1 - Conversão de Celsius para Fahrenheit \n"
                + " 2 - Conversão de Fahrenheit para Celsius \n"
                + " 3-  Conversão de kelvin para Celsius \n"
                + " 4 - Conversão de Celsius para kelvin");

        Temperatura = entrada.nextInt();

        switch (Temperatura) {
            case 01:
                System.out.println("Qual é a temperatura em Celsius: ");
                Temperatura = entrada.nextInt();

                Celsius = Temperatura;

                Fahrenheit = (float) (Celsius * (9.0 / 5.0) + 32);

                System.out.println("A temperatura convertida para Fahrenheit é " + Fahrenheit);
                break;
            case 02:
                System.out.println("Qual é a temperatura em Fahrenheit: ");
                Temperatura = entrada.nextInt();

                Fahrenheit = Temperatura;
                Celsius = (float) (5.0 * (Fahrenheit - 32.0) / 9.0);
                System.out.println("A temperatura convertida para Celsius é " + Celsius);
                break;
            case 03:
                System.out.println("Qual é a temperatura em Celsius: ");
                Temperatura = entrada.nextInt();

                Kelvin = Temperatura;
                Celsius = (float) (Kelvin - 273.15);
                System.out.println("A temperatura convertida para Celsius é " + Celsius);
                break;
            case 04:
                System.out.println("Qual é a temperatura em Kelvin: ");
                Temperatura = entrada.nextInt();

                Celsius = Temperatura;
                Kelvin = (float) (Celsius + 273.15);
                System.out.println("A temperatura convertida para Kelvin é " + Kelvin);
                break;
                
            default:
                System.out.println("Nenhuma opção desejada, desde já obrigado!");
        }
    }
}
