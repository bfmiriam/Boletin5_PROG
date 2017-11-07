
package boletin5_7;


import static boletin5_7.Clase1.PI;
import java.util.Scanner;


public class Boletin5_7 {

    
    public static void main(String[] args) {
        
    Scanner ler=new Scanner(System.in);
    
    
    System.out.println("Prema 1 para calcular a superficie dun cadrado.");
    System.out.println("Prema 2 para calcular a superficie dun triángulo."); 
    System.out.println("Prema 3 para calcular a superficie dun círculo."); 
    int num=ler.nextInt();
    
    Clase1 obj=new Clase1();
  
    obj.comparar(num);
       
  }
    
}
