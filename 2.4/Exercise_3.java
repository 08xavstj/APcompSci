import java.util.Scanner;
public class Exercise_3{
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Let's add some numbers!");
     
     double number = input.nextDouble();
     double answer = 0;
     while (number >= 0) {
         System.out.println("Add: " + number);
         System.out.println("Total: " + (answer+ number));
         number = input.nextDouble();
        }
     System.out.println("Total = "+answer);
    }
}
