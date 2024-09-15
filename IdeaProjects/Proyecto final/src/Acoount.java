import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Acoount {
    HashMap<String, String> users = new HashMap<>();

    public Acoount(){
        users.put("leo","123");
        users.put("cOmrade","123");
        users.put("pablo","123");
        users.put("hk","123");
        users.put("ak47","123");
    }


    public void opciones(){
        Scanner input = new Scanner(System.in);
        System.out.println("1.- sing in");
        System.out.println("2.- create your amazon account");
        int option = input.nextInt();
        switch (option) {
            case 1:
                SingIn();
                break;

            case 2:
                createAccount();
                break;

            default:
                System.out.println("Invalid option.");
        }
    }

    public void SingIn(){
        Scanner input  = new Scanner(System.in);
        boolean mk = true;
        while (mk) {
            System.out.println("Email or mobile phone number");
            String id = input.nextLine();
            System.out.println("Enter your passweord");
            String password = input.nextLine();

            if (users.containsKey(id) && users.get(id).equals(password)) {
                System.out.println("Login successful!");
                mk = false;
            } else {
                System.out.println("Invalid credentials.");
            }
        }
    }

    public void createAccount() {
        Scanner input = new Scanner(System.in);
        System.out.println("Create a new account");
        boolean hp = true;
        while (hp) {
            System.out.print("Enter username: ");
            String username = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            System.out.print("Re-enter password: ");
            String confirmPassword = input.nextLine();

            if (!password.equals(confirmPassword)) {
                System.out.println("Passwords do not match. Please try again.");
            } else if (users.containsKey(username)) {
                System.out.println("Username already exists. Try another.");
            } else {
                users.put(username, password);
                LocalDate today = LocalDate.now();
                System.out.println("Today : " + today);
                System.out.println("Account created successfully!");

                hp = false;
            }
        }
    }
    public static void main(String[] args) {
        Acoount lol = new Acoount();

        lol.opciones();



    }
}