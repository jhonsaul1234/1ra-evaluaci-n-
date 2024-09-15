import java.util.Scanner;

public class fdfdf {
    public fdfdf() {
    }

    public void login() {
        Scanner pepe = new Scanner(System.in);
        System.out.println("Bienvenido a Grifo Primax");
        System.out.println("-----CREAR CUENTA-----");
        System.out.println("Ingrese su usuario");
        String usuario = pepe.nextLine();
        System.out.println("Ingrese su correo");
        String correo = pepe.nextLine();
        System.out.println("Ingrese su contraseña");
        String contraseña = pepe.nextLine();
        System.out.println("-----INICIAR SESION-----");
        System.out.println("Ingrese su correo");
        String correo_in = pepe.nextLine();
        System.out.println("Ingrese su contraseña");
        String contraseña_in = pepe.nextLine();
        if (correo_in.equals(correo) && contraseña_in.equals(contraseña)) {
            System.out.println("Bienvenido :" + usuario);
        } else {
            System.exit(0);
        }

    }
}
