import java.util.Scanner;
public class edad {
    public static void main (String [] args){
        int edad;
        Scanner thor =new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad=thor.nextInt();
        if (edad >= 0 && edad <= 3) {
            System.out.println("Ud es un bebé");
        } else if (edad > 4 && edad <= 10) {
            System.out.println("Ud es un niño");
        } else if (edad > 11 && edad <= 16) {
            System.out.println("Ud es un adolescente");
        } else if (edad > 17 && edad <= 25) {
            System.out.println("Ud es un joven");
        } else if (edad > 26 && edad <= 50) {
            System.out.println("Ud es un adulto joven");
        } else if (edad > 51 && edad <= 116) {
            System.out.println("Ud es un adulto mayor");
        } else {
            System.out.println("Ud ya falleció o no existe");
        }
    }}