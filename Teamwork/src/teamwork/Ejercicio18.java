
package teamwork;

public class Ejercicio18 {
    
    public int workerC = 17582;
    public String name = "Mario Canas";
    private int time = 192;
    private double valorh = 10096.63;
    private double pretencion = 2.3;
    private double sNeto, sBruto, retencion;
    
    public double sBruto(){
        sBruto = time*valorh;
        return time*valorh;
    }
    
    public double sNeto(){
        retencion = sBruto*(pretencion/100);
        return sBruto-retencion;
    }
    
}
