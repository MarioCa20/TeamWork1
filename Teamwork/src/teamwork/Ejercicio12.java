
package teamwork;
import java.util.Scanner;

public class Ejercicio12 {
    
    private String name;
    private int horas;
    private double vhora;
    
    Ejercicio12(){
        System.out.print("Ingrese su nombre: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        name = scanner.next();
        System.out.print("Ingrese el  numero de horas trabajadas: ");
        horas = scanner.nextInt();
        System.out.print("Ingrese el valor por hora de trabajo: ");
        vhora = scanner.nextInt();
        
    }
    
    public String salario(){
        double vsalario;
        if(horas>40){
            int hext = horas-40;
            if(hext>8){
                int hexxt = hext-8;
                vsalario = 40*vhora + 8*2*vhora + hexxt*3*vhora;
            }else{
                vsalario = 40*vhora + hext*2*vhora;
            }
        }else{
            vsalario = horas*vhora;
        }
        
        return "El trabajdor " + name + " devengo: $" + vsalario;
    }
}
