
package Geometria;


public class triangulo extends formaGeometrica {
    double base;
    double altura;

 
    public triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
    return( base*altura)/2;
    }
}
