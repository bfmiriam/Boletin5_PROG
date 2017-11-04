
package boletin5_3;

import java.util.Scanner;


public class Boletin5_3 {

    
    public static void main(String[] args) {
       
    Scanner ler=new Scanner (System.in);
        
    System.out.println("Introduce número :");
    int num= ler.nextInt();
    
    Clase1 obj= new Clase1(num);
    
    obj.condicion();
        
    }
    
}
