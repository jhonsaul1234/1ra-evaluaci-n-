import java.util.Scanner;
public class ComprasMercado {
    public static void main(String[] args){
        String cliente;
        Scanner gaa= new Scanner(System.in);
        System.out.println("Ingrese el nombre del cliente :");
        cliente = gaa.next();
        System.out.println("Ingrese el nombre de la seccion de productos");
        Scanner dato= new Scanner(System.in);
        String opcion = "";
        opcion = dato.next();
        switch (opcion) {
            case "frutas":
                String nombrefruta;
                double fprecio, ftotalc;
                double tp = 0;
                int cantidad;
                System.out.println("Ingreso el nombre de la fruta");
                nombrefruta = dato.next();
                System.out.println("Ingreso el precio ; ");
                fprecio = dato.nextDouble();
                System.out.println("Ingreso la cantidad");
                cantidad = dato.nextInt();
                ftotalc = fprecio * cantidad;
                System.out.println("El total es : " + ftotalc);
                if (ftotalc > 1000) {
                    System.out.println("El descuento es ; " + ftotalc * 0.20);
                    tp = ftotalc - (ftotalc * 0.20);
                    System.out.println("El neto a pagar es : " + tp);
                } else {
                    System.out.println("No hay descuentos");
                }
                break;
            case "verduras":
                String vproducto;
                double vprecio, vtotalc;
                double vtp = 0;
                System.out.println("Ingreso el nombre de la verdura");
                vproducto = dato.next();
                System.out.println("Ingreso el precio ;");
                vprecio = dato.nextDouble();
                System.out.println("Ingreso la cantidad");
                cantidad = dato.nextInt();
                vtotalc = vprecio * cantidad;
                System.out.println("El total es : " + vtotalc);
                if (vtotalc > 1000) {
                    System.out.println("El descuento es ; " + vtotalc * 0.20);
                    vtp = vtotalc - (vtotalc * 0.20);
                    System.out.println("El neto a pagar es : " + vtp);
                } else {
                    System.out.println("No hay descuentos");
                }
                break;
            case "abarrotes":
                String aproducto;
                double aprecio, atotalc;
                double atp = 0;
                System.out.println("Ingreso el nombre del abarrote");
                aproducto = dato.next();
                System.out.println("Ingreso el precio ; ");
                aprecio = dato.nextDouble();
                System.out.println("Ingreso la cantidad");
                cantidad = dato.nextInt();
                atotalc = aprecio * cantidad;
                System.out.println("El total es : " + atotalc);
                if (atotalc > 1000) {
                    System.out.println("El descuento es ; " + atotalc * 0.20);
                    atp = atotalc - (atotalc * 0.20);
                    System.out.println("El neto a pagar es : " + atp);
                } else {
                    System.out.println("No hay descuentos");
                }
                break;

        }


    }
}