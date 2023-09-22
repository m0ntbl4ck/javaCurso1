
package com.collections.practica;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author mont_
 */
public class StackDeque {
    private Deque<Integer> datos = new ArrayDeque<>();
    
    public void push(Integer elemento){
        datos.addFirst(elemento);
    }
    
    public Integer pop(){
        if(datos.isEmpty()){
            System.out.println("La pila esta vacia");
        }
        return datos.removeFirst();
    }
    
    public Integer peek(){
        return datos.peekFirst();
    }
    
    @Override
    public String toString(){
    return datos.toString();
    }
    
    public static void main(String[] args) {
        
        StackDeque stack = new StackDeque();
        for (int i = 0; i < 5; i++) {
            stack.push(i);    
        }
        System.out.println("Se agregaron 5 elementos "+ stack);
        
        int elemento = stack.pop();
        System.out.println("Eliminar primer elemento Popped = "+ elemento);
        
        System.out.println("Despues de eliminar el primer elemento (Popping) : "+ stack);
        
        int primerElemento = stack.peek();
        
        System.out.println("Traido el primer elemento Peeked = "+ primerElemento);
        System.out.println("Despues de Traer el elemento (Peeking) : "+ stack);
    }
}
