package com.example.domain;

/**
 *
 * @author mont_
 */
public class Manager extends Empleado implements Interfaz,Interfaz2{
   public String nombreDepartamento;
    public Manager(String nombre,int empleadoID, double salario,String cargo,String nombreDepartamento) {
        super(nombre,empleadoID, salario,"Manager");
        this.nombreDepartamento = nombreDepartamento;
    }

  public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    
    
    
   
    

  
}
