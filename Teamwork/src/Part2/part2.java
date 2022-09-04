
package Part2;

/**
 *
 * @author Mario Cañas and Sebastian Arcila
 */
public class part2 {
    
    public static void main(String[] args) {
        Circle figura1 = new Circle(2);
        Rectangle figura2 = new Rectangle(1,2);
        Square figura3 = new Square(3);
        RightTriangle figura4 = new RightTriangle(3,5);
        
        System.out.println("El area del circulo es: " + figura1.calcularArea());
        
        System.out.println("El perimetro del circulo es: " + figura1.calcularPerimetro());
        
        System.out.println("El area del rectangulo es: " + figura2.calcularArea());
        
        System.out.println("El perimetro del rectangulo es: " + figura2.calcularPerimetro());
        
        System.out.println("El area del cuadrado es: " + figura3.calcularArea());
        
        System.out.println("El perimetro del cuadrado es: " + figura3.calcularPerimetro());
        
        System.out.println("El area del triangulo es: " + figura4.calcularArea());
        
        System.out.println("El perimetro del triangulo es: " + figura4.calcularPerimetro());
        
        System.out.println("La hipotenusa del triangulo es: " + figura4.calcularHipotenusa());
        
        figura4.determinarTipoTriangulo();
        
    }

}
