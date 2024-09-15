import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class Rayo {

    private void Datos_usuario(Scanner invoker, int cantidad, double precio) {
        String nombre, apellido, dni, sexo;
        for (int i = 1; i <= cantidad; i++) {
            System.out.println("----DATOS DE LA PERSONA NRO # " + i);
            System.out.println("Ingrese sus nombres:");
            nombre = invoker.nextLine();
            System.out.println("Ingrese sus apellidos:");
            apellido = invoker.nextLine();
            System.out.println("Ingrese su nro dni:");
            dni = invoker.nextLine();
            System.out.println("Ingrese su sexo:");
            sexo = invoker.nextLine();
            System.out.println("DATOS REGISTRADOS DE LA PERSONA " + i);
            System.out.println("Nombres: " + nombre);
            System.out.println("Apellido: " + apellido);
            System.out.println("DNI: " + dni);
            System.out.println("SEXO: " + sexo);
        }
        double totalPagar = precio * cantidad;
        System.out.println("El total a pagar es: " + totalPagar);
        System.out.println("Gracias por su compra.");
    }

    public void Datos_usuario() {
        Scanner gaa = new Scanner(System.in);
        System.out.println("Para la compra de pasajes, coloque su fecha de nacimiento");
        System.out.println("Ingrese el día de su nacimiento (DD): ");
        int dia = gaa.nextInt();
        System.out.println("Ingrese el mes de su nacimiento (MM): ");
        int mes = gaa.nextInt();
        System.out.println("Ingrese el año de su nacimiento (YYYY): ");
        int anio = gaa.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
        gaa.nextLine();

        if (edad <= 18) {
            System.out.println("Ud no puede comprar pasajes porque es menor de edad.");
            return;
        }

        System.out.println("Seleccione su terminal de embarque (Puno/Arequipa/Lima):");
        String terminal_Embarque = gaa.nextLine();
        String terminalLlegada;
        double precioPasaje;
        int cantidadPasajes;

        switch (terminal_Embarque) {
            case "Puno":
                System.out.println("Seleccione su terminal de llegada (Lima/Arequipa):");
                terminalLlegada = gaa.nextLine();
                if ("Lima".equals(terminalLlegada)) {
                    precioPasaje = 200.00;
                } else if ("Arequipa".equals(terminalLlegada)) {
                    precioPasaje = 40.00;
                } else {
                    System.out.println("Esa terminal de llegada no existe.");
                    return;
                }
                break;
            case "Lima":
                System.out.println("Seleccione su terminal de llegada (Arequipa/Puno):");
                terminalLlegada = gaa.nextLine();
                if ("Puno".equals(terminalLlegada)) {
                    precioPasaje = 200.00;
                } else if ("Arequipa".equals(terminalLlegada)) {
                    precioPasaje = 150.00;
                } else {
                    System.out.println("Esa terminal de llegada no existe.");
                    return;
                }
                break;
            case "Arequipa":
                System.out.println("Seleccione su terminal de llegada (Puno/Lima):");
                terminalLlegada = gaa.nextLine();
                if ("Puno".equals(terminalLlegada)) {
                    precioPasaje = 40.00;
                } else if ("Lima".equals(terminalLlegada)) {
                    precioPasaje = 150.00;
                } else {
                    System.out.println("Esa terminal de llegada no existe.");
                    return;
                }
                break;
            default:
                System.out.println("Esa terminal de embarque no existe.");
                return;
        }

        System.out.println("Ingrese la cantidad de pasajes a comprar:");
        cantidadPasajes = gaa.nextInt();
        gaa.nextLine();
        Datos_usuario(gaa, cantidadPasajes, precioPasaje);
    }

    public static void main(String[] args) {
        System.out.println("----BIENVENIDO A TRANSPORTES RAYO----");

        Rayo transportes = new Rayo();
        transportes.Datos_usuario();
    }
}