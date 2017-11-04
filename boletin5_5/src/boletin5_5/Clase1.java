
package boletin5_5;


public class Clase1 {
    
    public int num1, num2, num3;
    
    
public Clase1(int num1, int num2, int num3){
    this.num1=num1;
    this.num2=num2;
    this.num3=num3;   
}

public void condicional(){
    
    if(num1>num2 && num1>num3){
    System.out.println(num1+" é o maior");
          
    }
    else if(num2>num1 && num2>num3){
    System.out.println(num2+" é o maior");
    }
    else{
    System.out.println(num3+" é o maior");  
    }
}



    
}
