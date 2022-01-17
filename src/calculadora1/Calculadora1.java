package calculadora1;
import java.util.Scanner;

public class Calculadora1{
    
    
    
    public static void main (String[] Args){
        boolean Salir = false;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("¡Bienvenidos a la calculadora en Java! \nIngrese el primer número para empezar a calcular: ");
        float Dato1 = sc.nextFloat();
        System.out.print("¡Excelente! Ahora ingresa el siguiente número e ingresa la operación que deseas realizar: ");
        float Dato2 = sc.nextFloat();
        Operaciones op = new Operaciones ();
        
        do{
            do{
                System.out.print("a)Sumar\nb)Restar\nc)Multiplicar\nd)Dividir\n> ");
                String Opcion = sc.next();

                switch(Opcion){
                    case "a","A": 
                        op.Sumar(Dato1,Dato2);
                        Salir=true;
                    break;
                    case "b","B":
                        op.Restar(Dato1,Dato2);
                        Salir=true;
                    break;
                    case "c","C":
                        op.Multiplicar(Dato1, Dato2);
                        Salir=true;
                    break;
                    case "d","D":
                        op.Dividir(Dato1, Dato2);
                        Salir=true;
                    break;
                    default:
                        System.out.println("Elija una opción válida e intente de nuevo");
                        Salir=false;
                    break;
                    }
            }while(Salir==false);
            
            Salir = op.Continuar();
            
            if (Salir==true){
                
            }
        }while(Salir==true);
        
    }
    
}