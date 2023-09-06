
package ejercicio;
import exercise.Persona;

public class Ejercicio {

   
    public static void main(String[] args) {
        
      Persona[] arrayPersona =new Persona[3];
      //Persona persona =new Persona("Nicolle","Alexandra","1019023413");  
     // Persona persona2=new Persona("carlos","toro","1000099387");
      arrayPersona[0]= new Persona ("Nicolle","Alexandra","1019023413");
      arrayPersona[1]= new Persona ("carlos","toro","1000099387");
      arrayPersona[2]= new Persona ("juan","carlos","183636383");
     
       
      
      for(int i=0;i<arrayPersona.length;i++){
      
         System.out.println(arrayPersona[i].getNombre());
         System.out.println(arrayPersona[i].getApellido());
         System.out.println(arrayPersona[i].getDocumento());
      }
      for(Persona persona: arrayPersona){
        System.out.println(persona.getNombre());  
        System.out.println(persona.getApellido());
        System.out.println(persona.getDocumento());
      }
      
      

    
    }
    
}
