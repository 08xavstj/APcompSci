import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        final int r = 1;
        final int p = 2;
        final int s = 3;

        String ans = "y";
        Scanner sc = new Scanner(System.in);

        System.out.println("I challenge you to RPS");
        System.out.println("");

        while (ans.equals("y")) {
            game();
            System.out.print("Again [y/n]");
            ans = sc.nextLine();
            System.out.println("");
        }
    }
    
    public static void game() {
    
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What do you throw? [1] Rock - [2] Paper - [3] Scissorcs");
        int thrw = sc.nextInt();
        
              
        if (thrw == 1) {
            System.out.println("You Threw Rock, I Threw Paper");
            loss++;
        }
    }
}
