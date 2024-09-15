import java.util.Scanner;

public class Ruta18 {
    public static void main(String[] args) {
        Scanner gaa = new Scanner(System.in);
        System.out.println("Bienvenido a su Ruta 18, tome asiento");

        int pasaje = 0;
        int pasajeros = 1;

        do {
            System.out.println("Ingrese su pasaje en soles por favor");
            pasaje = gaa.nextInt();
            if (pasaje == 0) {
                System.out.println("Ingrese su pasaje por favor//No vas a viajar gratis :D");
                pasaje = gaa.nextInt();
            } else if (pasaje > 1) {
                System.out.println("¿De cuántas personas me voy a cobrar el pasaje?");
                pasajeros = gaa.nextInt();
                if (pasaje >= pasajeros) {
                    int vuelto = pasaje - pasajeros;
                    System.out.println("Tu vuelto es " + vuelto);
                } else {
                    System.out.println("El pasaje no puede ser menor que la cantidad de pasajeros. Intente nuevamente.");
                    pasaje = 0;
                }
            }
        } while (pasaje == 0);

        System.out.println("Ingrese la cantidad de km que quiere viajar");
        double km = gaa.nextDouble();
        realizarViaje(km);


        if (km <= 10) {
            System.out.println("Llegamos a plaza Bolognesi");
        } else if (km <= 15) {
            System.out.println("Llegaste a plaza de armas");
        } else if (km <= 25) {
            System.out.println("Llegaste a parque Cholo");
        } else if (km <= 35) {
            System.out.println("Llegaste al desvío");
        } else if (km <= 40) {
            System.out.println("Llegaste a la UPEU");
        }


        System.out.println("¿Desea regresar? si o no?");
        String respuesta = gaa.next();
        if (respuesta.equals("no")); {
            pasaje = 1;
            do {
                System.out.println("Ingrese su pasaje de regreso en soles por favor");
                pasaje = gaa.nextInt();
                if (pasaje == 0) {
                    System.out.println("Ingrese su pasaje por favor");
                    pasaje = gaa.nextInt();
                } else if (pasaje > 1) {
                    System.out.println("¿De cuántas personas me voy a cobrar el pasaje?");
                    pasajeros = gaa.nextInt();
                    if (pasaje >= pasajeros) {
                        int vuelto = pasaje - pasajeros;
                        System.out.println("Tu vuelto es " + vuelto);
                    } else {
                        System.out.println("El pasaje no puede ser menor que la cantidad de pasajeros. Intente nuevamente.");
                        pasaje = 0;
                    }
                }
            } while (pasaje == 0);
            System.out.println("ingrese la cantidad de km a regresar");
            km = gaa.nextDouble();
            realizarViaje(km);
            if (km <= 10) {
                System.out.println("Llegaste a la UPEU ");
            } else if (km <= 15) {
                System.out.println(" Llegaste al desvío");
            } else if (km <= 25) {
                System.out.println("Llegaste a parque Cholo");
            } else if (km <= 35) {
                System.out.println("Llegaste a plaza de armas");
            } else if (km <= 40) {
                System.out.println(" Llegamos a plaza Bolognesi");
            }

        }

        System.out.println("Gracias por viajar con Ruta 18.");
    }

    public static void realizarViaje(double km) {
        for (int i = 1; i <= km; i++) {
            if (km <= 40) {
                System.out.println("  __");
                System.out.println(" /|||\\`.__");
                System.out.println("(   _    _ _\\");
                System.out.println("=`-()--()-'");
                System.out.println("     o  o");
                System.out.println("Avanzando... ¡agárrate que te caes!");
            }
        }
    }
}