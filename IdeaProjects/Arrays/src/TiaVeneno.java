import java.io.File;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileWriter;
import java.io.IOException;

public class TiaVeneno {
    Scanner grinch= new Scanner(System.in);
    String [] menus={"Estofado de pollo","Pollo al horno", "Lentejas con pescado"};
    String [] extras={"Ceviche", "Kankacho", "Rocoto relleno", "Pastel de papa"};
    String [] sopas={"Chairo", "Caldo Blanco", "Menestrón"};
    Random random = new Random();
    int s= random.nextInt(sopas.length);
    double [] precio={10,0.18,25,30,22,20};
    double[] subtotal_extra={0,0,0,0};
    double igv, subtotal,totalpagar;
    int [] carrito =new int[menus.length];
    int [] carrito_extra=new int[extras.length];
    String respuesta;
    int opcion, cantidad;
    public String MenuPrincipal(){
        System.out.println("---------Bienvenido a La Tia Veneno-----------");
        System.out.println("Marque alguna de las siguientes opciones");
        System.out.println(" 1.- Comprar menú");
        System.out.println(" 2.- Extras");
        System.out.println(" 3.- Libro de reclamaciones");
        opcion=grinch.nextInt();
        grinch.nextLine();
        switch (opcion){
            case 1:
                this.ComprarMenu();
                break;

            case 2:
                this.ComprarExtra();
                break;

            case 3:

                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;

        }

        return null;
    }

    public String ComprarMenu(){
        System.out.println("------ MENÚS DEL DÍA------------");
        System.out.println(" La sopa de hoy es:"+sopas[s]);
        System.out.println( "Seleccione su menú a comprar");
        for (int i=0; i<menus.length;i++){
            System.out.println("Opcion "+(i+1)+ " : " +menus[i]);
        }
        opcion= grinch.nextInt();
        grinch.nextLine();
        switch (opcion){
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();
                carrito[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[0]+ "platos de "+menus[0]);
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarExtra();
                }
                else if (opcion==2){
                    this.PagoMenus();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();
                carrito[1]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[1]+ "platos de "+menus[1]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarExtra();
                }
                else if (opcion==2){
                    this.PagoMenus();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 3:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();

                carrito[2]+=cantidad;
                System.out.println("Ud ha pedido "+carrito[2]+ "platos de "+menus[2]);

                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarExtra();
                }
                else if (opcion==2){
                    this.PagoMenus();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }


                break;

            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }





        return null;
    }
    public double PagoMenus(){
        double cantidadtotalmenus=Arrays.stream(carrito).sum();
        double subtotalextra=Arrays.stream(subtotal_extra).sum();
        double subtotal0= (cantidadtotalmenus*precio[0])+subtotalextra;
        igv= subtotal0*precio[1];
        subtotal=subtotal0-igv;
        totalpagar=subtotal+igv;
        System.out.println("----BOLETA DE VENTA---------");
        System.out.println(" SUBTOTAL :"+subtotal);
        System.out.println(" IGV :"+igv);
        System.out.println(" TOTAL :"+totalpagar);
        this.ExportarBoleta();
        return totalpagar;
    }
    public String ComprarExtra(){
        System.out.println("------ MENÚS DEL DÍA------------");
        System.out.println( "Seleccione su extra a comprar");
        for (int i=0; i<extras.length;i++){
            System.out.println("Opcion "+(i+1)+ " : " +extras[i]);
        }
        opcion= grinch.nextInt();
        grinch.nextLine();
        switch (opcion){
            case 1:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();
                carrito_extra[0]+=cantidad;
                System.out.println("Ud ha pedido "+carrito_extra[0]+ "platos de "+extras[0]);
                subtotal_extra[0]=carrito_extra[0]*precio[2];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarMenu();
                }
                else if (opcion==2){
                    this.PagoMenus();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 2:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();
                carrito_extra[1]+=cantidad;
                System.out.println("Ud ha pedido "+carrito_extra[1]+ "platos de "+extras[1]);
                subtotal_extra[1]=carrito_extra[1]*precio[3];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarMenu();
                }
                else if (opcion==2){
                    this.PagoMenus();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }

                break;

            case 3:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();

                carrito_extra[2]+=cantidad;
                System.out.println("Ud ha pedido "+carrito_extra[2]+ "platos de "+extras[2]);
                subtotal_extra[2]=carrito_extra[2]*precio[4];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarMenu();
                }
                else if (opcion==2){
                    this.PagoMenus();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }


                break;
            case 4:
                System.out.println("¿Cuantos comprará? Ingrese la cantidad");
                cantidad=grinch.nextInt();

                carrito_extra[3]+=cantidad;
                System.out.println("Ud ha pedido "+carrito_extra[2]+ "platos de "+extras[3]);
                subtotal_extra[3]=carrito_extra[3]*precio[5];
                System.out.println("¿Desea elegir otro menú más?  1 SI/ 2 NO / 3 Menu Principal");
                opcion=grinch.nextInt();
                grinch.nextLine();
                if(opcion==1)
                {
                    System.out.println("Volviendo a la opción de compra");
                    this.ComprarMenu();
                }
                else if (opcion==2){
                    this.PagoMenus();
                }
                else if (opcion==3){
                    this.MenuPrincipal();
                }
                else
                {
                    System.out.println("Opcion no válida");
                }


                break;


            default:
                System.out.println("Opcion no válida");
                this.MenuPrincipal();
                break;


        }





        return null;
    }

    public String ExportarBoleta(){
        try{
            File archivo= new File("E:\\boleta.txt");
            FileWriter escritor=new FileWriter(archivo);
            escritor.write("----BOLETA DE VENTA---------");
            escritor.write(" SUBTOTAL :"+subtotal);
            escritor.write(" IGV :"+igv);
            escritor.write(" TOTAL :"+totalpagar);
            escritor.close();

        }
        catch (IOException e){
            System.out.println("Error al exportar la factura.");
            e.printStackTrace();

        }
        return null;
    }

    public static void main(String [] args){
        TiaVeneno papanoel= new TiaVeneno();
        papanoel.MenuPrincipal();




    }
}