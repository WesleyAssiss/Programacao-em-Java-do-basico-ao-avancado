/*
Wesley Elbert Assis
*/

/*
Faça um programa que leia 2 notas de um aluno, verifique se as notas
são válidas e exiba na tela a média destas notas. Uma nota válida deve ser,
obrigatoriamente,um  valor entre 0.0 e 10.0, onde caso a nota não possua 
um valor válido, este fato deve ser informado ao usuário e o programa termina.
 */
package Secao2;

import java.util.Scanner;

public class programa009 {

    public static void main(String[] args) {

        float nota1, nota2, total, media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digit a primeira nota");
        nota1 = entrada.nextFloat();

        System.out.println("Digit a primeira nota");
        nota2 = entrada.nextFloat();

        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10) {
            System.out.println("Nota inválida");
        }else{

            total = nota1 + nota2;
            media = total / 2;

            System.out.println("A media entre as notas é: " + media);

        }
    }
}
