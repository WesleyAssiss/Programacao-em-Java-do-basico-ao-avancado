package Secao1;


import java.util.Scanner;

//Leia um valor em real e a cotação em dolares. Em seguida imprima o valor
//correspondente em dólares
public class programa009 {
  public static void main (String[]args){
      
 Scanner entrada = new Scanner(System.in);
    float real;
    float cotacao_dolar;
    float valor_dolar;
    
    System.out.print("Digite o valor em real: ");
    real = entrada.nextFloat();
    
 
    System.out.print("Digite a cotação do dolar: ");
    cotacao_dolar = entrada.nextFloat();

   

    valor_dolar = cotacao_dolar * real;

    System.out.print("O Valor em dólar é : " + valor_dolar + "\n");

  }

}
