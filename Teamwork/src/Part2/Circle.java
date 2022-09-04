
package Part2;


public class Circle {
    int radio; 

    Circle(int radio){
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    public double calcularPerimetro() {
        return 2*Math.PI*radio;
    }
    
}

