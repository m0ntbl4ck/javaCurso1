
package com.example.domain;

import java.util.Date;

/**
 *
 * @author mont_
 */
public class Doctor {
    private String nombre;
    private int id;
    private String especializacion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }
    //Helper
    public static class AsignarCitas{
        private  int nomeroDeCita;
        private  Date fecha;
        private String nombreDelDoctor;
        private double costo;
        
        public AsignarCitas(int nomeroDeCita, String nombreDelDoctor, double costo) {
            this.nomeroDeCita = nomeroDeCita;
            
            this.fecha = fecha;
            this.nombreDelDoctor = nombreDelDoctor;
            this.costo = costo;
            
           
        }
       
        
        public void asignarCitas(){
            
        }
    }
    
}
