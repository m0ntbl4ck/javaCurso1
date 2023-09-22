
package com.example.domain;

/**
 *
 * @author mont_
 */
public  class Admin extends Empleado{
 

    
    
    public Admin(String nombre,int empleadoID, double salario) {
        super(nombre, empleadoID,salario,"Admin" );
        
        
    }
    
    public void administrar(){
        System.out.println("estoy administrando");
    };
    
    public void generarNomina(){
        System.out.println("Generar nomina");
    }
}
