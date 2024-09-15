import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        double n1,n2,suma,resta,multiplicacion,divicion;
        Scanner huevo = new Scanner(System.in);

        System.out.println("----BIENVENIDO A SU CALCULADORA---");
        System.out.println("Ingrese el primer número");
        n1=huevo.nextDouble();
        System.out.println("Ingrese el segundo número");
        n2=huevo.nextDouble();
        suma=n1+n2;
        resta=n1-n2;
        multiplicacion=n1*n2;
        divicion=n1/n2;

        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("la multiplicacion es:" +multiplicacion);
        System.out.println("la divicion es:" +divicion);
    }
}