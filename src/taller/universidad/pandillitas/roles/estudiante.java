
package taller.universidad.pandillitas.roles;

import talller.universidad.pantillitas.model.Persona;


public class estudiante extends Persona{
    
    String Codigo;

    public estudiante(String Codigo, String nombre, String apellido, String numeroDeDocumento) {
        super(nombre, apellido, numeroDeDocumento);
        this.Codigo = Codigo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    
    
    
}
