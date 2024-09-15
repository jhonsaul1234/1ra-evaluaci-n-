import java.util.Scanner;
public class notas {
    public static void main(String[]args){
        double n1,n2,n3,promedio;
        Scanner barbi=new Scanner(System.in);
        System.out.println("ingrese la primera nota");
        n1=barbi.nextDouble();
        System.out.println("ingrese la segunda nota");
        n2=barbi.nextDouble();
        System.out.println("ingrese la tercera nota");
        n3=barbi.nextDouble();
        promedio=(n1+n2+n3)/3;
        if (promedio >= 0 && promedio <= 5) {
            System.out.println("Dx");
        } else if (promedio > 6 && promedio <= 12) {
            System.out.println("C");
        } else if (promedio > 13 && promedio <= 15) {
            System.out.println("B");
        } else if (promedio > 16 && promedio <= 18) {
            System.out.println("A");
        } else if (promedio > 19 && promedio <= 20) {
            System.out.println("AD");
        } else {
            System.out.println("esa nota no existe xd");
        }
    }}
