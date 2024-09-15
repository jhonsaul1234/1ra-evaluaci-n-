import java.util.Scanner;
public class calculadora {
    public static void main(String[]args){
        int opcion;
        double n1,n2,multiplicar,restar,dividir,sumar;
        Scanner gaa= new Scanner(System.in);
        System.out.println("bienvenido a su calculadora");
        System.out.println("seleccione entre las siguientes operaciones");
        System.out.println("escriba 1 si quiere sumar");
        System.out.println("escriba 2 si quiere restar");
        System.out.println("escriba 3 si quiere multiplicar");
        System.out.println("escriba 4 si quiere dividir");
        opcion=gaa.nextInt();
        if (opcion==1){
            System.out.println("ingrese el primer numero");
            n1=gaa.nextDouble();
            System.out.println("ingrese el segundo numero");
            n2=gaa.nextDouble();
            sumar=n1+n2;
            System.out.println("la suma es "+sumar);



        }
        else if(opcion==2){
            System.out.println("ingrese el primer numero");
            n1=gaa.nextDouble();
            System.out.println("ingrese el segundo numero");
            n2=gaa.nextDouble();
            restar=n1-n2;
            System.out.println("la resta es " +restar);

        }
        else if(opcion==3){
            System.out.println("ingrese el primer numero");
            n1=gaa.nextDouble();
            System.out.println("ingrese el segundo numero");
            n2=gaa.nextDouble();
            multiplicar=n1*n2;
            System.out.println("la multiplicacion es "+multiplicar);

        }
        else if(opcion==4){
            System.out.println("ingrese el primer numero");
            n1=gaa.nextDouble();
            System.out.println("ingrese el segundo numero");
            n2=gaa.nextDouble();
            dividir=n1/n2;
            System.out.println("la divicion es "+dividir);

        }else {
            System.out.println("esa opcion no es valida");
        }

    }

}
