/*
Wesley Elbert Assis
 */

 /*
23->Ler dois conjuntos de números reais, armazendando-os em vetores e calcular o 
produto escalar entre eles.Os conjuntos têm 7 elementos cada.Imprimir os dois
conjuntos e o produto escalar, sendo que o produto escalar é dado por:
x1 * y1 + x2 * y2 + ... + xn * yn.
 */
package Secao4;

import java.util.Scanner;

public class programa031 {

    static int n = 7;

    // Função que retorna
    // produto escalar de dois vetores.
    public static int pontoProduto(int vetorA[], int vetorB[]) {

        int product = 0;

        // Loop para calcular o produto 
        for (int i = 0; i < n; i++) {
            product = product + vetorA[i] * vetorB[i];
        }
        return product;
    }

    // Função para encontrar
    // produto cruzado de dois arrays de vetores.
    public static void produtoEscalar(int vetorA[], int vetorB[],
            int produto_Escalar[]) {

        produto_Escalar[0]
                = vetorA[3] * vetorB[6]
                - vetorA[6] * vetorB[3];

        produto_Escalar[1]
                = vetorA[4] * vetorB[0]
                - vetorA[0] * vetorB[4];

        produto_Escalar[2]
                = vetorA[5] * vetorB[1]
                - vetorA[1] * vetorB[5];

        produto_Escalar[3]
                = vetorA[6] * vetorB[2]
                - vetorA[2] * vetorB[6];

        produto_Escalar[4]
                = vetorA[0] * vetorB[3]
                - vetorA[3] * vetorB[0];

        produto_Escalar[5]
                = vetorA[1] * vetorB[4]
                - vetorA[4] * vetorB[1];

        produto_Escalar[6]
                = vetorA[2] * vetorB[5]
                - vetorA[5] * vetorB[2];
    }

    // Código main
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vetorA[] = new int[7];
        int vetorB[] = new int[7];
        int produto_Escalar[] = new int[n];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetorA.length + " do vetor A: ");
            vetorA[i] = entrada.nextInt();
        }
        System.out.println("\n \n");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + " de " + vetorB.length + " do vetor B: ");
            vetorB[i] = entrada.nextInt();
        }
        System.out.println("\n \n");

        // chamada de função Escalar produto:
        System.out.print("Escalar produto: ");
        System.out.println(pontoProduto(vetorA, vetorB));

        // chamada de função pontoProduto
        System.out.print("Produto cruzado: ");
        produtoEscalar(vetorA, vetorB, produto_Escalar);

        // Faz um loop nessa impressão
        // produto cruzado de dois arrays de vetores.
        for (int i = 0; i < n; i++) {
            System.out.print(produto_Escalar[i] + " ");
        }
        System.out.println("\n \n");
    }
}

/*
produto_Escalar[0] = 
           vetorA[1] * vetorB[2]
         - vetorA[2] * vetorB[1];

produto_Escalar[1] =
          vetorA[2] * vetorB[0]
        - vetorA[0] * vetorB[2];

produto_Escalar[2] = 
          vetorA[0] * vetorB[1]
        - vetorA[1] * vetorB[0];
    }
 */
