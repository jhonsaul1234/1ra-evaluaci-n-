import java.util.Scanner;

public class positivo_negativo {
    public static void main(String[] args) {
        int numero;
        Scanner gaa = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        numero = gaa.nextInt();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }
}
