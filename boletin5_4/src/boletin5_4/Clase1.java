
package boletin5_4;


public class Clase1 {
    
    public String nome1, nome2;
    public float peso1, peso2, diferenza;
    
public Clase1(float peso1, float peso2, String nome1, String nome2){
    
    this.peso1=peso1;
    this.peso2=peso2;
    this.nome1=nome1;
    this.nome2=nome2;
}
    
    
public void condicional(){
    
    if(peso1>peso2){
        System.out.println("Pesa máis "+nome1+" con "+peso1+" Kg");
    }
    else{
        System.out.println("Pesa máis "+nome2+" con "+peso2+" Kg");
    }
    
}

public void diferenzaPeso(){
    
    if(peso1>peso2){
        diferenza=peso1-peso2;
        System.out.println("Entre "+ nome1+" e "+nome2+" teñen unha diferenza de peso de "+ diferenza+" Kg");
        
        
    }
   else{
    diferenza=peso2-peso1;
    System.out.println("Entre "+ nome1+" e "+nome2+" teñen unha diferenza de peso de "+ diferenza+" Kg");
    
}
}


}
