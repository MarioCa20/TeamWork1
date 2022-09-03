
package teamwork;
import java.util.Scanner;

public class Ejercicio7 {
    
    private int a,b;
    
    Ejercicio7(){
        System.out.print("Ingresa el numero A: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.print("Ingresa el numero B: ");
        b = scanner.nextInt();
        scanner.close();
    }
    
    public String mayor(){

        if(a>b){
            return a + " es mayor que " + b;
        } 
        else if(b>a){
            return b + " es mayor que " + a;
        }else{
            return a + " es igual a " + b;
        }
        
        
    }

    
}
