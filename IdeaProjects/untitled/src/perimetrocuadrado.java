import java.util.Scanner;
public class perimetrocuadrado {
    public static void main(String [] args){
        double perimetro,lado;
        Scanner flash = new Scanner(System.in);
        System.out.println("ingrese la longitud del cuadrado");
        lado=flash.nextDouble();
        perimetro=4*lado;
        System.out.println("el perimetro cuadrado es " +perimetro);


}
}
