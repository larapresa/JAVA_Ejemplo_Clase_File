/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.ejemplos_stream_y_ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author larapresa
 */
public class Ejemplo_Clase_File {

    public static void main(String[] args) {

        try {
            // Crea una nueva instancia de tipo fichero
            File mifichero = new File("mifichero.txt");
            // Crea un nuevo fichero SÍ Y SOLO SÍ no existía ya previamente
            mifichero.createNewFile();
            // Tamaño del fichero en bytes
            System.out.println("Tamaño del fichero en bytes: " + mifichero.length());
            //------------------------------------------------------
            // Una vez creado el fichero vamos a mostrar información 
            //---------------------------------------------------------
            System.out.println(mifichero.exists() ? "El fichero existe" : "El fichero no existe");
            System.out.println(mifichero.isFile() ? "Es un fichero" : "No es un fichero");
            System.out.println(mifichero.isDirectory() ? "Es un directorio" : "No es un directorio");
            System.out.println(mifichero.canRead() ? "Se puede leer" : "No se puede leer");
            System.out.println(mifichero.canWrite() ? "Se puede escribir" : "No se puede escribir");
            System.out.println(mifichero.canExecute() ? "Se puede ejecutar" : "No se puede ejecutar");

            // Última vez que fue modificado
            Date fecha = new Date(mifichero.lastModified());
            System.out.println("Se modificó por última vez: " + fecha);
            // Obtener el nombre del fichero o directorio
            System.out.println("Su nombre es: " + mifichero.getName());
            // Obtener el nombre de la ruta relativa
            System.out.println("Su ruta relativa es: " + mifichero.getPath());
            // Obtener el nombre de la ruta absoluta
            System.out.println("Su ruta absoluta es: " + mifichero.getAbsolutePath());
            // Obtener el nombre del directorio padre
            System.out.println("Nombre del directorio padre: " + mifichero.getParent());
            // Borrar fichero
            // mifichero.delete();
            //System.out.println(mifichero.exists() ? "El fichero existe" : "El fichero no existe");

            // Crea un directorio con el nombre que se haya 
            // indicado en el constructor del File
            File miDirectorio = new File("Nuevo Directorio");
            miDirectorio.mkdir();
            System.out.println("Listado de ficheros en el directorio");
            miDirectorio.list();
            // añadimos dos ficheros al directorio
            File f1 = new File(miDirectorio, "FICHERO1.TXT");
            File f2 = new File(miDirectorio, "FICHERO2.TXT");

           
                if (f1.createNewFile()) {
                    System.out.println("FICHERO1 creado correctamente...");
                } else {
                    System.out.println("No se ha podido crear FICHERO1...");
                }

                if (f2.createNewFile()) {
                    System.out.println("FICHERO2 creado correctamente...");
                } else {
                    System.out.println("No se ha podido crear FICHERO2...");
                }
            
            System.out.println("Listado de ficheros en el directorio");
            miDirectorio.list();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
