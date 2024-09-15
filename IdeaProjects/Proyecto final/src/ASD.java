import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.FileWriter;
import java.io.IOException;

public class ASD {
    Scanner gato = new Scanner(System.in);
    String pais, region, ciudad, distrito, direccion, codigopostal, numerocasa;

    public void envi() {
        enviopais();
        codidopostal();
        direccion();
    }

    public String imprimir() {
        escribir();
        return null;
    }

    public String enviopais() {
        System.out.println("Ingresa tu pais de residencia");
        pais = gato.nextLine();
        System.out.println("Ingresa el nombre de tu departamento");
        region = gato.nextLine();
        System.out.println("Ingresa el nombre de tu localidad");
        ciudad = gato.nextLine();
        System.out.println("Ingresa el nombre de tu distrito");
        distrito = gato.nextLine();
        return null;
    }

    public String codidopostal() {
        System.out.println("Ingresa tu codigo postal");
        codigopostal = gato.nextLine();
        if (codigopostal.length() != 5) {
            System.out.println("Codigo postal invalido");
            return codidopostal();
        }
        return null;
    }

    public String direccion() {
        System.out.println("Ingresa tu direccion");
        direccion = gato.nextLine();
        return null;
    }

    public void escribir() {
        Date horadetucasa = new Date();
        SimpleDateFormat formatoedhroa = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String hora = formatoedhroa.format(horadetucasa);

        System.out.println("¿Desea imprimir su orden? (si/no)");
        String respuesta = gato.nextLine().trim().toLowerCase();

        if (respuesta.equals("si")) {
            try (FileWriter orde = new FileWriter("orden.txt", true)) {
                orde.write("Orden creada con éxito\n");
                orde.write("Fecha y Hora de la creación de la orden: " + hora + "\n");
                orde.write("Tu dirección de envío es:\n");
                orde.write("País: " + pais + "\n");
                orde.write("Región: " + region + "\n");
                orde.write("Ciudad: " + ciudad + "\n");
                orde.write("Código Postal: " + codigopostal + "\n");
                orde.write("Distrito: " + distrito + "\n");
                orde.write("Dirección: " + direccion + "\n");
                orde.write("Tu número de tracking es: 442268652\n");
                orde.write("\n");
                System.out.println("Su orden ha sido impresa");
            } catch (IOException fallo) {
                System.out.println("Hubo un error al imprimir la orden:");
                fallo.printStackTrace();
            }
        } else{
            System.out.println("Tu eres el jefe");
            System.out.println("Fecha y Hora de la creacion de la orden");
            System.out.println(hora);
            System.out.println("Tu direccion de envio es: ");
            System.out.println(pais);
            System.out.println(region);
            System.out.println(ciudad);
            System.out.println(codigopostal);
            System.out.println(distrito);
            System.out.println(direccion);
            System.out.println("Tu numero de tracking es: 442268652");
        }
    }
    public static void main(String[] args) {

    }
}