/*
Wesley Elbert Assis
 */

 /*

32-> Leia dois vetores de inteiros x e y, cada um com 5 elementos(assuma que o usuário
não informa elementos repetidos). Calcule e mostre os vetores resultantes em cada caso
abaixo:

   . Soma entre x e y: Soma de cada elemento de x com o elemento da mesma posição
em y.
   . Produto entre x e y: Multiplicação de cada elemento de x com o elemento da mesma
posição em y.
   . Diferença entre x e y: Todos os elementos de x que não existam em y.
   . Interseção entre x e y: Apenas os elementos que aparecem nos dois vetores.
   . União entre x e y: Todos os elementos de x, e todos os elementos de y que não
estão em x.

 */
package Secao4;

import java.util.Scanner;

public class programa040 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
//declaracao das variaveis, vetores, contadores e as operações

        
        int vetor1[] = new int[2];
        int vetor2[] = new int[2];
        int uniao[] = new int[4];
        int dif[] = new int[2];
        int inter[] = new int[2];
        int soma[] = new int[6];
        int mult[] = new int[2];

        for (int x = 0; x < vetor1.length; x++) {
            System.out.print("Digite o valor " + (x + 1) + " de " + vetor1.length + " do vetor1: ");
            System.out.println("Valores do vetor X, posicao: [" + x + "]");
            vetor1[x] = entrada.nextInt();

        }

        System.out.println("-----------------------------------------------------------");

        System.out.println("\n \n");
        for (int x = 0; x < vetor2.length; x++) {
            System.out.print("Digite o valor " + (x + 1) + " de " + vetor2.length + " do vetor2: ");
            System.out.println("Valores do vetor Y, posicao: [" + x + "]");
            vetor2[x] = entrada.nextInt();

        }
        System.out.println("-----------------------------------------------------------");

        /*UNIAO*/
        System.out.println(" ---UNIÃO--- ");

        for (int x = 0; x < vetor1.length; x++) {
            if (vetor1[x] == vetor2[x]) {
                uniao[x] = vetor1[x] & vetor2[x];
            }
            System.out.println("União: " + uniao[x]);
        }
        System.out.println();
        /*DIFERENÇA*/
        System.out.println(" ---DIFERENÇA--- ");
        for (int x = 0; x < vetor1.length; x++) {

            if (vetor1[x] != vetor2[x]) {//verifica as diferencas

                dif[x] = vetor1[x];

            }

            System.out.println("Diferença: " + dif[x]);

        }
        
        System.out.println();
       //SOMA
        System.out.println(" ---SOMA--- ");

        for (int x = 0; x < vetor1.length; x++) {

            soma[x] = vetor1[x] + vetor2[x];

            System.out.println("Soma: " + soma[x]);

        }
        System.out.println();
        /*MULTIPLICAÇÃO*/
        System.out.println(" ---MULTIPLICACÃO--- ");

        for (int x = 0; x < vetor1.length; x++) {

            mult[x] = vetor1[x] * vetor2[x];

            System.out.println("Multiplicação: " + mult[x]);

        }
        System.out.println();
        /*INTERSECÇÃO*/
        System.out.println(" ---INTERSECCAO--- ");

        for (int x = 0; x < vetor1.length; x++) {

            if (vetor1[x] == vetor2[x]) {

                inter[x] = vetor1[x];

                System.out.println("Interseção: " + inter[x]);

            } else {
                System.out.println(" NAO EXISTE "); //se houver algum numero que nao se encaixe em nenhumas das opções
            }
        }

    }

}



