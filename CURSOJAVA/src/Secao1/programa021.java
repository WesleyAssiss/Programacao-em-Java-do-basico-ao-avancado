package Secao1;

import java.util.Scanner;

public class programa021 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    String s;
    int i, n, Ascii = 0;

    System.out.println("Informe uma string: ");
    s = ler.nextLine();

    System.out.println();

    n = s.length(); // tamanho da string
    for (i=0; i<n; i++) {
// verifica se o i-ésimo caractere é a vogal 'a'
      if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a')) {
         Ascii = Ascii + 1;
         System.out.println(s.charAt(i) + Ascii);
      }
      else System.out.print(s.charAt(i));
    }

  }

}
