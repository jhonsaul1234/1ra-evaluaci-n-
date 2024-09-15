import java.util.Scanner;

public class vocal_o_constante{
    public static void main(String[] args) {
        Scanner axe = new Scanner(System.in);

        System.out.print("Ingrese un carácter: ");
        char caracter = axe.next().toLowerCase().charAt(0);

        if (Character.isLetter(caracter)) {
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                System.out.println("El carácter ingresado es una vocal.");
            } else {
                System.out.println("El carácter ingresado es una consonante.");
            }
        } else {
            System.out.println("El carácter ingresado no es una letra del alfabeto.");
        }

    }
}
