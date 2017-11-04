
package boletin5_7;


import static boletin5_7.Clase1.PI;
import java.util.Scanner;


public class Boletin5_7 {

    
    public static void main(String[] args) {
        
    Scanner ler=new Scanner(System.in);
    
    
    System.out.println("Prema 1 para calcular a superficie dun cadrado");
    System.out.println("Prema 2 para calcular a superficie dun triángulo"); 
    System.out.println("Prema 3 para calcular a superficie dun círculo"); 
    int num=ler.nextInt();
    
    Clase1 obj=new Clase1();
  
    switch(num) { 
        
        case 1: System.out.println("Introduce valor do lado: ");
        int lado=ler.nextInt();
        System.out.println("A superficie do cadrado é "+ (lado*lado));
        break;
        
        case 2: System.out.println("Introduce valor da base: ");
        int base=ler.nextInt();
        System.out.println("Introduce valor da altura: ");
        int altura=ler.nextInt();
        System.out.println("A superficie do triángulo é "+ (base*altura/2));
        break;
        
        case 3: System.out.println("Introduce valor do radio: ");
        double radio=ler.nextDouble();
        System.out.println("A superficie do círculo é "+ (PI* Math.pow(radio, 2)));
        break;
        default: System.out.println("Opción incorrecta");
    }
       
  }
    
}
