
package com.excepcion.trycatchAsserts;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mont_
 */
public class TryWithResources {
     public static void main(String[] args) {
         
         
         
         
         
        try (
            BufferedReader reader = new BufferedReader(new FileReader("archivos\\quijote.txt"));
            BufferedReader reader1 = new BufferedReader(new FileReader("archivos\\texto1.txt"));
        ) {
            String linea;
            System.out.println("FRAGMENTO DON QUIJOTE");
            System.out.println();
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
            System.out.println("\n");
            System.out.println("FRAGMENTO LOREM IPSUM");
            System.out.println();
            while ((linea = reader1.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException  e) {
            // Maneja la excepción en caso de error de lectura
            System.out.println(e.getMessage());
            
        }
    }
}
