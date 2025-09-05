/*
Wesley Elbert Assis
 */

 /*

2 -> Faça um funcão que recebe a data atual (dia, mês e ano em inteiro) e exiba-a na
tela no formato textual por extenso. Exemplo: Data: 01/01/2000, Imprimir: 1 de janeiro de
2000

 */
package Secao5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class programa004 {


  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String cidade;

    System.out.printf("Informe o nome da Cidade:\n");
    cidade = entrada.nextLine();

    System.out.printf("\nResultado:\n");
    System.out.printf("%s\n", DataPorExtenso(cidade, new java.util.Date()));
  }

  public static String NomeDoMes(int i, int tipo) {
    String mes[] = {"janeiro", "fevereiro", "março", "abril",
      "maio", "junho", "julho", "agosto", "setembro", "outubro",
      "novembro", "dezembro"};
    if (tipo == 0) {
        return(mes[i-1]);
    } else {
        return(mes[i-1].substring(0, 3));
    } 
  }


  public static String DiaDaSemana(int i, int tipo) {
    String diasem[] = {"Domingo", "Segunda-feira", "Terça-feira",
      "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};
    if (tipo == 0) {
        return(diasem[i-1]);
    } else {
        return(diasem[i-1].substring(0, 3));
    }
  }

  public static String DataPorExtenso(String cidade, java.util.Date dt) {
    @SuppressWarnings("deprecation")
    int d = dt.getDate();
    @SuppressWarnings("deprecation")
    int m = dt.getMonth()+1;
    @SuppressWarnings("deprecation")
    int a = dt.getYear()+1900;

    Calendar data = new GregorianCalendar(a, m-1, d);
    int ds = data.get(Calendar.DAY_OF_WEEK);

    return(cidade + ", " + d + " de " + NomeDoMes(m, 0) + " de " +
      a + " (" + DiaDaSemana(ds, 1) + ").");
  }

}

