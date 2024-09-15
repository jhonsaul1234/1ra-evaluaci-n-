import java.util.Scanner;

public class indice_masa {
    public static void main(String[] args) {
        Scanner majimbu = new Scanner(System.in);

        System.out.println("calculadora de indice de Masa corporal (IMC)");
        System.out.print("ingrese su peso en kilogramos: ");
        double peso,altura,imc;
        peso = majimbu.nextDouble();

        System.out.print("Ingrese su altura en metros: ");
        altura = majimbu.nextDouble();


        imc = peso / (altura * altura);


        System.out.println("Su IMC es: " + imc);


        if (imc < 18.5) {
            System.out.println("bajo peso");
        } else if (imc < 25) {
            System.out.println("normal");
        } else if (imc < 30) {
            System.out.println("sobrepeso");
        } else {
            System.out.println("obesidad");
        }


    }
}
