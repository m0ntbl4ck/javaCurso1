
package com.genericos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mont_
 */
public class MainGenericos {
    
    public static void main(String[] args) {
        //Los genericos son usados en las listas Colecciones 
        
        //clases Wrapper Integer, String, Double, Long, Character
        List<Number>  lista = new ArrayList<>();
        
        lista.add(1);
        lista.add(2L);
        lista.add(2.2F);
        
        System.out.println(lista.get(0));
        System.out.println(lista.get(1));
        System.out.println(lista.getClass().getName());
        
        
        Generico<Integer,String> generico1 = new Generico(2,"String");
        
        Generico<Integer,String> generico2 = new Generico(2,"hola");
        
        System.out.println(generico2.getCadena());
      /*Generico<String> generico1 = new Generico<>("Hola");
        
        System.out.println(generico1.getNumero());
        */
      
        generico2.mostrarClaseGenerico(2);
        
    }
}
