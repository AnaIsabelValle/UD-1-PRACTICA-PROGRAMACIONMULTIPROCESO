package net.salesianos;

import java.io.File;
import java.io.IOException;

public class LanzadorDeProcesos {

    public static void iniciarContador(String texto, String vocal, String nombreArchivo) throws IOException {

        ProcessBuilder processBuilder = new ProcessBuilder(
                "java", "C:\\Users\\ANA\\IdeaProjects\\UD1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\Contador.java", texto, vocal);

        String rutaDeSalida = "C:\\Users\\ANA\\IdeaProjects\\UD1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\salidas";
        processBuilder.redirectOutput(new File(rutaDeSalida, nombreArchivo));
        processBuilder.start();
    }
}
