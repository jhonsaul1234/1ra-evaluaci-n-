import java.util.Scanner;

public class sdsf {

        public static void comprarGasolina(Scanner gaa) {
            // Definir tipos de gasolina y precios en arrays
            String[] tiposGasolina = {"Max-D", "G-Regular", "G-Premium"};
            double[] preciosGasolina = {15.99, 16.79, 17.99};

            // Mostrar tipos de gasolina disponibles
            System.out.println("\nTipos de gasolina disponibles:");
            for (int i = 0; i < tiposGasolina.length; i++) {
                System.out.println((i + 1) + ". " + tiposGasolina[i] + " - S/ " + preciosGasolina[i] + " por galón");
            }

            // Solicitar al usuario que ingrese el tipo de gasolina
            int tipoGasolina;
            do {
                System.out.print("Ingrese el tipo de gasolina (1, 2, 3): ");
                tipoGasolina = gaa.nextInt();

                if (tipoGasolina < 1 || tipoGasolina > tiposGasolina.length) {
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                }
            } while (tipoGasolina < 1 || tipoGasolina > tiposGasolina.length);

            // Solicitar al usuario la cantidad de galones
            System.out.print("Cantidad de galones: ");
            int cantidadGasolina = gaa.nextInt();

            // Calcular el precio total de la gasolina seleccionada
            double precioGasolina = preciosGasolina[tipoGasolina - 1]; // índice ajustado
            double totalGasolina = precioGasolina * cantidadGasolina;

            // Mostrar métodos de pago
            System.out.println("\n--- Métodos de Pago ---");
            System.out.println("1- Pago en Efectivo");
            System.out.println("2- Pago con Tarjeta");

            // Solicitar al usuario que seleccione el método de pago
            System.out.print("Seleccione el método de pago (1 o 2): ");
            int metodoPago = gaa.nextInt();

            // Procesar el método de pago seleccionado
            switch (metodoPago) {
                case 1:
                    System.out.println("Ingrese el monto de pago en efectivo:");
                    int montoPago = gaa.nextInt();
                    if (montoPago >= totalGasolina) {
                        double cambio = montoPago - totalGasolina;
                        System.out.println("Pago recibido. Su cambio es de S/ " + cambio);
                    } else {
                        System.out.println("El monto ingresado es insuficiente. Por favor, ingrese un monto válido.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Pago con Tarjeta de Crédito ---");

                    System.out.print("Ingrese el número de la tarjeta de crédito: ");
                    String numeroTarjeta = gaa.next();

                    System.out.print("Ingrese la fecha de vencimiento (MM/AA): ");
                    String fechaVencimiento = gaa.next();

                    System.out.print("Ingrese el código CVV: ");
                    String cvv = gaa.next();

                    if (verificarTarjeta(numeroTarjeta, fechaVencimiento, cvv, totalGasolina)) {
                        System.out.println("Compra exitosa. Total pagado: S/ " + totalGasolina);
                    } else {
                        System.out.println("Datos de tarjeta inválidos. Pago fallido. Intente nuevamente.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }

        // Método para verificar la tarjeta (simulado)
        public static boolean verificarTarjeta(String numero, String fecha, String cvv, double total) {
            // Aquí debería implementarse la lógica real de verificación de tarjeta
            // En este caso, siempre devolvemos true para simular una verificación exitosa
            return true;
        }
    }


