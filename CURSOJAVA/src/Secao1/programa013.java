package Secao1;


import java.util.Scanner;

//Sejam a e b os catetos de um triângulo, onde a hipotenusa é obtida pela equação
//hipotenusa = a² + b². Faça um programa que receba os valores de a e b e calcule
// o valor da hipotenusa através da equação.Imprima o resultado dessa operação.
public class programa013 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int a, b;
        float hipotenusa;

        System.out.println("Insira o primeiro valor: ");
        a = entrada.nextInt();

        System.out.println("Insira o segundo valor: ");
        b = entrada.nextInt();

        //Cálculo da Hipotenusa.
        hipotenusa = ((a * a) + (b * b));
        hipotenusa =  (float) Math.sqrt(hipotenusa);
        
        //hipotenusa = (a * a) + (b * b);
        //hipotenusa =  (float) Math.pow(hipotenusa,0.5);

        System.out.println("A hipotenusa dos valores: " + a + " e " + b + " é : " + hipotenusa);

    }
}

