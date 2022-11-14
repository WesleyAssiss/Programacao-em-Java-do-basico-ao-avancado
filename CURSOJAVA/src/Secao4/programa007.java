/*
Vetores
 */
//Ctrl e / Barra para comentar todas linhas.
package Secao4;

public class programa007 {

    public static void main(String[] args) {
        //Declaração e definição de tamanho do vetor
        int numeros[] = new int[10];
        System.out.println("Tamanho do vetor: " + numeros.length);

        for (int i = 0; i < numeros.length; i++) {
            //numeros[0] = i + 3;
            //numeros[9] = i(9) + 3;
            numeros[i] = i + 3;
        }
        System.out.println(numeros[0]);//primeiro elemento
        System.out.println(numeros[9] + "\n");//último elemento
        
      
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) Math.round(Math.random() * 10);
            
        }
         System.out.println(numeros[0]);//primeiro elemento
        System.out.println(numeros[9] + "\n");//último elemento
        
        //0...1 double
        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println(Math.round(Math.random()) * 10 + "\n");
        
        
        for (int i : numeros) {
            System.out.println(i);
            
        }
    }
}
