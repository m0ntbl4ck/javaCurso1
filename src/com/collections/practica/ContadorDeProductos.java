
package com.collections.practica;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author mont_
 */
public class ContadorDeProductos {
   
    private Map<String, Integer> mapaConteoDeProducto = new HashMap<>();
    private Map<String, String> productoNombres = new TreeMap<>();
    
    public static void main(String[] args) {
        
        String[] partes = new String[]{"1S01","1S01","1S01","1S01","1S01",
           "1S02","1S02","1S02","1H01","1H01","1S02","1S01","1S01","1H01","1H01",
           "1H01","1S02","1M02","1M02","1M02"};
        
        Map<String, String> productoNombres = new TreeMap<>();
        productoNombres.put("Portatil Lenovo", "1S01");
        productoNombres.put("Portatil HP", "1S02");
        productoNombres.put("Celular Huawei", "1H01");
        productoNombres.put("Smart TV LG", "1M02");
        
        
        ContadorDeProductos pieza1 = new ContadorDeProductos(productoNombres);
        pieza1.procesoDeLista(partes);
        pieza1.imprimirReporte();
 
        }
    
    public ContadorDeProductos( Map productoNombres){
        this.productoNombres =productoNombres;
    }
    
    public void procesoDeLista(String[] lista){
        int valorCorriente = 0;
        for(String numeroDeItem : lista){
            if(mapaConteoDeProducto.containsKey(numeroDeItem)){
                mapaConteoDeProducto.get(numeroDeItem);
                valorCorriente++;  
               mapaConteoDeProducto.put(numeroDeItem, valorCorriente);
            }else{
                mapaConteoDeProducto.put(numeroDeItem, 1);
            }
        }
    }
    
    
    public void imprimirReporte(){
        System.out.println("\t\t=== Reporte De Producto===");
        for(String key: productoNombres.keySet()){
            System.out.print("Name: "+ key);
            System.out.println("\t\t\tConteo: "+
                   mapaConteoDeProducto.get(productoNombres.get(key)) );
        }
    }
    }

