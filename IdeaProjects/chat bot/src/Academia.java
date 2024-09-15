import java.util.Scanner;
public class Academia {
    public void opcion() {
        Scanner gaa = new Scanner(System.in);
        System.out.println("Eliga un turno:\n1.-MAÑANA\n2.-TARDE\n3.-NOCHE");

        int opcion = gaa.nextInt();

        switch (opcion) {
            case 1:
                turnoMañana(gaa);
                break;
            case 2:
                turnoTarde(gaa);
                break;
            case 3:
                turnoNoche(gaa);
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

    }

    public void turnoMañana(Scanner sc) {
        System.out.println("ELIGA UN CURSO:");
        System.out.println("1. Básico KIDS\n2. Intermedio KIDS\n3. Avanzado KIDS");

        int cursoOpcion = sc.nextInt();

        double costo = 0;

        switch (cursoOpcion) {
            case 1:
                costo = calcularCostoCurso("Básico", true);
                break;
            case 2:
                costo = calcularCostoCurso("Intermedio", true);
                break;
            case 3:
                costo = calcularCostoCurso("Avanzado", true);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("El costo del curso es: $" + costo);
    }

    public void turnoTarde(Scanner sc) {
        System.out.println("ELIGA UN CURSO:");
        System.out.println("1. Básico KIDS\n2. Intermedio KIDS\n3. Avanzado KIDS\n4. Básico Adulto\n5. Intermedio Adulto\n6. Avanzado Adulto");

        int cursoOpcion = sc.nextInt();

        double costo = 0;
        boolean esParaNiños = cursoOpcion <= 3; // Verifica si el curso es para niños

        switch (cursoOpcion) {
            case 1:
            case 4:
                costo = calcularCostoCurso("Básico", esParaNiños);
                break;
            case 2:
            case 5:
                costo = calcularCostoCurso("Intermedio", esParaNiños);
                break;
            case 3:
            case 6:
                costo = calcularCostoCurso("Avanzado", esParaNiños);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("El costo del curso es: $" + costo);
    }

    public void turnoNoche(Scanner sc) {
        System.out.println("ELIGA UN CURSO:");
        System.out.println("1. Básico adulto\n2. Intermedio adulto\n3. Avanzado adulto");

        int cursoOpcion = sc.nextInt();

        double costo = 0;

        switch (cursoOpcion) {
            case 1:
                costo = calcularCostoCurso("Básico", false);
                break;
            case 2:
                costo = calcularCostoCurso("Intermedio", false);
                break;
            case 3:
                costo = calcularCostoCurso("Avanzado", false);
                break;
            default:
                System.out.println("Opción inválida.");
                return;
        }

        System.out.println("El costo del curso es: $" + costo);
    }

    public double calcularCostoCurso(String nivel, boolean esParaNiños) {
        double costo = 0;

        switch (nivel) {
            case "Básico":
                costo = 200.00;
                break;
            case "Intermedio":
                costo = 250.00;
                break;
            case "Avanzado":
                costo = 300.00;
                break;
        }

        if (esParaNiños) {
            costo = costo / 2;
        }

        return costo;
    }

    public static void main(String[] args) {
        System.out.println("===BIENVENIDO A LA ACADEMIA DE INGLES HELLO===");

        Academia academia = new Academia ();
        academia.opcion();
    }
}