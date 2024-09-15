import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class sas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarPedido = true;
        double totalPedido = 0.0;

        String[] productos = {
                "Sandwich Clasica", "Pan con queso", "Pan de hot dog", "Pan con huevo",
                "Lays", "Chocman", "Oreo", "Casino", "Wafer", "Coca kola", "Inka kola",
                "Yogurt", "Cafe", "Té", "Chicha morada", "Chicha de Jora"
        };

        double[] precios = {
                3.00, 1.00, 2.00, 2.50, 2.00, 1.50, 2.00, 1.50, 2.00, 3.00, 3.50, 4.50, 1.50, 1.00, 1.00, 1.00
        };

        System.out.println("¡¡BUEN DIA!! ¿Qué se le ofrece?");
        System.out.println("------OJO------ Una vez que haya finalizado sus compras, cancele el proceso seleccionando el N°17");
        System.out.println("Seleccione el N° que quiera para hacer su compra");

        while (continuarPedido) {
            System.out.println("\nMenú:");
            for (int i = 0; i < productos.length; i++) {
                System.out.println((i + 1) + ". " + productos[i] + " - S/" + precios[i]);
            }
            System.out.println("17. Cancelar el pedido");

            System.out.print("\nIngrese el número de su elección: ");
            int opcion = scanner.nextInt();

            if (opcion >= 1 && opcion <= productos.length) {
                System.out.print("Ingrese la cantidad: ");
                int cantidad = scanner.nextInt();
                totalPedido += cantidad * precios[opcion - 1];
                System.out.println("Ha seleccionado " + productos[opcion - 1] + ": S/" + (cantidad * precios[opcion - 1]));
            } else if (opcion == 17) {
                continuarPedido = false;
            } else {
                System.out.println("--Opción inválida-- seleccione el N° del menú.");
                continue;
            }
        }

        String exportacion = ExportarBoleta(totalPedido);
        if (exportacion != null) {
            System.out.println("Boleta exportada correctamente.");
        } else {
            System.out.println("Hubo un problema al exportar la boleta.");
        }

        System.out.println("\nSeleccione el método de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta de crédito");

        int metodoPago = scanner.nextInt();

        switch (metodoPago) {
            case 1:
                System.out.print("Ingrese el monto entregado: S/");
                double montoEntregado = scanner.nextDouble();
                if (montoEntregado >= totalPedido) {
                    double cambio = montoEntregado - totalPedido;
                    System.out.println("Pago recibido. Su cambio es: S/" + cambio);
                } else {
                    System.out.println("Monto insuficiente. Por favor, pague al menos S/" + totalPedido);
                }
                break;
            case 2:
                if (totalPedido > 200) {
                    System.out.println("El monto total excede los 200 soles, no se puede pagar con tarjeta de crédito.");
                } else {
                    double cambio = 200 - totalPedido;
                    System.out.println("Pago con tarjeta recibido por un monto de S/200.00. Gracias por su compra.");
                    System.out.println("Se le devolverá el cambio de S/" + cambio);
                }
                break;
            default:
                System.out.println("Método de pago inválido. Por favor, intente de nuevo.");
                break;
        }

        System.out.println("\n¡Vuelve pronto!");
        scanner.close();
    }

    public static String ExportarBoleta(double totalPedido) {
        FileWriter escritor = null;
        try {
            File archivo = new File("boleta.txt");
            escritor = new FileWriter(archivo);
            escritor.write("----BOLETA DE VENTA---------\n");
            escritor.write("SUBTOTAL: S/" + totalPedido + "\n");
            // Calcular el IGV (Impuesto General a las Ventas) y el total a pagar
            double igv = totalPedido * 0.18;
            double totalpagar = totalPedido + igv;
            escritor.write("IGV: S/" + igv + "\n");
            escritor.write("TOTAL: S/" + totalpagar + "\n");
            return "Éxito al exportar la boleta.";
        } catch (IOException e) {
            System.out.println("Error al exportar la boleta.");
            e.printStackTrace();
            return null;
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}