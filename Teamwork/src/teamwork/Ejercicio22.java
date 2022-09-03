
package teamwork;


public class Ejercicio22 {
    
    private String name = "Mario Canas";
    private double shora = 10096.63;
    private int horaef = 192;
    private double salario;
    
    public String filtro(){
        salario = shora*horaef;
        if(salario>450000){
            return name + " devenga un salario de " + salario;
        }else{
            return name;
        }
    }
}
