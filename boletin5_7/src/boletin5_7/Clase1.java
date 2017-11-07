
package boletin5_7;

import java.util.Scanner;


public class Clase1 {
    
    public int num;
    public int lado;
    public int base, altura;
    final static double PI=3.14;
    public double radio;
    
public Clase1(){
    
}
    
public Clase1(int num, int lado, int base, int altura, int radio){
    this.num=num;
    this.lado=lado;
    this.base=base;
    this.altura=altura;
    this.radio=radio;
   
    }
public void comparar(int num){
    Scanner ler=new Scanner(System.in);
    switch(num) { 
        
        case 1: System.out.println("Introduce valor do lado: ");
        int lado=ler.nextInt();
        System.out.println("A superficie do cadrado é "+ (Math.pow(lado,2)));
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
