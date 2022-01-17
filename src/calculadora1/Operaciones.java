
package calculadora1;

public class Operaciones {
    
    public float Sumar (float Num1, float Num2){
        float r;
        
        r = Num1+Num2;
        return r;
    }
    
    public float Restar (float Num1, float Num2){
        float r;
        
        r = Num1-Num2;
        return r;
    }
    
    public float Dividir(float Num1, float Num2){
        float r;
        
        r = Num1/Num2;
        return r;
    }
    
    public float Multiplicar(float Num1, float Num2){
        float r;
        
        r = Num1*Num2;
        return r;
    }
    
    public boolean Continuar (){
        System.out.println("Yeah, it's work!");
        return true;
    }
}
