package net.salesianos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException  {


        String rutaLorem = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\lorem_ipsum.txt";

        LanzadorDeProcesos.iniciarContador(rutaLorem, "a", "salidaVocalA");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "e", "salidaVocalE");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "i", "salidaVocalI");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "o", "salidaVocalO");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "u", "salidaVocalU");


        // Mejor una ruta común para luego añadirle lo que es diferente
        String rutaDeSalida = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\salidas";

        // Fichero salidaVocalA

        FileReader fileReaderA = new FileReader(rutaDeSalida + "\\salidaVocalA");
        BufferedReader bufferedReaderVocalA = new BufferedReader(fileReaderA);

        String numeroA = bufferedReaderVocalA.readLine();
        bufferedReaderVocalA.close();

        System.out.println("Cantidad de vocales A :" + numeroA);


        // Fichero salidaVocalE

        FileReader fileReaderE = new FileReader(rutaDeSalida + "\\salidaVocalE");
        BufferedReader bufferedReaderVocalE = new BufferedReader(fileReaderE);

        String numeroE = bufferedReaderVocalE.readLine();
        bufferedReaderVocalE.close();

        System.out.println("Cantidad de vocales E :" + numeroE);


        // Fichero salidaVocalI

        FileReader fileReaderI = new FileReader(rutaDeSalida + "\\salidaVocalI");
        BufferedReader bufferedReaderVocalI = new BufferedReader(fileReaderI);

        String numeroI = bufferedReaderVocalI.readLine();
        bufferedReaderVocalI.close();

        System.out.println("Cantidad de vocales I :" + numeroI);


        // Fichero salidaVocalO

        FileReader fileReaderO = new FileReader(rutaDeSalida + "\\salidaVocalO");
        BufferedReader bufferedReaderVocalO = new BufferedReader(fileReaderO);

        String numeroO = bufferedReaderVocalO.readLine();
        bufferedReaderVocalO.close();

        System.out.println("Cantidad de vocales O :" + numeroO);


        // Fichero salidaVocalU

        FileReader fileReaderU = new FileReader(rutaDeSalida + "\\salidaVocalU");
        BufferedReader bufferedReaderVocalU = new BufferedReader(fileReaderU);

        String numeroU = bufferedReaderVocalU.readLine();
        bufferedReaderVocalU.close();

        System.out.println("Cantidad de vocales U :" + numeroU);


        String rutaTexto = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\lorem_ipsum";
        FileReader fileReaderTexto = new FileReader(rutaTexto);
        BufferedReader bufferedReaderTexto = new BufferedReader(fileReaderTexto);
        String textoFinal;
        while ((textoFinal = bufferedReaderTexto.readLine()) != null) {
            System.out.println(textoFinal);
        }
        fileReaderTexto.close();
    }
}