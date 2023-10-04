
package Geometria;

public class cilindro extends formaGeometrica {
    double radio;
    double altura;
double carrro;
    public cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }
  @Override
  public double calcularArea(){
  return 2*Math.PI*radio*(radio+altura);
  }
}
