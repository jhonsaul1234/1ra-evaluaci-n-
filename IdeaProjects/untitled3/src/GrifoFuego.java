import java.util.Scanner;

public class GrifoFuego {
    public static void main(String[] args) {
        Scanner gaa = new Scanner(System.in);
        int tipoGasolina,cantidadGasolina;

        System.out.println("Bienvenido al Grifo \"Fuego\"");
        System.out.println("Por favor, seleccione el tipo de gasolina que desea comprar:");
        System.out.println("1. Gasolina 84 (S/ 15.00 por galón)");
        System.out.println("2. Gasolina 91 (S/ 16.00 por galón)");
        System.out.println("3. Gasolina 95 (S/ 17.00 por galón)");
        tipoGasolina = gaa.nextInt();

        System.out.print("Ingrese la cantidad de galones que desea comprar: ");
        cantidadGasolina = gaa.nextInt();

        double costoGasolina = 0;
        switch (tipoGasolina) {
            case 1:
                costoGasolina = cantidadGasolina * 15.00;
                break;
            case 2:
                costoGasolina = cantidadGasolina * 16.00;
                break;
            case 3:
                costoGasolina = cantidadGasolina * 17.00;
                break;
            default:
                System.out.println("Tipo de gasolina no válido");
                return;
        }

        System.out.println("Por favor, seleccione el tipo de snack que desea comprar:");
        System.out.println("1. Papitas Lays (S/ 3.00 por unidad)");
        System.out.println("2. Gaseosa Coca Cola (S/ 8.00 por unidad)");
        System.out.println("3. Cuates (S/ 2.00 por unidad)");
        int tipoSnack = gaa.nextInt();

        System.out.print("Ingrese la cantidad de snacks que desea comprar: ");
        int cantidadSnack = gaa.nextInt();

        double costoSnack = 0;
        switch (tipoSnack) {
            case 1:
                costoSnack = cantidadSnack * 3.00;
                break;
            case 2:
                costoSnack = cantidadSnack * 8.00;
                break;
            case 3:
                costoSnack = cantidadSnack * 2.00;
                break;
            default:
                System.out.println("Tipo de snack no válido");
                return;
        }

        double costoTotal = costoGasolina + costoSnack;

        if (costoTotal > 200.00) {
            double descuento = costoTotal * 0.10;
            costoTotal -= descuento;
            System.out.println("Se le ha aplicado un descuento del 10%: S/ " + descuento);
        }

        if (costoTotal > 30.00) {
            System.out.println("Felicidades, ha calificado para un obsequio: Un ambientador de auto");
        }

        System.out.println("El costo total de su compra es: S/ " + costoTotal);
    }
}
