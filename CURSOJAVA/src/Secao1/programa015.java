/*
Wesley Elbert Assis
*/

package Secao1;


import java.util.Scanner;

public class programa015 {

    Scanner entrada = new Scanner(System.in);

    int a, b, c;
    double delta, x1, x2;

    public programa015() {
        FormulaBhaskara();
    }

    private void FormulaBhaskara() {

        System.out.println("Digite o valor de A:  ");
        a = entrada.nextInt();
        System.out.println("Digite o valor de B:  ");
        b = entrada.nextInt();
        System.out.println("Digite o valor de C:  ");
        c = entrada.nextInt();

        //Fórmula de Bhaskara
        delta = ((b * b) + (-4 * (a * c)));

        System.out.println("Delta: " + delta);

        //Se Delta for maior ou igual a 0 irá calcular X.      
        if (delta >= 0) {
            calculaX();
       System.out.println("Raiz de Delta é " + Math.sqrt(delta));
        //Se não o programa finaliza.
        } else {
            System.out.println("Delta não possui raiz!");
            System.exit(0);
        }

    }

    //Calculando X (Caso Necessário).
    private void calculaX() {

        x1 = (-b + Math.sqrt(delta)) / (2 * a);

        System.out.println("x1 = " + x1);

        x2 = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("x2 = " + x2);

    }

    public static void main(String[] args) {
        new programa015();
    }

}
