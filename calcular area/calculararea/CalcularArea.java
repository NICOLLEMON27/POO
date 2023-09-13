
package calculararea;

import Geometria.circulo;
import Geometria.rectangulo;
import Geometria.triangulo;
import Geometria.cilindro;

public class CalcularArea {

 
    public static void main(String[] args) {
    // Crear un objeto 
        circulo circulo = new circulo(5.0);
        rectangulo rectangulo= new rectangulo(3.4,7);
        triangulo triangulo =new triangulo(5,2);
        cilindro cilindro=new cilindro(2,10);
        // Calcular y mostrar el área 
        double area = circulo.calcularArea();
        System.out.println("Área del círculo: " + area);
        
        area=rectangulo.calcularArea();
        System.out.println("Area del rectangulo "+area);
        
        area=triangulo.calcularArea();
        System.out.println("Area del triangulo "+area);
        
        area=cilindro.calcularArea();
        System.out.println("Area de cilindro "+area);
    }
    
}
