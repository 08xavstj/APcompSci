import java.util.Scanner;
public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many rolls you want?: ");
        double rolls = input.nextDouble();
        
        for (int i = 0; i <= rolls; i++) {
         int roll = 0;
         roll = (int) (Math.random() * 6) + 1;                   
       }   
    }
}
