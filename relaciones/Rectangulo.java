/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package relaciones;
import java.util.Scanner;
/**
 *
 * @author IngSis
 */
public class Rectangulo implements Forma  {
    private double lado;
    private double ancho;

    public Rectangulo(double lado, double ancho) {
        this.lado = lado;
        this.ancho = ancho;
    }
  @Override
    public double calcularArea() {
        return lado * ancho;
    } 
    @Override
    public double calcularPerimetro() {
        return 2*(lado+ancho) ;
    }
   public double encontrarLado(){
       
    Scanner scanner=new Scanner(System.in);
   System.out.println("¿Quieres escanear la base o la altura?");
   String input = scanner.nextLine(); 
   if ("base".equals(input)) {  
     return ancho;
   } else  { 
  return lado;
   }
   }


    @Override
    public double EncontrarAltura(){
        return lado;
    }
}

