import java.util.Scanner;
public class Exercise_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ans = "y";


        while(ans.equals("y")) {
            rolls();
            System.out.println("Again ? [y/n]");
            ans = sc.nextLine();
        }
        System.out.println("goodest of byes");
    }

    public static void rolls() {
        Scanner sc = new Scanner(System.in);

        int roll = 0;

        System.out.print("How many dice do you want to roll?");
        double dieAmnt = sc.nextDouble();
        System.out.println("");

        System.out.print("How many sides do these dice have?");
        double dieSide = sc.nextDouble();
        System.out.println("");
        for (int i = 1; i <= dieAmnt; i++) {
            roll = (int) (Math.random()*dieSide)+1;
            System.out.print(roll + " ");
        }
    }
}
