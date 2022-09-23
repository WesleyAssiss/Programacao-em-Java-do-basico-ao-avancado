package Secao1;

//A importância de 780.000,00 será divida entre três ganhadores
// de um concurso. Sendo que da quantia total:
// > O primeiro ganhador receberá 46%
// > O segundo ganhador receberá 32%
// > O terceiro ganhador receberá o restante.
import java.util.Scanner;

//
public class programa014 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float premio = (float) 780.000;
        
        float ganhador1 = 0, ganhador2 = 0, ganhador3 = 0;
        float  desconto1,desconto2;
      
        //Valor total do prêmio
        System.out.println("O valor do prêmio é : " + premio + "\n");

        
        //ganhador1 recebe o valor do prêmio * 46%
        ganhador1 = (float) (premio * 0.46);     
        System.out.println("Primeiro ganhador recebe: " + ganhador1);
        //o valor do premio sendo descontado pelo valor do primeiro ganhador.
        desconto1 = premio - ganhador1;
        
        //valor do restante do prêmio * 32%.
        desconto2 = (float) (desconto1 * 0.32);
        //Ganhador recebendo a diferença do valor do desconto1 = 421 - o desconto2 = 134.
        ganhador2 = desconto1 - desconto2;
        System.out.println("Segundo ganhador recebe: " + ganhador2);
   
        
        //ganhador3 recebendo o restante do dinheiro do prêmio.
        ganhador3 = (premio - (ganhador1 + ganhador2));
        System.out.println("Terceiro ganhador recebe " + ganhador3);

    }

}
