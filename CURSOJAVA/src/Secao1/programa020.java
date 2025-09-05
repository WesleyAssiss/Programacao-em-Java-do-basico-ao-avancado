/*
Wesley Elbert Assis
*/

package Secao1;


import java.util.Scanner;

/*  Faça um programa para converter uma letra maiúscula em letra minúscula. Use a tabela
ASCII. */
public class programa020 {

    public static void main(String[] args) {
        char maiuscula = 0, minuscula = 0, caractere_numerico = 0, caractere_alafabetico = 0;
        char vogal = 0, bit = 0, espaco_branco = 0;
        char vogalA = 0, vogalE = 0, vogalI = 0, vogalO = 0, vogalU = 0;
        char consoante = 0;
        String s;
        int i = 0, n, Ascii = 0;
        

        Scanner ler = new Scanner(System.in);

        System.out.println("Informe uma string: ");
        s = ler.nextLine();

        n = s.length(); // tamanho da string
        for (i = 0; i < n; i++) {

            if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a')) {
                Ascii = Ascii + 1;
            }

            System.out.println(s.charAt(i) + Ascii);

            // verificando se é um caractere alfabético maiúsculo:
            if ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')) {
                maiuscula = (char) (maiuscula + 1);
            }

            System.out.println(" alfabético maiúsculo: " + s.charAt(i) + maiuscula);

            //verificando se é um caractere alfabético minúsculo:
            if (((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
                    || ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))) {
                minuscula = (char) (minuscula + 1);
            }

            System.out.println(" alfabético minusculo: " + s.charAt(i) + minuscula);

            //verificando se é um caractere numérico:
            if ((s.charAt(i) >= '0') && (s.charAt(i) <= '9')) {
                caractere_numerico = (char) (caractere_numerico + 1);
            }

            System.out.println(" caractere numérico: " + s.charAt(i) + caractere_numerico);

            //verificando se é um caractere alfabético:
            if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a')) {
                caractere_alafabetico = (char) (caractere_alafabetico + 1);
            }

            System.out.println(" caractere alfabético: " + s.charAt(i) + caractere_alafabetico);

            //verificando se é a vogal 'a':
            if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a')) {
                vogal = (char) (vogal + 1);
            }

            System.out.println(" vogal: " + s.charAt(i) + vogal);

            //verificando se é um bit ('0' ou '1'):
            if ((s.charAt(i) == 0) || (s.charAt(i) == 1)) {
                bit = (char) (bit + 1);
            }

            System.out.println(" bit ('0' ou '1'): " + s.charAt(i) + bit);

            //verificando se é o espaço em branco: 
            if (s.charAt(i) == ' ') {
                espaco_branco = (char) (espaco_branco + 1);
            }

            System.out.println("espaço em branco:  " + s.charAt(i) + espaco_branco);

            //verificando as vogais separadamente:
            if ((s.charAt(i) == 'A') || (s.charAt(i) == 'a')) {
                vogalA = (char) (vogalA + 1);
            } else if ((s.charAt(i) == 'E') || (s.charAt(i) == 'e')) {
                vogalE = (char) (vogalE + 1);
            } else if ((s.charAt(i) == 'I') || (s.charAt(i) == 'i')) {
                vogalI = (char) (vogalI + 1);
            } else if ((s.charAt(i) == 'O') || (s.charAt(i) == 'o')) {
                vogalO = (char) (vogalO + 1);
            } else if ((s.charAt(i) == 'U') || (s.charAt(i) == 'u')) {
                vogalU = (char) (vogalU + 1);
            }

            System.out.println(" vogais separadamente:  " + s.charAt(i) + vogalA + vogalE + vogalI + vogalO + vogalU);

            //verificando se é uma consoante (caractere alfabético que não é vogal):
            if (((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z'))
                    || ((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z'))) {
                if ((s.charAt(i) != 'A') && (s.charAt(i) != 'a')
                        && (s.charAt(i) != 'E') && (s.charAt(i) != 'e')
                        && (s.charAt(i) != 'I') && (s.charAt(i) != 'i')
                        && (s.charAt(i) != 'O') && (s.charAt(i) != 'o')
                        && (s.charAt(i) != 'U') && (s.charAt(i) != 'u')) {
                    consoante = (char) (consoante + 1);
                }
            }
            System.out.println("  consoante separadamente:  " +s.charAt(i) + consoante);

        }
    }
}
