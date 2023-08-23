//Nicolle  Alexandra Montaño Cifuentes
package poo;

public class POO_1 {

    public static void main(String[] args) {

        int edad = 25;
        double temperatura = 98.6;
        char calificacion = 'a';
        boolean activo = true;
        String nombre = "john Doe";

        System.out.println("hola " + nombre);
        System.out.println("");
       
        
        POO_1 instance = new POO_1();
       int result = instance.sum(1, 2);
        System.out.println(result);
    }

    public int sum(int num1, int num2) {
        //System.out.println("Result " + (num1 + num2));
        return (num1+num2);
    }

}
