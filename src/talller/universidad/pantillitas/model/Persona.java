
package talller.universidad.pantillitas.model;

public abstract class Persona {
    String nombre;
    String apellido;
    String numeroDeDocumento;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDeDocumento(String numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public Persona(String nombre, String apellido, String numeroDeDocumento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeDocumento = numeroDeDocumento;
    }
    
    
    
}
