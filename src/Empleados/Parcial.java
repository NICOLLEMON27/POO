/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Empleados;

/**
 *
 * @author IngSis
 */
public class Parcial {
  
    public static void main(String[] args) {
    empleadoAsalariado[] empleadosAsalariados = new empleadoAsalariado[5];
    empleadoPorHoras[] empleadosHoras = new empleadoPorHoras[5];      
     
   empleadosAsalariados[0].setSalarioBase(100000);
   empleadosAsalariados[0].setNombre("camilo");
   empleadosAsalariados[0].setDeducciones(2000);
   empleadosAsalariados[0].calcularSalario();
   
 
   empleadosAsalariados[1].setSalarioBase(100000);
   empleadosAsalariados[1].setNombre("jhonatan");
   empleadosAsalariados[1].setDeducciones(7987);
   empleadosAsalariados[1].calcularSalario();
   
   empleadosAsalariados[2].setSalarioBase(937493);
   empleadosAsalariados[2].setNombre("luisa");
   empleadosAsalariados[2].setDeducciones(7000);
   empleadosAsalariados[2].calcularSalario();
   
   empleadosAsalariados[3].setSalarioBase(500);
   empleadosAsalariados[3].setNombre("sara");
   empleadosAsalariados[3].setDeducciones(90);
   empleadosAsalariados[3].calcularSalario();
   
   empleadosAsalariados[4].setSalarioBase(9008);
   empleadosAsalariados[4].setNombre("carlos");
   empleadosAsalariados[4].setDeducciones(2000);
   empleadosAsalariados[4].calcularSalario();
   
    empleadosHoras[0].setNombre("juanes");
    empleadosHoras[0].setHorasTrabajadas(12);
    empleadosHoras[0].setTarifaPorHora(5000);
    empleadosHoras[0].setSalarioBase(0);
    empleadosHoras[0].calcularSalario();
     
     
    empleadosHoras[1].setNombre("ikan");
    empleadosHoras[1].setHorasTrabajadas(24);
    empleadosHoras[1].setTarifaPorHora(5000);
    empleadosHoras[1].setSalarioBase(0);
    empleadosHoras[1].calcularSalario();
     
    empleadosHoras[2].setNombre("miguelito");
    empleadosHoras[2].setHorasTrabajadas(34);
    empleadosHoras[2].setTarifaPorHora(10000);
    empleadosHoras[2].setSalarioBase(23400);
    empleadosHoras[2].calcularSalario();
    
    empleadosHoras[3].setNombre("daniel");
    empleadosHoras[3].setHorasTrabajadas(82);
    empleadosHoras[3].setTarifaPorHora(5000);
    empleadosHoras[3].setSalarioBase(1000);
    empleadosHoras[3].calcularSalario();
    
    empleadosHoras[4].setNombre("jordan");
    empleadosHoras[4].setHorasTrabajadas(4);
    empleadosHoras[4].setTarifaPorHora(5000);
    empleadosHoras[4].setSalarioBase(0);
    empleadosHoras[4].calcularSalario();
        System.out.println("");
       
  
   
      for(int i=0;i<empleadosHoras.length;i++){

         System.out.println(empleadosHoras[i].getNombre());
         System.out.println(empleadosHoras[i].getHorasTrabajadas());
         System.out.println(empleadosHoras[i].getTarifaPorHora());
         System.out.println(empleadosHoras[i].getNombre());
         System.out.println(empleadosHoras[i].calcularSalario());
                 
      }
       for(int i=0;i<empleadosAsalariados.length;i++){
       System.out.println(empleadosAsalariados[i].getNombre());
       System.out.println(empleadosAsalariados[i].getSalarioBase());
       System.out.println(empleadosAsalariados[i].getDeducciones());
       System.out.println(empleadosAsalariados[i].calcularSalario());
        }
    empleadosHoras[4].setNombre("miguelito");
    empleadosHoras[4].setHorasTrabajadas(9);
    empleadosHoras[4].setTarifaPorHora(1200);
    empleadosHoras[4].setSalarioBase(3);
    empleadosHoras[4].calcularSalario();
    
    
      for(int i=0;i<empleadosHoras.length;i++){

         System.out.println(empleadosHoras[i].getNombre());
         System.out.println(empleadosHoras[i].getHorasTrabajadas());
         System.out.println(empleadosHoras[i].getTarifaPorHora());
         System.out.println(empleadosHoras[i].getNombre());
         System.out.println(empleadosHoras[i].calcularSalario());   
      }
        System.out.println(empleadosHoras[3].getNombre());
         System.out.println(empleadosHoras[3].getHorasTrabajadas());
         System.out.println(empleadosHoras[3].getTarifaPorHora());
         System.out.println(empleadosHoras[3].getNombre());
         System.out.println(empleadosHoras[3].calcularSalario());  
      
    }
    

}
