
package com.excepcion.trycatchAsserts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mont_
 */
public class TryCatchClasico {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedReader reader1 = null;
        
        
        try {
            // Abre el archivo de texto para lectura
            reader = new BufferedReader(new FileReader("archivos\\quijote.txt"));
            
           
            // Lee y muestra el contenido del archivo línea por línea
            String linea;
            System.out.println("FRAGMENTO DE DON QUIJOTE");
            System.out.println();
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("\n");
            reader1 = new BufferedReader(new FileReader("archivos\\texto1.txt"));
            System.out.println("FRAGMENTO DE LOREM IPSUM");
            System.out.println();
            while ((linea = reader1.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            // Maneja la excepción en caso de error de lectura
            System.out.println(e.getMessage());
        } finally {
            try {
                // Cierra el archivo en el bloque finally para asegurarse de que siempre se cierre
                 if(reader != null){
                     reader.close();
                 }
                    if(reader1 != null){
                        reader1.close();
                    }
                    
            } catch (IOException e) {
                // Maneja la excepción en caso de error al cerrar el archivo
                System.out.println("Erros de salida "+e.getMessage()); 
            }
        }
    }
}
