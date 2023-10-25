/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones;

/**
 *
 * @author IngSis
 */
public class Rombo implements Forma {
    
    private double ancho;
    private double alto;
    private double lado;

    public Rombo(double ancho, double alto, double lado) {
        this.ancho = ancho;
        this.alto = alto;
        this.lado = lado;
    }
     @Override
    public double calcularArea() {
        return (ancho*alto)/2;
    }
    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }
     @Override
   public   double encontarLado(){
     return lado;
     }
    public double EncontrarAltura(){
        return alto;
    }
}
