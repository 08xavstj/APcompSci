import java.util.Scanner;
public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many rolls you want?: ");
        double rolls = input.nextDouble();
        boolean again = true;
        while (again) { 
            if (again) {
                for (int i = 0; i <= rolls; i++) {
                    double roll = (int) (Math.random() * 6) + 1;
                    System.out.println(roll);
                }               
                System.out.println("again [y/n]");
                String yesno = input.nextLine();            
                if (yesno.equals("n")) {
                    again = false;
                } else if (yesno.equals("y")) {
                    again = true;
                    System.out.print("How many rolls you want?: ");
                    rolls = input.nextDouble();
                }
            }
        }       
    }
}