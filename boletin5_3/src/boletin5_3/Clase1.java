
package boletin5_3;


public class Clase1 {
    
    
    private int num;
    
public Clase1(){
    
 }

public Clase1(int num){
     
     this.num=num;
}
      
public void condicion(){
     if (num>0){
         System.out.println("+");
     }
     else if (num<0){
         System.out.println("-");
     }
     else {
     System.out.println("0");
    }
 }
    
}
