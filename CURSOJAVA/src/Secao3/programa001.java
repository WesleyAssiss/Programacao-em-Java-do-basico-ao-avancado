/*
Faça um programa que determine e mostre os cincos primeiros múltiplos de 3, 
considerando números maiores que 0.
 */
package Secao3;


public class programa001 {

    public static void main(String[] args) {
       
        System.out.println("Eis os 5 primeiros numeros multiplos de 3");
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}

       
