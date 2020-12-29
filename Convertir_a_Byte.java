package Convertir_a_Byte;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Convertir_a_Byte {

    public static void main(String[] args) {
        File archivo=new File("Convertir.txt");
        try {
            FileWriter f = new FileWriter(archivo);
            //Empieza a convertir desde la posicion 1 aun no se como ponerlo que empieze en cero por eso se empieza al escribir con un espacio en blanco
            f.write(" Hola");
            f.close();
        } catch (IOException ex) {
            Logger.getLogger(Convertir_a_Byte.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader leer = new FileReader("Convertir.txt");

            try {
                int entrada = leer.read();

                while (entrada != -1) {
                    entrada = leer.read();
                    System.out.println(entrada);
                }
            } catch (FileNotFoundException ex) {
                System.err.println("Se ha producido un error " + ex);
            }
        } catch (IOException ex) {
            System.err.println("Se ha producido un error " + ex);
        }
    }

}
