/*
Wesley Elbert Assis
 */
package Secao5;


public class programa002 {
    public static void main(String[] args) {
        int valor1 = 6, valor2 = 4;
        //int res;
        //res = soma(valor1,valor2);
        
        
        System.out.println("O resultado é: " + soma(valor1,valor2, "Olá"));
        System.out.println(mensagem());
    }
    static int soma(int v1, int v2, String msg){
        System.out.println(msg);
        return v1 + v2;
        
    }
    static String mensagem(){
        return "Até mais!";
    }
}
