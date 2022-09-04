
package Part2;


public class Rectangle {
    int base; 
    int altura; 

    Rectangle(int base, int altura) {
    this.base = base;
    this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return (2 * base) + (2 * altura);
    }

}
