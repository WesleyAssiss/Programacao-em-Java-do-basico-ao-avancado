
/*
Wesley Elbert Assis
*/
package Secao1;


import java.util.Scanner;

/* Faça um programa para ler um número inteiro, positivo de três dígitos, e gerar outro
número formado pelos dígitos invertidos do número lido. Exemplo:
NúmeroLido = 123
NúmeroGerado = 321. */
public class programa022 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, num1 = 0, num2 = 0, num3 = 0;
        System.out.println("Digite um numero inteiro de 3 digitos positivo: ");
        num = entrada.nextInt();
        if (num > 10) {
            num1 = num % 10;
            num = num / 10;
            num2 = num % 10;
            num = num / 10;
            num3 = num % 10;
            num = num / 10;
        }
        System.out.println("O número de trás pra frente é:  " + num1 + num2 + num3);

    }
}
