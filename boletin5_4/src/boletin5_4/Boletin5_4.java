
package boletin5_4;

import java.util.Scanner;


public class Boletin5_4 {

  
    public static void main(String[] args) {
        
        
    Scanner ler=new Scanner(System.in);
    
    
    System.out.println("Introduce nome 1: ");
    String nome1=ler.next();
    System.out.println("Introduce peso 1: ");
    float peso1=ler.nextFloat();
    System.out.println("Introduce nome 2: ");
    String nome2=ler.next();
    System.out.println("Introduce peso 2: ");
    float peso2=ler.nextFloat();
        
        
    Clase1 obj=new Clase1(peso1, peso2, nome1, nome2);
    
    obj.condicional();
   
    obj.diferenzaPeso();
    
   
 
    }
    
}
