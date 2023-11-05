package net.salesianos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Contador {
    public static void main(String[] args) throws IOException {

        char vocal = args[0].charAt(0);
        String texto = args[1];

        FileReader fileReader = new FileReader(texto);

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        texto = bufferedReader.readLine();

        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == vocal) {
                contador++;
            }
        }

        // Hay que cerrar los ficheros
        bufferedReader.close();

        System.out.println(contador);

    }
}
