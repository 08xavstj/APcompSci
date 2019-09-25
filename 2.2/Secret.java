import java.util.Scanner;
public class Secret{
    public static void main(String[] args) {
        //final String password = "dragon";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What's the password?");
        System.out.print("Password:");
        
        String pass = sc.nextLine();
        
        if (pass.equals("dragon")) {
            System.out.println("You are correct!");
        } else if (pass != "dragon") {
            System.out.println("Incorrect");
        }
    }
  }
