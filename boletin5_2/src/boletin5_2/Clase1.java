
package boletin5_2;


public class Clase1 {
    
    public short num1, num2;
    
    
    public Clase1(short num1, short num2){
        this.num1=num1;
        this.num2=num2;
        
    }
   
    public void condicion (){
        
        if(num1>=num2){
            System.out.println("resta: "+(num1-num2));
            System.out.println("suma : "+(num1+num2));
        }
        else{
            System.out.println("suma : "+(num1+num2));
        }   
    }

}
