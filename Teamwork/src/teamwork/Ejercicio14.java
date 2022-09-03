
package teamwork;
import java.util.Scanner;

public class Ejercicio14 {
    
    private int vd1, vd2, vd3;
    private double sven, sven1, sven2, sven3;
    
    Ejercicio14(){
        System.out.print("Ingrese las ventas del departamento 1: ");
        Scanner scanner = new Scanner(System.in);
        vd1 = scanner.nextInt();
        System.out.print("Ingrese las ventas del departamento 2: ");
        vd2 = scanner.nextInt();
        System.out.print("Ingrese las ventas del departamento 3: ");
        vd3 = scanner.nextInt();
        System.out.print("Ingrese el salario de los vendedores: ");
        sven = scanner.nextInt();
    }
    
    public String incentivo(){
        double per = (vd1+vd2+vd3)*0.33;
        if(vd1>per){
            sven1 = sven1+sven1*0.2;
        }
        else{
            sven1 = sven;
        }
        if(vd2>per){
            sven2 = sven2+sven2*0.2;
        }
        else{
            sven2 = sven;
        }
        
        if(vd3>per){
            sven3 = sven3+sven3*0.2;
        }
        else{
            sven3 = sven;
        }
        
        return "Salario vendedores depto.1 " + sven1 + 
                " Salario vendedores depto.2 " + sven2 + 
                " Salario vendeores dept.3 " + sven3;
    }

}
