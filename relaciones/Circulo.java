
package relaciones;

/**
 *
 * @author IngSis
 */
public class Circulo  implements Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
     @Override
   public   double encontarLado(){
     return 0;
     }
   
      @Override
    public double EncontrarAltura(){
        return radio*2;
    }
}
