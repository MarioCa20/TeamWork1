
package teamwork;
import java.util.Scanner;

public class Ejercicio15 {
    
    private int a,b,c,d;
    
     
    Ejercicio15(){
        System.out.print("Ingrese el peso de la esfera A: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.print("Ingrese el peso de la esfera B: ");
        b = scanner.nextInt();
        System.out.print("Ingrese el peso de la esfera C: ");
        c = scanner.nextInt();
        System.out.print("Ingrese el peso de la esfera D: ");
        d = scanner.nextInt();       
    }
    
    public String peso(){
        
        char dif;
        String type;
        if(a == b && a == c){
            dif = 'D';
            if(d>a){
                type = "mayor";
            }else{
                type = "menor";
            }
        }
        else{
            if(a == b && a == d){
                dif = 'C';
                if(c>a){
                    type = "mayor";
                }else{
                    type = "menor";
                }
            }
            else{
                if(a == c && a == d){
                    dif = 'B';
                    if(b>d){
                        type = "mayor";
                    }else{
                        type = "menor";
                    }
                }
                else{
                    dif = 'A';
                    if(a>b){
                        type = "mayor";
                    }else{
                        type = "menor";
                    }
                }
            }
        }
        return "La esfera " + dif + " es la diferente y es de " + 
                type + " peso";
    }
        
}
