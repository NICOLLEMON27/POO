/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones;

/**
 *
 * @author IngSis
 */
public class TrianguloIsoseles implements Forma{
  private double lado;
 private double base  ;
 private double altura;
 
    public TrianguloIsoseles(double lado, double base) {
        this.lado = lado;
        this.base = base;
    }
  @Override
    public double calcularArea() {
        return (altura * base)/2;
    }
    @Override
    public double calcularPerimetro() {
        return lado+lado+base;
    }
     @Override
    public   double encontarLado(){
     return lado;
     }
     @Override
     public double EncontrarAltura(){
        return altura;
    }
}
