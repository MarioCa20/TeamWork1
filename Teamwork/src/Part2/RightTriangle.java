
package Part2;

public class RightTriangle {
    int base; 
    int altura; 

    public RightTriangle(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura / 2);
    }

    public double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }
    
    public double calcularHipotenusa() {
        return Math.pow(base*base + altura*altura, 0.5);
    }

    public void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura == calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero");
    else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
        System.out.println("Es un triángulo escaleno");
    else 
        System.out.println("Es un triángulo isósceles");
    }

}
