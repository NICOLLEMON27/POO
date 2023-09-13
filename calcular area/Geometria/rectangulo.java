
package Geometria;

public class rectangulo extends formaGeometrica{
    private double base;
    private double altura;

    public rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea (){
        return base*altura ;
    }
}
