package Secao1;


import java.util.Scanner;

/* Três amigos jogaram na loteria. Caso eles ganhem, o prêmio deve ser repartido
proporcionalmente ao valor que cada deu para a realização da aposta. Faça um programa que
lê quanto cada apostador investiu, lê o valor do prêmio, e escreve quanto cada um ganharia.
*/

public class programa026 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        
    float amigo1, amigo2, amigo3, valor_arrecadado;
    float pacote1, pacote2, pacote3;
    float premio = (float) 980.000f;
     
     
    System.out.println("Valor aposta amigo 1: ");
     amigo1 = entrada.nextFloat();
     
    System.out.println("Valor aposta amigo 2: ");
    amigo2 = entrada.nextFloat();
    
    System.out.println("Valor aposta amigo 3: ");
     amigo3 = entrada.nextFloat();
    
    
    valor_arrecadado = amigo1 + amigo2 + amigo3;
    
    System.out.println("Valor arrecadado para aposta: " + valor_arrecadado);
   
    System.out.println("O valor do premio e: " + premio);
    
    

    pacote1 = (amigo1 * 100)/valor_arrecadado;
    pacote2 = (amigo2 * 100)/valor_arrecadado;
    pacote3 = (amigo3 * 100)/valor_arrecadado;
    
    
    System.out.println("Amigo 1 apostou: porcento do total arrecadado." + pacote1);
    System.out.println("Amigo 2 apostou: porcento do total arrecadado." + pacote2);
    System.out.println("Amigo 3 apostou: porcento do total arrecadado." + pacote3);
    
    
    System.out.println("Amigo 1 recebera: " +  premio * pacote1/100);
    System.out.println("Amigo 2 recebera: " + premio * pacote2/100);
    System.out.println("Amigo 3 recebera: " + premio * pacote3/100);
    
}

    
}
