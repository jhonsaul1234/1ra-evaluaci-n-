import java.util.Scanner;
public class Grifo_Primax {
    public static void opciones() {
        Scanner gaa = new Scanner(System.in);
        System.out.println("===ELIGA UNA OPCION===\n1. Comprar gasolina\n2. Comprar snacks\n3.Comprar ambos===\n4.gaaa");
        int opciones = gaa.nextInt();

        switch (opciones) {
            case 1:
                comprarCombustible(gaa);
                break;

            case 2:
                comprarSnacks(gaa);
                break;
            case 3:

                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }

        gaa.close();
    }
    public static void comprarCombustible(Scanner scanner) {
        System.out.println("\nTipos de combustibles disponibles:");
        System.out.println("1.Combustibles Industriales");
        System.out.println("2.Combustibles diferenciados, ");
        System.out.println("3.Max-D");
        System.out.println("4.GNV/GLP");

        System.out.print("Ingrese el tipo de combustible (1,2,3,4):\n");
        int tipo_Gasolina = scanner.nextInt();
        System.out.print("Cantidad de galones:\n");
        int cantidad_Gasolina = scanner.nextInt();

        double precio_Gasolina = 0;
        switch (tipo_Gasolina) {
            case 1:
                precio_Gasolina = 14 ;
                break;
            case 2:
                precio_Gasolina = 16.00;
                break;
            case 3:
                precio_Gasolina = 11.00;
                break;
            case 4:
                precio_Gasolina= 12.00;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        double total_Gasolina = precio_Gasolina * cantidad_Gasolina;

        if (total_Gasolina > 200.00) {
            total_Gasolina *= 0.9;
        }

        System.out.println("\nCompra exitosa.\nTotal a pagar por gasolina: S/" + total_Gasolina);
    }

    public static void comprarSnacks(Scanner scanner) {
        System.out.println("\nSnacks disponibles:");
        System.out.println("Papitas lays ---> S/ 3.00");
        System.out.println("Gaseosa Coca Cola ---> S/ 8.00");
        System.out.println("Cuates ---> S/ 2.00");

        System.out.print("Ingrese el snack (Papitas, CocaCola, Cuates):\n");
        String snack = scanner.next();
        System.out.print("Ingrese la cantidad:\n");
        int cantidad_Snack = scanner.nextInt();

        double precio_Snack = 0;
        switch (snack.toLowerCase()) {
            case "papitas":
                precio_Snack = 3.00;
                break;
            case "cocacola":
                precio_Snack = 8.00;
                break;
            case "cuates":
                precio_Snack = 2.00;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        double total_Snacks = precio_Snack * cantidad_Snack;

        if (total_Snacks > 30.00) {
            System.out.println("GANO UN OBSEQUIO: un ambientador de auto.");
        }

        System.out.println("\nCompra exitosa.\nTotal a pagar por snacks: S/ " + total_Snacks);
    }

    public static void main(String[] args) {
        System.out.println("===BIENVENIDO AL GRIFO FUEGO===");
        Scanner gaa = new Scanner(System.in);

        opciones();

        gaa.close();
    }
}