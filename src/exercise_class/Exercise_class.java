
package exercise_class;
import call.unicauca.edu.co.ex_atrr;
 
public class Exercise_class {

  
    public static void main(String[] args) {
         ex_atrr atrr= new ex_atrr();
     System.out.println("access var: ");
        System.out.println("import name I1 : "+ atrr.name);
        atrr.name="camilo";
        System.out.println("import name  I2 " + atrr.name);
        System.out.println("import year :"+ atrr.year_hbd);
    }
    
}
