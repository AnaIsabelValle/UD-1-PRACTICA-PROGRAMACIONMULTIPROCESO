
package net.salesianos;

import java.io.File;
import java.io.IOException;

public class LanzadorDeProcesos {


    public static void iniciarContador(String texto, String vocal, String nombreArchivo) throws IOException, InterruptedException {

        ProcessBuilder processBuilder = new ProcessBuilder(
                "java",
                "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\Contador.java",
                vocal,
                texto);


        String rutaDeSalida = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\salidas";

        processBuilder.redirectOutput(new File(rutaDeSalida, nombreArchivo));
        Process ps = processBuilder.start();

        // Hay que esperar a que el proceso termine para luego acceder al fichero creado
        ps.waitFor();

    }
}