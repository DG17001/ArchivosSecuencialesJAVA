package ArchivosSecuencialesEscribir;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escribir_Archivo {

    public static void main(String[] args) {
        //Se crea un fichero en la ruta especificada
        File archivo;
        archivo = new File("C:\\Users\\LAMONT V PENRY\\Desktop\\Documents\\NetBeansProjects\\ARCHIVOSSECUENCIALES\\archivo.txt");

        try {
            //se verifica que se haya creado el archivo
            if (archivo.createNewFile()) {
            }

            /*se crea otro archivo editable a partir de el primer archivo creado
            el true permita que pueda sobreescribir el archivo desde lo ultimo escrito*/
            FileWriter f = new FileWriter(archivo, true);
            //Al sobreescribir es necesario que este asi el salto de linea es \r\n
            //f.write("\r\nHola mundo");
            f.write("Hola mundo");

            //es necesario cerrar el archivo si no se cierra no se escribe
            f.close();

            //si no se ha creado se lanza un mensaje de error
        } catch (IOException ex) {
            System.err.println("Error al crear el archivo " + ex);
        }
    }

}
