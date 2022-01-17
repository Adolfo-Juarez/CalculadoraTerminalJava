
package calculadora1;
import java.util.Scanner;

public class Operaciones {
    
    public float Sumar (float Num1, float Num2, float r){
        
        r = Num1+Num2;
        System.out.println(Num1+" + "+ Num2 + " = "+r);
        return r;
    }
    
    public float Restar (float Num1, float Num2, float r){
        
        r = Num1-Num2;
        System.out.println(Num1+" - "+ Num2 + " = "+r);
        return r;
    }
    
    public float Dividir(float Num1, float Num2, float r){
        
        r = Num1/Num2;
        System.out.println(Num1+" / "+ Num2 + " = "+r);
        return r;
    }
    
    public float Multiplicar(float Num1, float Num2, float r){
        
        r = Num1*Num2;
        System.out.println(Num1+" x "+ Num2 + " = "+r);
        return r;
    }
    
    public boolean Continuar (){
        
        boolean rtrn = false, salir=false;
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("a)Añadir otro número\nb)Salir\n> ");
            String opcion = sc.next();

            switch(opcion){
                case "a","A":
                    rtrn = true;
                    salir=true;
                    break;
                case "b","B":
                    rtrn = false;
                    salir=true;
                    break;
                default:
                    System.out.println("Escoja una opción váida e intente de nuevo");
                    salir=false;
                    break;
            }
        }while(salir==false);
        
        return rtrn;
    }
}
