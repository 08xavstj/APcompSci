import java.util.Scanner;
public class Exercise_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What character do you want your bar made of?: ");
        String key = input.nextLine();
        
        System.out.println("");
        
        System.out.print("How long do you want your bar?: ");
        Double num = input.nextDouble();
        
        int i = 0;
        while (i <= num) {
            System.out.print(key);
            i++;
        }
        
        System.out.println("");
        System.out.println("That's What you ordered");
    }
}
