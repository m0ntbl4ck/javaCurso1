
package com.example;

import com.example.domain.Admin;

import com.example.domain.Equipo;
import com.example.domain.Director;
import com.example.domain.Doctor;
import com.example.domain.Empleado;
import com.example.domain.Engineer;
import com.example.domain.Interfaz;
import com.example.domain.Manager;
import com.example.negocios.EmployeeStockPlan;

import static java.lang.Math.*;
import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Arrays.asList;
/**
 *
 * @author mont_
 */
public class TestMain {
    int numero =10;
    public static void main(String[] args) {
         
        Empleado admin = new Admin("Andrea Rodriguez",000001, 32123.232);
        Empleado inge = new Engineer("Jose Fonseca",000002, 32123.232);
        Empleado manager = new Manager("Andres Beltran",000003,323932.3232,"admin","recurs humanos");
        Engineer inge2 = new Engineer("Jose Fonseca",000004, 32123.232);
        Director director = new Director("Alejandro Velez",00005,312321232.123,100000000,"Tesoreria");
        
        Empleado empleado1 = new Empleado("Jose",12312,123123,"empleado");
        
         //colapso de metodos   
        double aleatorio = abs(-5);
        System.out.println(empleado1.suma(1,2,3,4,5,6,7,8,9,0,2,2,3,4,5,5,56,6,6,7,7,8,8));
       
        System.out.println(admin);
        System.out.println(inge);
        System.out.println(manager);
        System.out.println(director);
        System.out.println();
        
        System.out.println(inge.equals(inge2));
        System.out.println(inge);
        System.out.println(inge.hashCode());
        System.out.println(inge2);
        System.out.println(inge2.hashCode());
        
         Empleado empleado2 = new Admin("Jose",12312,123123);
         Admin empleado3;
         
         Manager manager2 = new Manager("Fabian Rodriguez",000023,323932.321234132,"admin","Recxuros hiumanos");
         
        // manager2 = ((Director)empleado2);
      
         if(manager2 instanceof Director){
             manager2 = ((Director)empleado2);
             System.out.println("Este es el manager "+manager2);
            String clase = manager2.getClass().toString();
             System.out.println(clase);
         }
            
         empleado1 = manager2;
         
         manager =((Manager)manager);
         
        Manager manager4 =((Manager)manager);
        
        manager4.setNombre("Juan Alvarado");
        manager4.getNombreDepartamento();
        
        System.out.println(manager.getNombre());
        
         System.out.println("empleado a manager "+ empleado1);
         
         
        empleado3 = ((Admin)empleado2);
         
        System.out.println("Este es el empleado 3: "+empleado3);
         
       
        
        System.out.println("Este es el manager"+manager2);
        
            empleado3.administrar();
            empleado3.generarNomina();
            
            
         
            empleado3.generarNomina();
        
         EmployeeStockPlan acciones = new EmployeeStockPlan();
       
        System.out.println(acciones.acciones(manager)); 
       System.out.println(acciones.acciones(director)); 
        System.out.println(acciones.acciones(empleado2));
         
      
      
        PatronSingelton listasIp = PatronSingelton.getInstance();
        System.out.println(listasIp);
        
        for (String ip : listasIp.getIps()) {
            System.out.println("Ip: "+ip);
        }
        
     PatronSingelton.getInstance();
     Admin admin2 = new Admin("Andrea Rodriguez",000001, 32123.232);
     
        System.out.println(admin2);
        
        System.out.println(Equipo.MONDAY.getSpanish());
        
        
        
        
        Doctor doctor1 = new Doctor();
   Doctor.AsignarCitas doctor= new Doctor.AsignarCitas(1, "Juan", 12312.21);
   
 // Referencias de interfaz
 
    Interfaz.metodo2();
   Interfaz interfaz1= new Empleado("Andrea Rodriguez",000001, 32123.232,"ADMIN");
    interfaz1.metodo3();
    
    
      
        
       
     
      

           
        
       
       
        
       
}
        
   
}
  

