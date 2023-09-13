
package Geometria;

public class circulo extends formaGeometrica {
    private double radio;

    public circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
}
