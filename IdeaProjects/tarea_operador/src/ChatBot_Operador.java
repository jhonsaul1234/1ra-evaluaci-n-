import java.util.Scanner;
public class ChatBot_Operador {
    public static void main(String[] args) {
        Scanner gaa = new Scanner(System.in);
        String opcion;
        double saldo=0;


        System.out.println("Bienvenido al servicio de atención al cliente de Claro. ¿En qué puedo ayudarte hoy?");
        do {
        System.out.println("1. Consultar saldo .");
        System.out.println("2. Realizar una recarga.");
        System.out.println("3. Reportar un problema técnico.");
        System.out.println("4. Consultar información sobre planes y promociones.");
        System.out.println("5. salir.");
        System.out.print("Por favor, selecciona el número correspondiente a la opción que necesitas: ");
        opcion=gaa.nextLine();

        switch (opcion){
            case "1":
                System.out.println("Su saldo actual es " +saldo);
                break;


            case "2":
                System.out.println("Ingrese la cantidas de saldo a recargar ");
                double recarga = gaa.nextDouble();
                saldo += recarga;
                System.out.println("Se han depositado $" + recarga);


        }
        }while (!opcion.equals("5"));
}
}

