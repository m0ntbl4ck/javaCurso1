
package com.streamsLambdas.practicaStreams.practica2;

import com.streamsLambdas.practicaStreams.*;

/**
 *
 * @author mont_
 */
public enum Departamento {
    DC("Bogotá DC"),
    ANT("Antioquia"),
    BOY("Boyacá");
    
    private final String departamento;

    Departamento(String depart) {
        this.departamento= depart;
    }

    public String getDepartamento() {
        return departamento;
    }

    
    
    
}
