
package boletin5_1;

import java.util.Scanner;


public class Boletin5_1 {

  
        public static void main(String[] args) {
       
        Scanner ler=new Scanner (System.in);
        
        System.out.println("introduce número:");
        int num=ler.nextInt();
        
        Clase1 numero= new Clase1(num);
       
        numero.condicional(); 
        
        
    }
    
}
