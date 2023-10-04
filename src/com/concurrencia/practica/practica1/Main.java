
package com.concurrencia.practica.practica1;

/**
 *
 * @author mont_
 */
// Importa las clases necesarias para trabajar con hilos y ejecutores
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Clase principal del programa
public class Main {

    // Método principal del programa
    public static void main(String[] args) {
        // Configura el Executor (Ejecutor) utilizando un grupo de hilos (ThreadPool) de tamaño variable
        ExecutorService es = Executors.newCachedThreadPool();
        
        // Envía las instancias de CountRunnable al Executor para que sean ejecutadas
        es.submit(new CountRunnable(20, "A")); // Envia un hilo que cuenta hasta 20 con nombre "A"
        es.submit(new CountRunnable(20, "B")); // Envia otro hilo que cuenta hasta 20 con nombre "B"
        es.submit(new CountRunnable(20, "C")); // Envia un tercer hilo que cuenta hasta 20 con nombre "C"

        // Detiene el ExecutorService después de que todos los hilos han terminado
        es.shutdown();
    }
}

