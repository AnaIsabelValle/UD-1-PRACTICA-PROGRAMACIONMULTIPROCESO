import net.salesianos.LanzadorDeProcesos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String rutaLorem = "C:\\Users\\ANA\\IdeaProjects\\UD1-Practica-ProgramacionMultiproceso\\src\\lorem_ipsum.txt";

        LanzadorDeProcesos.iniciarContador(rutaLorem, "a", "salidaVocalA");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "e", "salidaVocalE");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "i", "salidaVocalI");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "o", "salidaVocalO");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "u", "salidaVocalU");

        String rutaSalidaA = "C:\\Users\\ANA\\IdeaProjects\\UD1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\salidas\\salidaVocalA";
        FileReader fileReaderA = new FileReader(rutaSalidaA);
        BufferedReader bufferedReader2 = new BufferedReader(fileReaderA);
        String numeroA = bufferedReader2.readLine();



        System.out.println(numeroA);
        // System.out.println(numeroA +);

        String rutaTexto = "C:\\Users\\ANA\\IdeaProjects\\UD1-Practica-ProgramacionMultiproceso\\src\\lorem_ipsum.txt";
        FileReader fileReaderTexto = new FileReader(rutaTexto);
        BufferedReader bufferedReaderTexto = new BufferedReader(fileReaderTexto);
        String textoFinal = bufferedReaderTexto.readLine();
        while(textoFinal !=null){

            System.out.println(textoFinal);

            // Fata que muestre todo el texto y solo sale la primera línea./
        }
    }
}