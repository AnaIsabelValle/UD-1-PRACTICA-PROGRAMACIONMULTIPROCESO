import net.salesianos.LanzadorDeProcesos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String rutaLorem = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\lorem_ipsum";

        LanzadorDeProcesos.iniciarContador(rutaLorem, "a", "salidaVocalA");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "e", "salidaVocalE");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "i", "salidaVocalI");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "o", "salidaVocalO");
        LanzadorDeProcesos.iniciarContador(rutaLorem, "u", "salidaVocalU");

        String rutaSalidaA = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\salidas\\salidaVocalA";
        FileReader fileReaderA = new FileReader(rutaSalidaA);
        BufferedReader bufferedReaderVocalA = new BufferedReader(fileReaderA);
        String numeroA = bufferedReaderVocalA.readLine();

        System.out.println(numeroA);

        String rutaSalidaE = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\salidas\\salidaVocalE";
        FileReader fileReaderE = new FileReader(rutaSalidaE);
        BufferedReader bufferedReaderVocalE = new BufferedReader(fileReaderE);
        String numeroE = bufferedReaderVocalE.readLine();

        System.out.println(numeroE);

        String rutaSalidaI = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\salidas\\salidaVocalI";
        FileReader fileReaderI = new FileReader(rutaSalidaI);
        BufferedReader bufferedReaderVocalI = new BufferedReader(fileReaderI);
        String numeroI = bufferedReaderVocalI.readLine();

        System.out.println(numeroI);

        String rutaSalidaO = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\salidas\\salidaVocalO";
        FileReader fileReaderO = new FileReader(rutaSalidaO);
        BufferedReader bufferedReaderVocalO = new BufferedReader(fileReaderO);
        String numeroO = bufferedReaderVocalO.readLine();

        System.out.println(numeroO);

        String rutaSalidaU = "C:\\Users\\ANA\\IdeaProjects\\UD-1-Practica-ProgramacionMultiproceso\\src\\net\\salesianos\\salidas\\salidaVocalA";
        FileReader fileReaderU = new FileReader(rutaSalidaU);
        BufferedReader bufferedReaderVocalU = new BufferedReader(fileReaderU);
        String numeroU = bufferedReaderVocalU.readLine();

        System.out.println(numeroU);

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