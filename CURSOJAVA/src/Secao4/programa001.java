/*
Tipos de dados     
Numéricos (Inteiros e Reais)
 */
package Secao4;

public class programa001 {

    public static void main(String[] args) {
        //Tipo primários
        long num0 = 99; //Inteiro 9999999999999999999
        int num1 = 4; //Inteiro 999999999999
        short num2 = 4; //Inteiro(curto/menor/baixo)999999
        byte num3 = 4;
        char num4 = 34;
        //Tipos não primários
        Integer num5 = 98;
        Short num6 = 7;
        Byte num7 = 9;
        Long num8 = 99999999999999999L;
        Character num9 = 35;

        System.out.println("long -> Num0 = " + num0);
        System.out.println("int -> Num1 = " + num1);
        System.out.println("short -> Num2 = " + num2);
        System.out.println("byte -> Num3 = " + num3);
        System.out.println("char -> Num4 = " + num4);
        //Tipos não primários
        System.out.println("Integer -> Num5 = " + num5);
        System.out.println("Short -> Num6 = " + num6);
        System.out.println("Byte -> Num7 = " + num7);
        System.out.println("Long -> Num7 = " + num8);
        System.out.println("Character -> Num7 = " + num9);
        

        //Valor em Bits.
        System.out.println("\nlong/Long -> " + Long.SIZE + " bits");
        System.out.println("int/Integer -> " + Integer.SIZE + " bits");
        System.out.println("short/Short -> " + Short.SIZE + " bits");
        System.out.println("byte/Byte -> " + Byte.SIZE + " bits \n");
        System.out.println("char/Character -> " + Character.SIZE + " bits \n");
        
        
        //Valor Maximo e Minimo suportado.
        System.out.println("Valor Min long/Long  -> " + Long.MIN_VALUE);
        System.out.println("Valor Max long/Long -> " + Long.MAX_VALUE +"\n");
        
        System.out.println("Valor Min int/Integer  -> " + Integer.MIN_VALUE);
        System.out.println("Valor Max int/Integer -> " + Integer.MAX_VALUE +"\n");
        
        System.out.println("Valor Min short/Short -> " + Short.MIN_VALUE);
        System.out.println("Valor Max short/Short -> " + Short.MAX_VALUE + "\n");
        
        System.out.println("Valor Min byte/Byte -> " + Byte.MIN_VALUE);
        System.out.println("Valor Max byte/Byte -> " + Byte.MAX_VALUE + "\n");
        
        System.out.println("Valor Min char/Character -> " + Character.MIN_VALUE);//0
        System.out.println("Valor Max char/Character -> " + Character.MAX_VALUE);//65535
    }
}
