
package teamwork;
import java.util.Scanner;

public class Ejercicio10 {
    
    private int ni;
    private String name;
    private int pat;
    private int est;
    private double pagmat = 50000;
    
    Ejercicio10(){
        System.out.print("Ingresa el numero de inscripcion: ");
        Scanner scanner = new Scanner(System.in);
        ni = scanner.nextInt();
        System.out.print("Ingresa tu nombre: ");
        scanner.useDelimiter("\n");
        name = scanner.next();
        System.out.print("Ingresa tu patrimonio: ");
        pat = scanner.nextInt();
        System.out.print("Ingresa tu estrato: ");
        est = scanner.nextInt();
    }
    
    public String info_est(){
        
        if(pat>2000000 && est>3){
            pagmat = pagmat + (pat*0.003);
        }
        
        return "El estudiante con numero de inscripcion " + ni + " y nombre " + name + " debe pagar: $" + pagmat;
    }
}
