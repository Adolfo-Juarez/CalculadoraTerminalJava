
package calculadora1;
import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);
        System.out.println("a)Añadir otro número\nb)Salir\n> ");
        String opcion = sc.next();
        
        
        boolean rtrn, salir=false;
        switch(opcion){
            case "a","A":
                rtrn = false;
                break;
            case "b","B":
                rtrn = true;
                break;
            default:
                break;
        }
        
        return true;
    }
}
