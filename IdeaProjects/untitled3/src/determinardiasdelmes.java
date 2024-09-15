import java.util.Scanner;
public class determinardiasdelmes {
    public static void main (String [] args){
        String mes;
        Scanner pepa = new Scanner(System.in);
        System.out.println("Ingrese el mes");
        mes=pepa.nextLine();
        if (mes.equals("Enero")||mes.equals("Marzo")||mes.equals("Mayo")||mes.equals("Julio")||mes.equals("Agosto")||mes.equals("Octubre")||mes.equals("Diciembre")){
            System.out.println("Su mes contiene 31 dias ");
        } else if (mes.equals("Abril")||mes.equals("Junio")||mes.equals("Septiembre")||mes.equals("Noviembre")) {
            System.out.println("Su mes contiene 30 dias ");
        }
        else if (mes.equals("Febrero")) {
            System.out.println("Su mes contiene 29 dias ");
        }
        else{
            System.out.println("Acción no válida ");
        }
    }
}
