/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author mont_
 */
public class Director extends Manager{
    private double presupuesto;
    public Director(String nombre, int empleadoID, double salario, double presupuesto,String nombreDepartamento) {
        super(nombre, empleadoID, salario,"dierctor",nombreDepartamento);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+ "El presupuesto es: "+getPresupuesto();
    }
    
    
}
