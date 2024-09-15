import java.util.Scanner;

public class matriz {
    public static void main(String[]args){
        Scanner gaa = new Scanner(System.in);
        int matriz [][]= new int [2][2];
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                System.out.print("ingrese el dato ");
                int resp= gaa.nextInt();

                System.out.println(matriz[i][j]);
            }
        }

    }
}
