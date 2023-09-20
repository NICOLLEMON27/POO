
package taller.universidad.pandillitas.roles;

import talller.universidad.pantillitas.model.Persona;


public class administrativo extends Persona {
    String cargo;

    public administrativo(String cargo, String nombre, String apellido, String numeroDeDocumento) {
        super(nombre, apellido, numeroDeDocumento);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

  
}
