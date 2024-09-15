import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner miau = new Scanner(System.in);
        String opcion;
        double resultado = 0.0;
        boolean salir = false;

        do {
            System.out.println("Calculadora Simple");
            System.out.println("Opciones:");
            System.out.println("A. Sumar");
            System.out.println("B. Restar");
            System.out.println("C. Multiplicar");
            System.out.println("D. Dividir");
            System.out.println("E. Salir");
            System.out.print("Elige una opción: ");
            opcion = miau.nextLine();

            switch (opcion) {
                case "A":
                    System.out.print("Ingresa el primer número: ");
                    double num1 = miau.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    double num2 = miau.nextDouble();
                    resultado = num1 + num2;
                    break;
                case "B":
                    System.out.print("Ingresa el primer número: ");
                    num1 = miau.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = miau.nextDouble();
                    resultado = num1 - num2;
                    break;
                case "C":
                    System.out.print("Ingresa el primer número: ");
                    num1 = miau.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = miau.nextDouble();
                    resultado = num1 * num2;
                    break;
                case "D":
                    System.out.print("Ingresa el primer número: ");
                    num1 = miau.nextDouble();
                    System.out.print("Ingresa el segundo número: ");
                    num2 = miau.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                case "E":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            if (!salir) {
                System.out.println("Resultado: " + resultado);
            }

        } while (!salir);

    }
}
