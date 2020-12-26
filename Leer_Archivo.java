package ArchivosSecuencialesLeer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Leer_Archivo {

    public static void main(String[] args) {

        //creo una variable string para ir volcando el contenido
        String contenido = "";
        int c;

        try {
            FileReader arch = new FileReader("C:\\Users\\LAMONT V PENRY\\Desktop\\Documents\\NetBeansProjects\\ARCHIVOSSECUENCIALES\\archivo.txt");
            //leo mi archivo

            //creo un bucle para recorrer el archivo
            while ((c = arch.read()) != -1) {
                contenido += (char) c;
            }
            //excepcion por si el archivo no existe
        } catch (FileNotFoundException ex) {
            System.err.println("Error el archivo no existe" + ex);

            //excepcion por si el archivo esta vacio
        } catch (IOException ex) {
            System.err.println("Error el archivo esta vacio" + ex);
        }

        System.out.println("El contenido del archivo es: \n" + contenido);

    }

}
