/*
Faça um algoritmo utilizando o comando while que mostra uma contagem regressiva
na tela, iniciando em 10 e terminando em 0. Mostrar uma mensagem "FIM!" após a contagem.
 */
package Secao3;

import java.util.Scanner;

/**
 *
 * @author wesle
 */
public class programa003 {

    public static void main(String[] args) {
        int cont = 11;
        

        System.out.println("Contagem regressiva de 10 a 0");

        
        while (cont > 0) {
           cont--;
            System.out.println(cont);
            
        }
     
    }

}
