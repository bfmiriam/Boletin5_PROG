
package boletin5_5;

import java.util.Scanner;


public class Boletin5_5 {

   
    public static void main(String[] args) {
        
        
        Scanner ler=new Scanner(System.in);
        
        System.out.println("Introduce número 1: ");
        int num1=ler.nextInt();
        System.out.println("Introduce número 2: ");
        int num2=ler.nextInt(); 
        System.out.println("Introduce número 3: ");
        int num3=ler.nextInt();
        
        
        
        Clase1 obj=new Clase1(num1, num2, num3);
        
        obj.condicional();
        
    }
    
}
