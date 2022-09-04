
package Part2;


public class Square {
    int lado; 

    Square(int lado) {
        this.lado = lado;
    }
    
    public double calcularArea() {
        return lado*lado;
    }
    
    public double calcularPerimetro() {
        return (4*lado);
    }
}
