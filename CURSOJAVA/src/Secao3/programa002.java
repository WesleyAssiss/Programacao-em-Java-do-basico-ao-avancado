/*
Wesley Elbert Assis
*/

/*
Escreva um programa que esreva na tela, de 1 até 100, 
de 1 em 1, 3 vezes. A primeira vez deve usar a 
estrutura de repetição FOR, a segunda WHILE, e a terceira DO WHILE.
 */
package Secao3;



public class programa002 {

    public static void main(String[] args) {
      
        int numero = 0;
        int contador = 0;
        int contador1 = 1;

        System.out.println("FOR");
        System.out.println("Numeros de 1 a 100");
        for (int i = 1; i <= 100; i++) {

            System.out.println(i + " ");

        }

        System.out.println("\n");
        System.out.println("While");
        System.out.println("Numeros de 1 a 100");

        while (contador < 100) {
            contador++;
            System.out.println(contador);
        }

        System.out.println("\n");
        System.out.println("Do While");
        System.out.println("Numeros de 1 a 100");
        //laço de repetição do-while

        do {
            System.out.println(contador1);
            contador1++;
        } while (contador1 <= 100);
//while(i != 1);
    }
}
