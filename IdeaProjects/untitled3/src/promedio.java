import java.util.Scanner;
public class promedio {
    public static void main(String [] args){
        double n1,n2,n3,promedio;
        Scanner gato = new Scanner(System.in);
        System.out.println("Ingrese la primera nota");
        n1=gato.nextDouble();
        System.out.println("Ingrese la segunda nota");
        n2=gato.nextDouble();
        System.out.println("Ingrese la segunda nota");
        n3=gato.nextDouble();
        promedio=(n1+n2+n3)/3;
        if (promedio>=19&&promedio<=20){
            System.out.println("Ud tiene AD " +promedio);
        }
        else if (promedio>=17&&promedio<=18) {
            System.out.println("Ud tiene A " +promedio);
        }
        else if (promedio>=13&&promedio<=16) {
            System.out.println("Ud tiene B " +promedio);
        }
        else if (promedio>=6&&promedio<=12) {
            System.out.println("Ud tiene C " +promedio);
        }
        else if (promedio>=0&&promedio<=5) {
            System.out.println("Ud tiene D " +promedio);
        }
        else{
            System.out.println("Promedio no válido");

        }
    }
}