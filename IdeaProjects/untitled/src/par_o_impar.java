import java.util.Scanner;

public class par_o_impar {
    public static void main(String[] args) {
        int numero;
        Scanner goku = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        numero = goku.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }


    }
}
