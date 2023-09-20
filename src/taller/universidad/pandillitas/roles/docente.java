
package taller.universidad.pandillitas.roles;

import talller.universidad.pantillitas.model.Materia;
import talller.universidad.pantillitas.model.Persona;

public class docente extends Persona {
    
   String curso[];
   Materia[] materia1=new Materia[10];

    public docente(String[] curso, String nombre, String apellido, String numeroDeDocumento) {
        super(nombre, apellido, numeroDeDocumento);
        this.curso = curso;
    }

    public String[] getCurso() {
        return curso;
    }

    public Materia[] getMateria1() {
        return materia1;
    }

    public void setCurso(String[] curso) {
        this.curso = curso;
    }

    public void setMateria1(Materia[] materia1) {
        this.materia1 = materia1;
    }

   
   
   
}
