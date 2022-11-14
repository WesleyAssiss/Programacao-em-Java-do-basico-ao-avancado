/*
Operações Matemáticas
 */
package Secao4;


public class programa005 {
    public static void main(String[] args) {
        int num1 = 6, num2 = 2, res;
        
        int num3 = 9, num4 = 5;
        float resultado;
        
        //Soma
        res = num1 + num2;
        System.out.println("A soma dos números: " + num1 + " e " + num2 + " é = " + res);
        //subtração
        res = num1 - num2;
        System.out.println("A subtração dos números: " + num1 + " e " + num2 + " é = " + res);
        //divisão
        res = num1 / num2;
        System.out.println("A divisão dos números: " + num1 + " e " + num2 + " é = " + res);
        //multiplicação
        res = num1 * num2;
        System.out.println("A multiplicação dos números: " + num1 + " e " + num2 + " é = " + res);
        
        
        //Divisão (Real)
        resultado = (float)num3 / num4;
        System.out.println("A divisão dos números: " + num3 + " e " + num4 + " é = " + resultado);
        
        //Módulo
        /*
        Se o resto do módulo da variavel por 2 for igual a 0, a variavel é par.
        Se o resto do módulo da variavel por 2 for igual a 1, a variavel é ímpar.
        */
        resultado = num3 % 2;
        System.out.println("O resto da divisão é: " + num3 + " por 2 é = " + resultado);
        
    }
}
