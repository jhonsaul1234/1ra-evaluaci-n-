
import java.util.Scanner;
public class horasegundos {
    public static void main(String [] args){
        double segundos,n1,total;
        Scanner flash = new Scanner(System.in);
        System.out.println("ingrese las horas");
        n1=flash.nextDouble();
        segundos=3600;
        total=n1*3600;
        System.out.println("sus segundos son " +total);
    }
    }
