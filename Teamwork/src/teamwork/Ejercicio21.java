
package teamwork;

public class Ejercicio21 {
    
    private double l1 = 3;
    private double l2 = 2;
    private double l3 = 3;
    private double p, sp, a;
    
    public double perimetro(){
        return l1+l2+l3;
    }
    
    public double semiperimetro(){
        return (l1+l2+l3)/2;
    }
    
    public double area(){
        
        if(l1 == l2 && l1 == l3)
        {
            a = Math.sqrt(3)* Math.pow(l1,2) / 4;
        }
        else if(l1 != l2 && l1 != l3)
        {
            //formula de heron
            double s;
            s = (l1+l2+l3)/2;
            a = Math.sqrt(s*(s-l1)*(s-l2)*(s-l3));
        }
        else
        {
            a = (l2*Math.sqrt(Math.pow(l1, 2)-(Math.pow(l2, 2)/4)))/2;
        }
        return a;
    }
    
    
    
}
