
package Empleados;


public class Parcial{

    public static void main(String[] args) {
       empleadoAsalariado[] empleadosAsalariados = new empleadoAsalariado[5];
    empleadoPorHoras[] empleadosHoras = new empleadoPorHoras[5];      
     
   empleadosAsalariados[0]=new empleadoAsalariado(1000,"camilo",2000);
   empleadosAsalariados[0].calcularSalario();
   
   empleadosAsalariados[1]=new empleadoAsalariado(10000,"jhonatan",7987);
   empleadosAsalariados[1].calcularSalario();
   
   empleadosAsalariados[2]=new empleadoAsalariado(993,"luisa",200007); 
   empleadosAsalariados[2].calcularSalario();
   
   empleadosAsalariados[3]=new empleadoAsalariado(500,"sara",90000); 
   empleadosAsalariados[3].calcularSalario();
   
   empleadosAsalariados[4]=new empleadoAsalariado(2000,"carlos",9000);
   empleadosAsalariados[4].calcularSalario();
   
    empleadosHoras[0] = new empleadoPorHoras(12,1000,"juanes",10000);      
    empleadosHoras[0].calcularSalario();
     
    empleadosHoras[1] = new empleadoPorHoras(5,1000,"ikan",10000);     
    empleadosHoras[1].calcularSalario();
     
    empleadosHoras[2] = new empleadoPorHoras(48,1000,"miguelito",10000);      
    empleadosHoras[2].calcularSalario();
    
    empleadosHoras[3] = new empleadoPorHoras(2,1000,"daniel",10000);      
    empleadosHoras[3].calcularSalario();
    
    empleadosHoras[4] = new empleadoPorHoras(14,1000,"jordan",10000);      
    empleadosHoras[4].calcularSalario();
     
  
     for (empleadoAsalariado empleadosAsalariado : empleadosAsalariados) {
           System.out.println(empleadosAsalariado.getSalarioBase());
            System.out.println(empleadosAsalariado.getNombre());
            System.out.println(empleadosAsalariado.getDeducciones());
            System.out.println(empleadosAsalariado.calcularSalario());
        }
        for (empleadoPorHoras empleadosHora : empleadosHoras) {
            System.out.println(empleadosHora.getNombre());
            System.out.println(empleadosHora.getHorasTrabajadas());
            System.out.println(empleadosHora.getTarifaPorHora());
            System.out.println(empleadosHora.getNombre());
            System.out.println(empleadosHora.calcularSalario());
        }
      
    empleadosHoras[4] = new empleadoPorHoras(1,1000,"toro",0);      
    empleadosHoras[4].calcularSalario();
    
    
        for (empleadoPorHoras empleadosHora : empleadosHoras) {
            System.out.println(empleadosHora.getNombre());
            System.out.println(empleadosHora.getHorasTrabajadas());
            System.out.println(empleadosHora.getTarifaPorHora());
            System.out.println(empleadosHora.calcularSalario());
        }
       
    }
    
}
