
package boletin5_6;

import java.util.Scanner;


public class Boletin5_6 {

  
    public static void main(String[] args) {
        
        
    Scanner ler=new Scanner(System.in);
     
    System.out.println("Introduce o nome do artigo: ");
    String ar=ler.next();
    System.out.println("Introduce as vendas anuais: ");
    int va=ler.nextInt();
    
    Clase1 obj=new Clase1(ar, va);
    
    obj.condicional();
        
        
        
        
        
    }
    
}
