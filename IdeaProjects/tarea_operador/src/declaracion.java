import java.util.Scanner;
public class declaracion {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int edad;
        System.out.println("Escriba su edad: ");
        edad = leer.nextInt();
        if (edad >= 18) {
            String respuesta;
            System.out.println("\uD83C\uDF39\uD83D\uDC93¿Quieres ser mi novia?\uD83D\uDC93\uD83C\uDF39");
            System.out.println("SI/NO");
            System.out.println("\uD83D\uDC93");
            leer.nextLine();
            respuesta = leer.nextLine();
            while (!respuesta.equals("SI") || respuesta.equals("Si") || respuesta.equals("si") || respuesta.equals("Si quiero") || respuesta.equals("ok")) {
                System.out.println("\uD83C\uDF39\uD83D\uDC93¿Quieres ser mi novia?\uD83D\uDC93\uD83C\uDF39");
                respuesta = leer.nextLine();
                if (respuesta.equals("SI") || respuesta.equals("Si") || respuesta.equals("si") || respuesta.equals("Si quiero") || respuesta.equals("ok")) {
                    System.out.println("\uD83E\uDEF6GENIAL\uD83E\uDEF6");
                    System.out.println("\uD83D\uDE0D");
                }
            }
        } else if (edad < 18 && edad >= 0) {
            System.out.println("No te puedes declarar eres pulpin");
        } else {
            System.out.println("ERROR EDAD NO VALIDA");
        }

    }
}