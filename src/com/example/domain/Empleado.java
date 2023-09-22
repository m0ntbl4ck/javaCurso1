
package com.example.domain;

import java.util.Objects;

/**
 *
 * @author mont_
 */
public class Empleado implements Interfaz {
   
    private String nombre;
    private double salario;
    private int empleadoID;
    private String cargo;
    public static int numero = 12;
    public Empleado(String cargo, double salario){
        this.cargo = cargo;
        this.salario = salario;
    }
  
    public Empleado(String nombre,int empleadoID, double salario, String cargo){
        this(cargo,salario);
        this.nombre = nombre;
        this.empleadoID = empleadoID;
    }
    
    @Override
     public String toString(){
        return "El nombre del empleado: " + getNombre()+"El ID del empleado es: "+ getEmpleadoID()+
                "El cargo del empleado es: "+ getCargo()+
                "El salario del empleado es: "+ getSalario()+"\n";
       
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

 
    public int getEmpleadoID() {
        return empleadoID;
    }

    public void setEmpleadoID(int empleadoID) {
        this.empleadoID = empleadoID;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public int suma(int... nums){
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        return sum;
       
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + this.empleadoID;
        hash = 89 * hash + Objects.hashCode(this.cargo);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (this.empleadoID != other.empleadoID) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.cargo, other.cargo);
    }

   
   static public void metodo(){
        Empleado empleado = new Empleado("Alvaro Rodriguez",000010, 323123,"admin");
        System.out.println(empleado.cargo);
        
       
        
    }

    @Override
    public void metodo1() {
        System.out.println("Implementacioan de la interfaz metodo1");
    }

    @Override
    public void metodo3() {
        Interfaz.super.metodo3(); 
    }

    
    
}
