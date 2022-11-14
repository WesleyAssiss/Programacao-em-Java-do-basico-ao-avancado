/*
Wesley Elbert Assis
*/

/*

1-> Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:

a) Atribua os seguintes valores a esse vetor: 1,0,5,-2,-5,7.
b) Armazene em uma variável inteira(simples) a soma entre os valores das 
posições A[0],A[1] e A[5] do vetor e mostre na tela esta soma.
c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
d) Mostre na tela cada valor do vetor A, um em cada linha.

*/
package Secao4;


public class programa010 {
    public static void main(String[] args) {
        int soma;
        int vetorA[] = {1,0,5,-2,-5,7};
        //Modificando o valor do vetor na posicão[4]
        vetorA[4] = 100;
        
        soma = vetorA[0] + vetorA[1] + vetorA[5];
        System.out.println("A soma da posição dos vetores vetorA[0], vetorA[1] e vetorA[5] é: " + soma);
        System.out.println("Atribuindo o valor 100 no vetorA[4] =  " + vetorA[4] + "\n" );
        
        for (int i = 0; i < vetorA.length; i++) {           
            System.out.println("  " + vetorA[i]); 
            
        }
        
        System.out.println();
        
    }
}
