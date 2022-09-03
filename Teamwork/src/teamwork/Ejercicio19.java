
package teamwork;

public class Ejercicio19 {
    
    private double l = 5;
    private double p,h, a;
    
    public double perimetro(){
        return l*3;
    }
    
    public double altura(){
        return (l/2) * Math.sqrt(3);
    }

    public double area(){
        return Math.sqrt(3)* Math.pow(l,2) / 4;
    }

}
