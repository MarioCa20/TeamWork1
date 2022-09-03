
package teamwork;
import java.util.Scanner;

public class Ejercicio13 {
    
    private double vcomp;
    private String color;
    
    Ejercicio13(){
        System.out.print("Ingrese el valor de la compra: ");
        Scanner scanner = new Scanner(System.in);
        vcomp = scanner.nextInt();
        System.out.print("Ingrese el color: ");
        color = scanner.next();
        System.out.println(color);
    }
    
    public String descuento(){
        
        double valor;
        if(color.equals("blanca")){
            valor = vcomp;
        }
        if(color.equals("verde")){
            valor = vcomp-(vcomp*0.1);
        }
        if(color.equals("amarilla")){
            valor = vcomp-(vcomp*0.25);
        }
        if(color.equals("azul")){
            valor = vcomp-(vcomp*0.5);
        }
        else{
            valor = 0;
        }
        
        return "El cliente debe pagar: $" + valor;
    }
    
}
