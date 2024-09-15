import java.util.Scanner;

public class AcademiaHello {
    public static void main(String[] args) {
        Scanner gaa = new Scanner(System.in);
        double costoBasico,costoIntermedio,costoAvanzado,descuentoNiños;
        int edad,nivel,turno;


        System.out.print("Ingrese la edad del estudiante: ");
        edad = gaa.nextInt();


        costoBasico = 200.00;
        costoIntermedio = 250.00;
        costoAvanzado= 300.00;

        descuentoNiños = 0.50;


        System.out.println("Elija el turno del curso:");
        System.out.println("1. Mañana");
        System.out.println("2. Tarde");
        System.out.println("3. Noche");
        turno = gaa.nextInt();


        System.out.println("Elija el nivel del curso:");
        System.out.println("1. Básico");
        System.out.println("2. Intermedio");
        System.out.println("3. Avanzado");
        nivel = gaa.nextInt();


        double costoCurso;
        switch (nivel) {
            case 1:
                costoCurso = (turno == 1) ? costoBasico * ((edad < 18) ? descuentoNiños : 1) :
                        (turno == 2) ? costoBasico :
                                costoBasico * ((edad < 18) ? descuentoNiños : 1);
                break;
            case 2:
                costoCurso = (turno == 1) ? costoIntermedio * ((edad < 18) ? descuentoNiños : 1) :
                        (turno == 2) ? costoIntermedio :
                                costoIntermedio * ((edad < 18) ? descuentoNiños : 1);
                break;
            case 3:
                costoCurso = (turno == 1) ? costoAvanzado * ((edad < 18) ? descuentoNiños : 1) :
                        (turno == 2) ? costoAvanzado :
                                costoAvanzado * ((edad < 18) ? descuentoNiños : 1);
                break;
            default:
                System.out.println("Nivel de curso no válido");
                return;
        }


        System.out.println("El costo del curso es: s/" + costoCurso);
    }
}
