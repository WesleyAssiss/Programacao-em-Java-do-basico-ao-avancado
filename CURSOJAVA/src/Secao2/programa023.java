/*
Leia a idade e o tempo de serviço de um trabalhador e escreva se
ele pode ou não se aposentar. As condições para aposentadoria são:
* Ter pelo menos 65 anos.
* Ou ter trabalhado pelo menos 30 anos
* Ou ter pelo menos 60 anos e trabalhado pelo menos 25 anos
 */
package Secao2;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class programa023 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        int idade,Tempo_Serviço;

        System.out.print("Digite sua idade : ");
        idade = entrada.nextInt();
        System.out.print("Digite o tempo de serviço: ");
        Tempo_Serviço = entrada.nextInt();

        if (idade >= 65 || Tempo_Serviço >= 30 || idade >= 60 && Tempo_Serviço >= 25  ) {
            System.out.println("Você pode se aposentar");
        }else{
             System.out.println("Você não pode se aposentar");
        }
    }
}
