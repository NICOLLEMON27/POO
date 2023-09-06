
package exercise;
public class Persona {
   
     String nombre;
     String apellido;
   public String documento;
    
    public Persona(String nombre ,String apellido,String documento){
    this.nombre= nombre;
    this.apellido=apellido;
    this.documento= documento;
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
