
package com.example.negocios;

import com.example.domain.Director;
import com.example.domain.Empleado;
import com.example.domain.Manager;

/**
 *
 * @author mont_
 */
public class EmployeeStockPlan {
    
    private final int ACCIONES_DEL_EMPLEADO = 10;
    private final int ACCIONES_DEL_MANAGER = 100;
    private final int ACCIONES_DEL_DIRECTOR = 1000;

    public EmployeeStockPlan() {
    }
    
    public int acciones(Empleado emp){
        if(emp instanceof Director){
        return ACCIONES_DEL_DIRECTOR;
    } else if( emp instanceof Manager){
    
        return ACCIONES_DEL_MANAGER;
    } else{
        return ACCIONES_DEL_EMPLEADO;
    }
    }
}