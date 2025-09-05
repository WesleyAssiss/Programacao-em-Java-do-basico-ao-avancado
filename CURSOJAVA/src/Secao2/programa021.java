/*
Dados três valores, A,B,C, verificar se eles podem ser valores
os lados de um triângulo e, se forem, se é um triângulo escaleno,
equilátero ou isóscele, considerando os seguintes conceitos:

*O comprimento de cada lado de um triângulo, é menor do que a soma dos outros dois lados
*Chama-se equilátero o triângulo que tem três lados iguais
*Denominam-se isósceles o triângulo que tem o comprimento de dois lados iguais
*Recebe o nome de escaleno o triângulo que tem três lados diferentes

 */
package Secao2;

import java.util.Scanner;

public class programa021 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
    int a, b, c;

            System.out.println("Digite tres valores: ");
            a = entrada.nextInt();
            b = entrada.nextInt();
            c = entrada.nextInt();

            if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Os 3 lados formam um triangulo!\n");
                if (a == b && a == c) {
                    System.out.println("Equilatero\n");
                } else if (a == b || a == c || b == c) {
                    System.out.println("Isosceles\n");
                } else {
                    System.out.println("Escaleno\n");
                }
            } else {
                System.out.println("Os 3 lados NAO formam um trinagulo!\n");
            }
        }
    }

