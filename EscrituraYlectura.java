package EscrituraYlectura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class EscrituraYlectura {

    public static void main(String[] args) {

        FileOutputStream cadena1 = null;
        FileInputStream cadena2 = null;
        String nombre = "";
        int opcion = 0, m = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        byte[] array1 = new byte[100];
        byte[] array2 = new byte[100];
        int bytes;

        do {
            try {
                System.out.println("Digite su nombre");
                nombre = br.readLine();
                System.out.println("******************************************");
                System.out.println("Sea bienvenido: " + nombre + " que desea realizar?");
                System.out.println("******************************************");
                System.out.println("Menú:\n1.Crear nuevo archivo\n2.Acceder a archivos guardados\n");
                opcion = Integer.parseInt(br.readLine());

                switch (opcion) {
                    case 1:
                        System.out.println("Introduzca los datos al nuevo archivo:");
                        bytes = System.in.read(array1);
                        cadena1 = new FileOutputStream("Archivo.java",true);
                        cadena1.write(array1, 0, bytes);
                        break;

                    case 2:
                        cadena2 = new FileInputStream("Archivo.java");
                        bytes = cadena2.read(array2, 0, 100);
                        String cadena3 = new String(array2, 0, bytes);
                        System.out.println(cadena3);
                        break;
                }
                System.out.println("Presiones 1 si desea continuar o cualquier otro numero para salir");
                m = Integer.parseInt(br.readLine());

            } catch (IOException e) {
                System.err.println("Se ha producido un error "+e);
            } finally {
                try {
                    if (cadena1 != null) {
                        cadena1.close();
                    } else if (cadena2 != null) {
                        cadena2.close();
                    }
                } catch (IOException e) {
                    System.err.println("Se ha producido un error "+e);
                }
            }

        } while (m == 1);
        System.out.println("******************************************");
        System.out.println("Gracias por utilizar archivos secuenciales.");
        System.out.println("******************************************");
    }
}
