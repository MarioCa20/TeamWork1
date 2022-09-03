
package teamwork;
import java.util.Scanner;

public class Ejercicio11 {
    
    private int a,b,c;
    
    Ejercicio11(){
        System.out.print("Ingresa el primer numero: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        b = scanner.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        c = scanner.nextInt();
    }
    
    public String mayor(){
        
        int mayor;
        if(a>b && a>c){
            mayor =  a;
        }
        else{
            if(b>c){
                mayor = b;
            }
            else{
                mayor = c;
            }
        }
        
        return "El valor mayor entre " + a + ", " + b + ", " + c + " es "
                + mayor;
        
    }
}
