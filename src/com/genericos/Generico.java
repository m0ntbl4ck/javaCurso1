
package com.genericos;



/**
 *
 * @author mont_
 */

// Clase que recibe genericos
//T tipo, E elemento, K key, V value, S y U para segundos y tercer tipos
//extends Number,String,Intenger
//<Wrapper>

public class Generico <Tipo extends Number, Tipo2 extends String > {
    
    private Tipo numero;
    private Tipo2 cadena;
   
    public Generico(Tipo numero, Tipo2 cadena) {
        this.numero = numero;
        this.cadena = cadena;
    }

    public Tipo2 getCadena() {
        return cadena;
    }
    
   
    
    public void mostrarClaseGenerico(Tipo numero){
        Tipo suma = numero;
        
        System.out.println("La clase del dato generico es: "+this.getNumero().getClass().getName()+" "+suma);
    }

    public Tipo getNumero() {
        return numero;
    }
    
    //<Wrapper> void return 
    public void metodoConGenericos(){
        
    }

/*

    public void listas(List<? extends Number> lista){
        
    }*/
    
    
}
