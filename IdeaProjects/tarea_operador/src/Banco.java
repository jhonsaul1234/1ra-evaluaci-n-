import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner bobi = new Scanner(System.in);
        double saldo = 0;
        String opcion;

        do {
            System.out.println("\nBienvenido al simulador de cuenta bancaria");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = bobi.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Su saldo actual es: $" + saldo);
                    break;
                case "2":
                    System.out.print("Ingrese la cantidad a depositar: $");
                    double deposito = bobi.nextDouble();
                    saldo += deposito;
                    System.out.println("Se han depositado $" + deposito + " en su cuenta.");
                    break;
                case "3":
                    System.out.print("Ingrese la cantidad a retirar: $");
                    double retiro = bobi.nextDouble();
                    if (retiro > saldo) {
                        System.out.println("Fondos insuficientes. No se puede realizar el retiro.");
                    } else {
                        saldo -= retiro;
                        System.out.println("Se han retirado $" + retiro + " de su cuenta.");
                    }
                    break;
                case "4":
                    System.out.println("Gracias por utilizar nuestro servicio. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción del menú.");
            }


            bobi.nextLine();

        } while (!opcion.equals("4"));
    }
}