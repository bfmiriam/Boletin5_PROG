
package boletin5_2;

import java.util.Scanner;


public class Boletin5_2 {

    
    public static void main(String[] args) {
        
        
        Scanner ler=new Scanner (System.in);
        
        System.out.println("introduce primeiro número: ");
        short num1=ler.nextShort();
        
        System.out.println("introduce primeiro número: ");
        short num2=ler.nextShort();
        
        
       Clase1 clase= new Clase1 (num1, num2);
      
        clase.condicion();
      
      
      
      
        
    }
    
}
