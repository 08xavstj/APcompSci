import java.util.Scanner;
public class Exercise_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What character do you want your bar made of?: ");
        String key = input.nextLine();
        
        System.out.println("");
        
        System.out.print("How long do you want your bar?: ");
        Double num = input.nextDouble();
        
         for ( int i = 1; i <= num; i++){ 
         for ( int k = 1 ; k <= i; k++) {
             System.out.print(key);
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("That's What you ordered");
    }
}
