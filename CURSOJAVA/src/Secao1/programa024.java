package Secao1;


import java.util.Scanner;

/* Implemente um programa em C que calcule o ano de nascimento de uma pessoa a partir
de sua idade e do ano atual */
public class programa024 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade, ano_atual, ano_nasc;
        
        System.out.println("Digite sua idade: ");
        idade = entrada.nextInt();
        
        System.out.println("Insira em que ano estamos: ");
        ano_atual = entrada.nextInt();
        
        ano_nasc = ano_atual - idade;
        System.out.println("Voce nasceu em: " + ano_nasc);
        

    }
}
