/*
Tipos de dados Alfanuméricos
Caracteres e Strings
 */
package Secao4;

public class programa003 {

    public static void main(String[] args) {
        //Tipos primitivos
        char letra0 = 'a';
        char letra1 = 97;//97 em decimal na tabela ASCII é == a;

        System.out.println("Letra1 antes da soma -> " + letra1);
        letra1 = (char) (letra1 + 1);

        System.out.println("Letra0 -> " + letra0);
        System.out.println("Letra1 depois da soma -> " + letra1);

        //Tipos não primitivos
        Character letra3 = 'A';//So é aceito em Character se for com aspas simples.
        String nome = "Geek university";

        System.out.println("Letra3 -> " + letra3 + "\n");
        System.out.println("char/Character -> " + Character.SIZE + " bits ");
        System.out.println("Valor Min char/Character -> " + Character.MIN_VALUE);//0
        System.out.println("Valor Max char/Character -> " + Character.MAX_VALUE);//65535
        
        System.out.println("Nome -> " + nome);
        System.out.println("Tamanho da String -> " + nome.length());
        //Calculando quanto esta alocado na memoria de cada caracter. (Geek university)
        System.out.println("String -> " + Character.SIZE * nome.length() + " bits ");
        
    }
}
