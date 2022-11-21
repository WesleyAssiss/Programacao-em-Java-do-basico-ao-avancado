/*
Wesley Elbert Assis
 */

 /*

11 -> Leia uma matriz de 10x10 elementos. Calcule a soma dos elementos que estão na 
diagonal secundária.

 */
package Secao4.Matrizes;

public class programa011 {

    public static void main(String[] args) {
        int matriz[][] = new int[10][10];
      

        System.out.println("---Matriz Identidade---");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = (i == j) ? 1 : 0;
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Soma dos elementos que estão na diagonal secundária.");
        for (int i = 0; i < matriz.length; i++) {
           
            matriz[i][i] = (i == i) ? (i) + (matriz.length + 1 - i) : 0;
            
                System.out.print("[" + matriz[i][i] + "]");
            }
        System.out.println("\n \n");
        
        
      /*
        OBSERVAÇÃO: Desta parte para baixo funcionará apenas se a matriz for 3x3
        caso contrário, não irá funcionar. 
        Vai ser necessário fazer a continuação do boolean.
        Só seguir a lógica: 
        Exemplo: Matriz 3x3
        i = 0     j = 2
        i = 1     j = 1
        i = 2     j = 0
        
        e assim sucessivamente.
        inserindo os valores da matriz[i][j] apenas da diagonal secundária
        
        */
          for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {                             
//Observação: Para melhor compreensão, analise um por um dos 4 System.
//System.out.print(i + " = " + j + " ?");// ( = ) -> igual

           matriz[i][j] = ((i == 9 && j == 0)
                        || (i == 8 && j == 1) 
                        || (i == 7 && j == 2)
                        || (i == 6 && j == 3) 
                        || (i == 5 && j == 4)
                        || (i == 4 && j == 5) 
                        || (i == 3 && j == 6)
                        || (i == 2 && j == 7) 
                        || (i == 1 && j == 8)
                        || (i == 0 && j == 9) ) ?  (i + 1) + (j + 1) : 0 ;
               
                
              
//             System.out.print(" " + (i + 1) );//Posição do i               
//              System.out.print(" " + (j + 1));// Posição do j               
//              System.out.print(" " + (((i == 2 && j == 0)
//                        || (i == 1 && j == 1) 
//                        || (i == 0 && j == 2))));//Onde for true é (i + j) onde for false é 0.
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }
      

    
        }
}
        
