
package com.boxingUnboxing;

/**
 *
 * @author mont_
 */
public class BoxingUnboxing {
    public static void main(String[] args) {
      
    //Boxing Guardar una variable primitiva en una clase envolvente
    
    double doublePrimitivo = 12.2;
    
    Double doubleWrapper = doublePrimitivo;
    System.out.println("BOXING VARIABLE PRIMITIVA A CLASE WRAPPER DOUBLE: "+doubleWrapper );
        System.out.println();
    
     //Unboxing guardar una clase envolvente en una primitiva
    Integer numeroInteger = new Integer(123453000);
    
    int numeroPrimitivo;
    
    numeroPrimitivo = numeroInteger;
        System.out.println("UNBOXING CLASE INTEGER SE ALMACENA INT: "+numeroPrimitivo);
    }
    
    
}
