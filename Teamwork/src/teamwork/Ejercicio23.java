
package teamwork;


public class Ejercicio23 {
    //dado a b c
    private double a = 3,b = 2,c = -1;
    
    public String solver(){
        double sol[];
        double disc = (Math.pow(b, 2) - (4 * a * c));
        if (disc >= 0) {

            // Una solucion
            if(disc == 0){
                double s = ((-b) - (4 * a * c)) / (2 * a);
                return "La solucion es: " + s;

            // Dos soluciones
            }else{
                double s1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                double s2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
                return "Las soluciones son: " + s1 + " y " + s2;
            }

            
        } else {
            // Sin solucion
            return "No tiene solucion";
        }
    }
}
