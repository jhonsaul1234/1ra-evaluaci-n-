import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Hotel {
    private int cant_person, opcion; // declaramos variables para usar en todas las funciones
    public String fEDAD (){
        Scanner invoker = new Scanner(System.in);
        System.out.println("Para la compra de pasajes, coloque su fecha de nacimiento");
        System.out.println("Ingrese el día de su nacimiento (DD): ");
        int dia = invoker.nextInt();
        System.out.println("Ingrese el mes de su nacimiento (MM): ");
        int mes = invoker.nextInt();
        System.out.println("Ingrese el año de su nacimiento (YYYY): ");
        int anio = invoker.nextInt();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        int edad = Period.between(fechaNacimiento, fechaActual).getYears();
        invoker.nextLine();
        if (edad>=18){
            System.out.println("proceda a llenar sus datos");
            this.fDatosCliente();
            this.fTipoHabitacion();
            this.fPago();
            this.fPisoHotel();

        }else if(edad<=18){
            System.out.println("venga con un mayor, no puede ingresar");

        }
        return null;

    }

    public String fDatosCliente() {
        Scanner butch = new Scanner(System.in);
        String nombre, apellido, dni, sexo;
        int i;
        System.out.println("Ingrese la cantidad de personas a reservar habitación");
        cant_person = butch.nextInt();
        butch.nextLine(); // para asegurarnos de que el carácter de nueva línea se consuma correctamente antes de la siguiente entrada de texto.
        for (i = 1; i <= cant_person; i++) {
            System.out.println("----DATOS DE LA PERSONA NRO # " + i);
            System.out.println("Ingrese sus nombres");
            nombre = butch.nextLine();
            System.out.println("Ingrese sus apellidos");
            apellido = butch.nextLine();
            System.out.println("Ingrese su nro dni");
            dni = butch.nextLine();
            System.out.println("Ingrese su sexo");
            sexo = butch.nextLine();
        }
        return null;
    }

    public String fTipoHabitacion() {
        Scanner frull = new Scanner(System.in);

        System.out.println("Seleccione el tipo de habitación");
        System.out.println("Marque 1 si es simple \n 2 si es doble \n 3 si es matrimonial");
        opcion = frull.nextInt();
        switch (opcion) {
            case 1:
                if (cant_person <= 1) {
                    System.out.println("Puede ocupar " + cant_person + " habitación simple.");
                } else {
                    int habitacionesSimples = (int) Math.ceil((double) cant_person / 1);
                    System.out.println("Puede ocupar " + habitacionesSimples + " habitaciones simples.");
                }
                break;

            case 2:
                if (cant_person <= 2) {
                    System.out.println("Puede ocupar " + cant_person + " habitación doble.");
                } else {
                    int habitacionesDobles = (int) Math.ceil((double) cant_person / 2);
                    System.out.println("Puede ocupar " + habitacionesDobles + " habitaciones dobles.");
                }
                break;

            case 3:
                if (cant_person <= 2) {
                    System.out.println("Puede ocupar " + cant_person + " habitación matrimonial.");
                } else {
                    int habitacionesMatrimonial = (int) Math.ceil((double) cant_person / 2);
                    System.out.println("Puede ocupar " + habitacionesMatrimonial + " habitaciones matrimoniales.");
                }
                break;

            default:
                System.out.println("Opción no válida.");
        }

        return null;
    }

    public double fPago() {
        double subtotal, igv, totalpagar = 0;
        if (opcion == 1) {
            igv = (cant_person * 50) * 0.18;
            subtotal = (cant_person * 50)-igv;
            totalpagar = subtotal + igv;
            System.out.println("SUBTOTAL " + subtotal);
            System.out.println("IGV " + igv);
            System.out.println("TOTAL A PAGAR " + totalpagar);

        } else if (opcion == 2) {
            igv = (cant_person * 80) * 0.18;
            subtotal = (cant_person * 50)-igv;
            totalpagar = subtotal + igv;
            System.out.println("SUBTOTAL " + subtotal);
            System.out.println("IGV " + igv);
            System.out.println("TOTAL A PAGAR " + totalpagar);
        } else if (opcion == 3) {
            igv = (cant_person * 100) * 0.18;
            subtotal = (cant_person * 50)-igv;
            totalpagar = subtotal + igv;
            System.out.println("SUBTOTAL " + subtotal);
            System.out.println("IGV " + igv);
            System.out.println("TOTAL A PAGAR " + totalpagar);
        }
        return totalpagar;
    }

    public String fPisoHotel() {
        Scanner io = new Scanner(System.in);
        int respuesta;
        int i;
        System.out.println("A continuación se le mostrará la ubicación de su habitación");
        if (opcion == 1) {
            System.out.println("Su habitación está en el primer piso \n no es necesario usar el elevador");

        } else if (opcion == 2) {
            System.out.println("Su habitación está en el segundo piso \n ingrese al elevador");
            do {
                System.out.println("¿Ingresó al elevador? Marque 0 si es NO o 1 si es SI");
                respuesta = io.nextInt();
            } while (respuesta != 1);
            for (i = 1; i <= 2; i++) {
                System.out.println(" PISO NRO #" + i);
                System.out.println("  __  ");
                System.out.println(" /        \\");
                System.out.println("|  __  |");
                System.out.println("| |      | |");
                System.out.println("| |      | |");
                System.out.println("| |__| |");
                System.out.println("|  __  |");
                System.out.println("| |      | |");
                System.out.println("| |      | |");
                System.out.println("| |__| |");
                System.out.println("|__|");
            }
            System.out.println("Llegamos a su piso de destino");
        } else if (opcion == 3) {
            System.out.println("Su habitación está en el tercer piso \n ingrese al elevador");
            do {
                System.out.println("¿Ingresó al elevador? Marque 0 si es NO o 1 si es SI");
                respuesta = io.nextInt();
            } while (respuesta != 1);
            for (i = 1; i <= 3; i++) {
                System.out.println(" PISO NRO #" + i);
                System.out.println("  __  ");
                System.out.println(" /        \\");
                System.out.println("|  __  |");
                System.out.println("| |      | |");
                System.out.println("| |      | |");
                System.out.println("| |__| |");
                System.out.println("|  __  |");
                System.out.println("| |      | |");
                System.out.println("| |      | |");
                System.out.println("| |__| |");
                System.out.println("|__|");
            }
            System.out.println("Llegamos a su piso de destino");
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println("----BIENVENIDO A SU HOTEL DE CONFIANZA---");

        Hotel pepito = new Hotel();
        pepito.fEDAD();


    }
}