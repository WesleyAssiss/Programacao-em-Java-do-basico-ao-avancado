/*
Wesley Elbert Assis
*/

package Secao1;


import java.awt.Color;
import java.util.Scanner;

//Leia um ângulo em graus e apresene-o convertido em radianos. A fórmula de conversão
// é R = G * PI/180, sendo o G o ângulo em graus e R em radianos e PI = 3.14.

//Leia um ângulo em radianos e apresene-o convertido em graus. A fórmula de conversão
// é G =  R * 180/PI, sendo o G o ângulo em graus e R em radianos e PI = 3.14.

//Leia um valor de comprimento em polegadas e apresente-o convertido em centimetros. 
// A fórmula de conversão é C = P * 2.54, sendo C o compriemnto em centimetros e  
//P o comprimento em polegadas.

//Leia um valor de comprimento em centimetros e apresente-o convertido em polegadas. 
// A fórmula de conversão é P = C / 2.54, sendo C o compriemnto em centimetros e  
//P o comprimento em polegadas.

//Leia um valor de volume em metros cúbicos e apresente-o convertido em litros.
//A fórmula de conversão é: L = 1000 * M, sendo L o volume em litros e M o volume
//em metros cúbicos

//Leia um valor de volume em litros e apresente-o convertido em metros cubicos.
//A fórmula de conversão é: M = L / 1000, sendo L o volume em litros e M o volume
//em metros cúbicos

//Leia um valor de massa em quilogramas e apresente-o convertido em libras.
//A fórmula de conversão é L: K/0.45, sendo K a massa em quilogramas e L a massa em Libras.

//Leia um valor de massa em libras e apresente-o convertido em quilogramas.
//A fórmula de conversão é K = L * 0.45, sendo K a massa em quilogramas e L a massa em Libras

//Leia um valor de comprimento em jardas e apresente-o convertido em metros. A fórmula
//de conversão é M = 0.91 * J, sendo J o comprimento em Jardas e M o comprimento em metros.

//Leia um valor de comprimento em metros e apresente-o convertido em jardas. A fórmula
//de conversão é J = M/0.91, sendo J o comprimento em Jardas e M o comprimento em metros.

//Leia um valor de área em metros quadrados e apresente-o convertido em acres. A fórmula
//de conversão é A = M * 0.000247, sendo M a área em metros quadrados e A a área em acres.

//Leia um valor de área em acres e apresente-o convertido em metros quadrados. A fórmula
//de conversão é M = A * 4048.58, sendo M a área em metros quadrados e A a área em acres.

//Leia um valor de área em metros quadrados e apresente-o convertido em hectares. A fórmula
//de conversão é H = M * 0.0001, sendo M a área em metros quadrados e H a área em hectares.

//Leia um valor de área em hectares e apresente-o convertido em metros quadrados. A fórmula
//de conversão é M = H * 10000, sendo M a área em metros quadrados e H a área em hectares.

//Leia uma temperatura em graus Celsius e apresente-a convertida em graus
//Fahrenheit. A fórmula da conversão é F= C*(9.0/5.0)+32, sendo F a temperatura
//em Fahrenheit e a C a tempertaura em Celsius.

//Leia uma temperatura em graus Fahrenheit e apresente-a convertida em graus
//Celsius. A fórmula da conversão é C = 5.0 * (F - 32.0)/9.0, sendo F a temperatura
//em Fahrenheit e a C a tempertaura em Celsius.

// Leia uma distância em milhas e apresente-a convertida em quilômetros. A fórmula
// de conversão é K = 1,61 * M, sendo K a distância em quilômetros e M em milhas.

// Leia uma distância em milhas e apresente-a convertida em milhas. A fórmula
// de conversão é M = k / 1.61, sendo K a distância em quilômetros e M em milhas.
                
//Leia uma velocidade em KM/H e apresente - a convertida em m/s. A fórmula da 
//da conversão é M = K/3.6, sendo K a velocidade em KM/h e M em m/s.

//Leia a velocidade em m/s e apresente-a convertida em Km/h. A fórmula da 
//conversão é K = M *3.6, sendo K a velocidade em KM/h e M em m/s.

//Leia uma temperatura em graus Kelvin e apresente-a convertida em graus
//Celsius. A fórmula da conversão é C = K - 273.15, sendo C a temperatura
// em Celsius e K temperatura de Kelvin.

//Leia uma temperatura em graus Celsius e apresente-a convertida em graus
//Kelvin. A fórmula da conversão é K = C + 273.15, sendo C a temperatura
// em Celsius e K temperatura de Kelvin.
public class programa007 {

    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
    // Bold
    public static final String BLACK_BOLD = "\033[1;30m";  // BLACK
    public static final String RED_BOLD = "\033[1;31m";    // RED
    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW
    public static final String BLUE_BOLD = "\033[1;34m";   // BLUE
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
    public static final String CYAN_BOLD = "\033[1;36m";   // CYAN
    public static final String WHITE_BOLD = "\033[1;37m";  // WHITE

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float Celsius,Fahrenheit,Kelvin;
        float K,M;
        float quilometros,milhas;
        float graus, radianos;
        float polegadas, centimetros;
        float metros_cubicos, litros;
        float quilogramas, libras;
        float jardas, metros;
        float metros_quadrados, acres, hectares;
        int opcao;

        System.out.println(BLACK_BOLD + "Escolha qual a opção desejada: \n "
                + BLACK_BOLD + "1 - Ângulo convertido de graus para radianos \n"
                + BLACK_BOLD + " 2 - Ângulo convertido de radianos para graus \n"
                + GREEN_BOLD + " 3 - Comprimento convertido de Polegadas para Centímetros \n"
                + GREEN_BOLD + " 4 - Comprimento convertido de Centímetros para Polegadas \n"
                + WHITE + " 5 - Volume em metros cúbicos convertidos para litros \n"
                + WHITE + " 6 - Volume em litros convertido para metros cúbicos \n"
                +  PURPLE + " 7 - Valor da masssa em quilogramas convertidos para libras \n"
                + PURPLE + " 8 - Valor da masssa em libras convertidos para quilogramas \n"
                + RED + " 9 - Valor do comprimento em jardas convertidos para metros \n "
                + RED + "10 - Valor do comprimento em metros convertidos para jardas \n"
                + CYAN + " 11 - Valor da área em metros quadrados convertidos para acres \n"
                + CYAN + " 12 - Valor da área em acres convertidos para metros quadrados \n "
                + YELLOW + "13 - Valor da área em metros quadrados convertidos para hectares \n "
                + YELLOW + "14 - Valor da área em hectares convertido para metros quadrados \n "
                +BLUE + "15 - Distância convertida de milhas para quilômetros \n"
                +BLUE+ " 16 - Distância convertida de quilômetros para milhas \n"
                +GREEN + " 17 - Conversão de KM/H para m/s \n"
                +GREEN + " 18 - Conversão de m/s para KM/H \n"
                +RED + " 19 - Conversão de Celsius para Fahrenheit \n"
                +RED+ " 20 - Conversão de Fahrenheit para Celsius \n"
                +YELLOW+ " 21 -  Conversão de kelvin para Celsius \n"
                + YELLOW + " 22 - Conversão de Celsius para kelvin");

        opcao = entrada.nextInt();

        switch (opcao) {
            case 01:
                System.out.print("Qual o ângulo convertido em graus? : ");
                graus = entrada.nextFloat();

                radianos = (float) (graus * 3.14 / 180);

                System.out.println(" Ângulo convertido de graus para radianos é : " + radianos);
                break;

            case 02:
                System.out.print("Qual o ângulo convertido em radianos?  : ");
                radianos = entrada.nextFloat();

                graus = (float) (radianos * 180 / 3.14);

                System.out.println("Ângulo convertido de graus para graus é : " + graus);
                break;

            case 03:
                System.out.print("Qual o o comprimento em Polegadas?  : ");
                polegadas = entrada.nextFloat();

                centimetros = (float) (polegadas * 2.54);
                System.out.println("Comprimento convertido de Polegadas para Centímetros é " + centimetros);
                break;

            case 04:
                System.out.print("Qual o o comprimento em Centimetros?  : ");
                centimetros = entrada.nextFloat();

                polegadas = (float) (centimetros / 2.54);
                System.out.println("Comprimento convertido de Centímetros para Polegadas é " + polegadas);
                break;

            case 05:
                System.out.print("Qual o valor de volume em metros cúbicos? :");
                metros_cubicos = entrada.nextFloat();

                litros = (float) (1000 * metros_cubicos);

                System.out.println("O Volume em metros cúbicos convertidos para litros é:  " + litros);
                break;

            case 06:
                System.out.print("Qual o valor de volume em litros? :");
                litros = entrada.nextFloat();

                metros_cubicos = (float) (litros / 1000);

                System.out.println("O Volume em litros convertidos para metros cúbicos é:  " + metros_cubicos);
                break;

            case 07:
                System.out.print("Qual o valor de massa em quilogramas? :");
                quilogramas = entrada.nextFloat();

                libras = (float) (quilogramas / 0.45);

                System.out.println("Valor da masssa em quilogramas convertidos para libras é:  " + libras);
                break;

            case 8:
                System.out.print("Qual o valor de massa em Libras? :");
                libras = entrada.nextFloat();

                quilogramas = (float) (libras * 0.45);

                System.out.println("Valor da masssa em libras convertidos para quilogramas é: " + quilogramas);
                break;

            case 9:
                System.out.print("Qual o valor de comprimento em Jardas ? :");
                jardas = entrada.nextFloat();

                metros = (float) (0.91 * jardas);

                System.out.println("Valor do comprimento em jardas convertidos para metros é: " + metros);
                break;

            case 10:
                System.out.print("Qual o valor de comprimento em metros ? :");
                metros = entrada.nextFloat();

                jardas = (float) (metros * 0.91);

                System.out.println("Valor do comprimento em metros convertidos para jardas é: " + jardas);
                break;

            case 11:
                System.out.print("Qual o valor da área em metros quadrados ? :");
                metros_quadrados = entrada.nextFloat();

                acres = (float) (metros_quadrados * 0.000247);

                System.out.println("Valor da área em metros quadrados convertidos para acres é: " + acres);
                break;

            case 12:
                System.out.print("Qual o valor da área em Acres ? :");
                acres = entrada.nextFloat();

                metros_quadrados = (float) (acres * 4048.58);

                System.out.println("Valor da área em acres convertidos para metros quadrados é: " + metros_quadrados);
                break;

            case 13:
                System.out.print("Qual o valor da área em metros quadrados ? :");
                metros_quadrados = entrada.nextFloat();

                hectares = (float) (metros_quadrados * 0.0001);

                System.out.println("Valor da área em metros quadrados convertidos para hectares é: " + hectares);
                break;

            case 14:
                System.out.print("Qual o valor da área em hectares ? :");
                hectares = entrada.nextFloat();

                metros_quadrados = (float) (hectares * 10000);

                System.out.println("Valor da área em hectares convertidos para metros quadrados é: " + metros_quadrados);
                break;
            case 15:
                System.out.print("Qual a distância em milhas? : ");
                milhas = entrada.nextFloat();

                quilometros = (float) (1.61 * milhas);

                System.out.println("A distância convertida de milhas para quilômetros é : " + quilometros);
                break;
            case 16:
                System.out.print("Qual a distância em quilômetros? : ");
                quilometros = entrada.nextFloat();

                milhas = (float) (quilometros / 1.61);

                System.out.println("A distância convertida de milhas para quilômetros é : " + milhas);
                break;

            case 17:
                System.out.println("Qual é a velocidade em KM/H: ");
                K = entrada.nextInt();

                M = (float) (K / 3.6);

                System.out.println("A velocidade convertida para m/s (metros por segundo) é : " + M);
                break;

            case 18:
                System.out.println("Qual é a velocidade em m/s ");
                M = entrada.nextInt();

                K = (float) (M * 3.6);
                System.out.println("A velocidade convertida para KM/H (quilometros por hora) é :  " + K);
                break;

            case 19:
                System.out.println("Qual é a temperatura em Celsius: ");
                Celsius = entrada.nextInt();

                Fahrenheit = (float) (Celsius * (9.0 / 5.0) + 32);

                System.out.println("A temperatura convertida para Fahrenheit é " + Fahrenheit);
                break;
            case 20:
                System.out.println("Qual é a temperatura em Fahrenheit: ");
                Fahrenheit = entrada.nextInt();

                Celsius = (float) (5.0 * (Fahrenheit - 32.0) / 9.0);
                System.out.println("A temperatura convertida para Celsius é " + Celsius);
                break;
            case 21:
                System.out.println("Qual é a temperatura em Celsius: ");
                Kelvin = entrada.nextInt();

                Celsius = (float) (Kelvin - 273.15);
                System.out.println("A temperatura convertida para Celsius é " + Celsius);
                break;
            case 22:
                System.out.println("Qual é a temperatura em Kelvin: ");
                Celsius = entrada.nextInt();

                Kelvin = (float) (Celsius + 273.15);
                System.out.println("A temperatura convertida para Kelvin é " + Kelvin);
                break;

            default:
                System.out.println("Opção inválida");
        }
    }
}
