/*
Wesley Elbert Assis
 */

 /*

34-> Faça um programa para ler 10 números DIFERENTES a serem armazenados em um
vetor. Os dados deverão ser armazenados no vetor na ordem que forem sendo lidos,
sendo que no caso o usuário digite um número que já foi digitado anteriormente, o 
programa deverá pedir para ele digitar outro número.Note que cada valor digitado pelo
usuário deve ser pesquisado no vetor, verificando se ele existe entre os números que já
foram fornecidos.Exibir na tela o vetor final que foi digitado.

 */
package Secao4;

import java.util.ArrayList;
import java.util.Scanner;

public class programa042 {

    public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
    public static final String YELLOW_BOLD = "\033[1;33m"; // YELLOW

    public static void preencher() {
        int vetor[] = new int[4];
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner entrada = new Scanner(System.in);

        String aux = ("O Número: ");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print(YELLOW_BOLD + "Digite o valor " + (i + 1) + " de " + vetor.length + " do vetor: ");
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {

            for (int j = 0; j < vetor.length; j++) {

                if (vetor[i] == vetor[j] && j != i) {

                    if (!lista.contains(vetor[i])) {
                        lista.add(vetor[i]);

                    }
                }

            }

        }

        for (Integer integer : lista) {
            aux += integer + ",";
        }
       

            System.out.println("\n");
            System.out.println(GREEN_BOLD + aux + " já foi inserido");
            System.out.println("\n \n");

        
    }

    public boolean contem(int[] x, int n) {
        for (int i = 0; i < x.length; i++) {
            if (n == x[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        preencher();
    }
}
