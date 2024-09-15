import java.util.Scanner;
public class Calculadora {
    public static void main (String [] args){
        int opcion;
        double n1,n2,suma,resta,multi,divi;
        Scanner batman = new Scanner(System.in);
        System.out.println("---BIENVENIDO A SU CALCULADORA---");
        System.out.println("Seleccione entre las siguientes operaciones:");
        System.out.println("Escriba 1 si quiere sumar");
        System.out.println("Escriba 2 si quiere restar");
        System.out.println("Escriba 3 si quiere multiplicar");
        System.out.println("Escriba 4 si quiere dividir");
        opcion=batman.nextInt();
        if (opcion==1){
            System.out.println("Ingrese el primer número");
            n1=batman.nextDouble();
            System.out.println("Ingrese el segundo número");
            n2=batman.nextDouble();
            suma=n1+n2;
            System.out.println("La suma es: "+suma);
        } else if (opcion==2) {
            System.out.println("Ingrese el primer número");
            n1=batman.nextDouble();
            System.out.println("Ingrese el segundo número");
            n2=batman.nextDouble();
            resta=n1-n2;
            System.out.println("La resta es: "+resta);
        }
        else if (opcion==3) {
            System.out.println("Ingrese el primer número");
            n1=batman.nextDouble();
            System.out.println("Ingrese el segundo número");
            n2=batman.nextDouble();
            multi=n1*n2;
            System.out.println("La multiplicación es: "+multi);
        }
        else if (opcion==4) {
            System.out.println("Ingrese el primer número");
            n1=batman.nextDouble();
            System.out.println("Ingrese el segundo número");
            n2=batman.nextDouble();
            divi=n1/n2;
            System.out.println("La división es: "+divi);
        }
        else {
            System.out.println("OPCIÓN NO VÁLIDA");
        }
    }
}