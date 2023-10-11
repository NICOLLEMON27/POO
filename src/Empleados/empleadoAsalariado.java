
package Empleados;


public class empleadoAsalariado extends modeloEmpleado {
    double deducciones;
   

    public empleadoAsalariado(double deducciones, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.deducciones = deducciones;
    }

    public double getDeducciones() {
        return deducciones;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setDeducciones(double deducciones) {
        this.deducciones = deducciones;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

   
    
    
     
    @Override
   public double  calcularSalario(){
   double salarioTotal;
   salarioTotal =salarioBase-this.deducciones;
    return salarioTotal;
    }
}
