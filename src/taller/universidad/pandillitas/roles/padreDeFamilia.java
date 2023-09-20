
package taller.universidad.pandillitas.roles;

import talller.universidad.pantillitas.model.Persona;


public class padreDeFamilia extends Persona{
    
    estudiante[] estudiante = new estudiante[10];

    public padreDeFamilia(String nombre, String apellido, String numeroDeDocumento) {
        super(nombre, apellido, numeroDeDocumento);
    }

    public estudiante[] getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(estudiante[] estudiante) {
        this.estudiante = estudiante;
    }
    


    
}
