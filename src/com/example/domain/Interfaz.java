/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.domain;

/**
 *
 * @author mont_
 */
public interface Interfaz {
    
    public final int NUMERO1 = 1; 
    
    
    public void metodo1();
    
    public default void metodo3(){
        System.out.println("esto es un metodo dentro una interfaz que tiene implementacion default");
        metodo2();
    }
    
    public static void metodo2(){
        System.out.println("esto es un metodo static que ayuda a la logica de un default en una interfaz que tiene implementacion");
    };
    
}
