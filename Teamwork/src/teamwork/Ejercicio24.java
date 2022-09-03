
package teamwork;


public class Ejercicio24 {
    
    private int a = 54, b = 224, c = 81;
    
    public String mayor(){
        
        char mayor;
        if(a>b && a>c){
            mayor = 'A';
        }
        else{
            if(b>c){
                mayor = 'B';
            }
            else{
                mayor = 'C';
            }
        }
        
        return "La esfera de mayor peso entre " + a + ", " + b + ", " +
                c + " es " + mayor;
        
    }
}
