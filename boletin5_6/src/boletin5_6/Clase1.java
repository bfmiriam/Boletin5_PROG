
package boletin5_6;


public class Clase1 {
    
    public String artigo;
    public int ventasAnuais;
    
    
public Clase1(String ar,int va){
    artigo=ar;
    ventasAnuais=va;
    
}

public void condicional(){
    
    if(ventasAnuais<=100){
        System.out.println("É un artigo de consumo baixo");
    }
    else if(ventasAnuais<=500){
        System.out.println("É un artigo de consumo medio");
    }
    else if(ventasAnuais<=1000){
        System.out.println("É un artigo de consumo alto");
    }
    else {
        System.out.println("É un artigo de primeira necesidade");
    }
    
}

    
}
