import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivo {

    public static void gaaaa() {
        String nombreArchivo = "archivo.txt";
        try {
            FileWriter fw = new FileWriter(nombreArchivo);
            PrintWriter pw = new PrintWriter(fw);

            pw.println("Hola, este es un archivo de texto.");
            pw.println("Aquí se pueden escribir varias líneas.");

            pw.close();
            System.out.println("Se ha escrito correctamente en el archivo.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}