import java.util.Scanner;

public class why{
    public static void main(String[] args) {
        Scanner aulus= new Scanner(System.in);

        System.out.println("---BIENVENIDOS A LA ACADEMIA HELLO--");
        System.out.println("---CURSOS DISPONIBLES---");
        System.out.println("1.  Turno mañana: Básico Kids  ");
        System.out.println("2.  Turno mañana: Intermedio Kids ");
        System.out.println("3.  Turno mañana: Avanzado Kids");
        System.out.println("4.  Turno tarde:  Básico Kids ");
        System.out.println("5.  Turno tarde:  Intermedio Kids ");
        System.out.println("6.  Turno tarde:  Avanzado Kids");
        System.out.println("7.  Turno tarde:  Básico Adulto ");
        System.out.println("8.  Turno tarde:  Intermedia Adulto ");
        System.out.println("9.  Turno tarde:  Avanzado Adulto");
        System.out.println("10. Turno noche:  Básico Adulto ");
        System.out.println("11. Turno noche:  Intermedio Adulto ");
        System.out.println("12. Turno noche:  Avanzado Adulto");

        System.out.print("Opción: ");
        int opcionCursos = aulus.nextInt();

        double preciocurloselccionado= 0;
        switch (opcionCursos) {
            case 1:
                double preciototal;
                double BásicoKids = 200;
                double descuentoniños;
                descuentoniños= preciocurloselccionado * 0.5;
                preciototal = BásicoKids-descuentoniños;
                System.out.println("El precio del curso es "+BásicoKids);
                System.out.println("El descuento es : "+descuentoniños);
                System.out.println("El total a pagar es : "+preciototal);
                break;


            case 2:
                double preciototal2;
                double IntermedioKids = 250;
                preciototal = IntermedioKids;
                descuentoniños= preciocurloselccionado * 0.5;
                preciototal = IntermedioKids-descuentoniños;
                System.out.println("El precio del curso es "+IntermedioKids);
                System.out.println("El descuento es : "+descuentoniños);
                System.out.println("El total a pagar es : "+preciototal);
                break;


            case 3:
                double preciototal3;
                double AvanzadoKids = 300;
                descuentoniños= preciocurloselccionado * 0.5;
                preciototal = AvanzadoKids-descuentoniños;
                preciototal = AvanzadoKids;
                System.out.println("El precio del curso es "+AvanzadoKids);
                System.out.println("El descuento es : "+descuentoniños);
                System.out.println("El total a pagar es : "+preciototal);
                break;
            case 4:
                double preciototal4;
                double tardebásicoKids = 200;
                descuentoniños= preciocurloselccionado * 0.5;
                preciototal = tardebásicoKids-descuentoniños;
                preciototal = tardebásicoKids;
                System.out.println("El precio del curso es "+tardebásicoKids);
                System.out.println("El descuento es : "+descuentoniños);
                System.out.println("El total a pagar es : "+preciototal);

                break;
            case 5:
                double preciototal5;
                double tardeIntermedioKids = 250;
                descuentoniños= preciocurloselccionado * 0.5;
                preciototal = tardeIntermedioKids-descuentoniños;
                preciototal = tardeIntermedioKids;
                System.out.println("El precio del curso es "+tardeIntermedioKids);
                System.out.println("El descuento es : "+descuentoniños);
                System.out.println("El total a pagar es : "+preciototal);

                break;
            case 6:
                double preciototal6;
                double tardeAvanzadoKids = 300;
                descuentoniños= preciocurloselccionado * 0.5;
                preciototal = tardeAvanzadoKids-descuentoniños;
                preciototal = tardeAvanzadoKids;
                preciototal = tardeAvanzadoKids;
                System.out.println("El precio del curso es "+tardeAvanzadoKids);
                System.out.println("El total a pagar es : "+preciototal);

                break;
            case 7:
                double preciototal7;
                double tardeBásicoAdulto = 200;
                preciototal = tardeBásicoAdulto;
                System.out.println("El precio del curso es "+tardeBásicoAdulto);
                System.out.println("El total a pagar es : "+preciototal);

                break;
            case 8:
                double preciototal8;
                double tardeIntermediaAdulto = 250;
                preciototal = tardeIntermediaAdulto;
                System.out.println("El precio del curso es "+tardeIntermediaAdulto);
                System.out.println("El total a pagar es : "+preciototal);

                break;
            case 9:
                double preciototal9;
                double tardeAvanzadoAdulto = 3000;
                preciototal = tardeAvanzadoAdulto;
                System.out.println("El precio del curso es "+tardeAvanzadoAdulto);
                System.out.println("El total a pagar es : "+preciototal);

                break;
            case 10:
                double preciototal10;
                double nocheBásicoAdulto = 200;
                preciototal = nocheBásicoAdulto;
                System.out.println("El precio del curso es "+nocheBásicoAdulto);
                System.out.println("El total a pagar es : "+preciototal);

                break;
            case 11:
                double preciototal11;
                double nocheIntermedioAdulto = 250;
                preciototal = nocheIntermedioAdulto;
                System.out.println("El precio del curso es "+nocheIntermedioAdulto);
                System.out.println("El total a pagar es : "+preciototal);
            case 12:
                double preciototal1;
                double nocheAvanzadoAdulto = 300;
                preciototal = nocheAvanzadoAdulto;
                System.out.println("El precio del curso es "+nocheAvanzadoAdulto);
                System.out.println("El total a pagar es : "+preciototal);


                break;
            default:
                System.out.println("curso no valido");
                return;
        }


        aulus.close();
    }
}