/*
Vetores parte 1

Arrays {vetores uni-dimensionais}

int numeros[5];//0..4(n-1) 5 - 1 = 4.
           [indice]


numeros[0] = 1;//primeiro elemento
numeros[1] = 3;//segundo elemento
numeros[2] = 5;//terceiro elemento
numeros[3] = 7;//quarto elemento
numeros[4] = 9;//quinto elemento
 */
package Secao4;

public class programa006 {

    public static void main(String[] args) {
        //Declarando um vetor
        int vetor[];

        //Declarando e especificando o tamanho do vetor
        int numeros[] = new int[5];

        numeros[0] = 1;//primeiro elemento
        numeros[1] = 3;//segundo elemento
        numeros[2] = 5;//terceiro elemento
        numeros[3] = 7;//quarto elemento
        numeros[4] = 9;//quinto elemento

        //Declarar, especificando o tamanho e inicializando.
        int nums[] = {1, 3, 5, 7, 9};

        float valores[] = new float[5];
        char caracteres[] = new char[20];
        String nomes[] = new String[4];

        String frutas[] = {"Manga", "Uva", "Banana"};

        System.out.println(numeros[0] + " " + numeros[1] + " "
                + numeros[2] + " " + numeros[3] + " " + numeros[4]);

        System.out.println(frutas[1] + " " + frutas[2] + " " + frutas[0]);

        System.out.println(caracteres[0]);
        System.out.println(valores[2]);
    }
}
