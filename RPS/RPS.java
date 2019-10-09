import java.util.Scanner;
public class RPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ans = "y";

        System.out.println("I challenge you to RPS!");
        System.out.println("");

        while(ans.equals("y")) {
            RPS();
            System.out.println("Again? [y/n]");
            ans = sc.nextLine();
        }
    }

    public static void RPS() {
        Scanner sc = new Scanner(System.in);
       
        int w = 0;
        int l = 0;
        int t = 0;
       
        int rand = 0;
        rand = (int) (Math.random()*3)+1;

        System.out.print("What do you throw? [1] Rock, [2] Paper, [3] Scissors?");
        int pick = sc.nextInt();
        System.out.println("");
        if (pick == rand) {
            System.out.println("TIE?!");
            t++;
        } else if (pick == 1 && rand == 2) {
            System.out.println("you threw Rock and I threw Paper. I AM VICTORIOUS");
            l++;
        } else if (pick == 1 && rand == 3) {
            System.out.println("you threw Rock and I threw Scissors. You may have won");
            w++;
        } else if (pick == 2 && rand == 1) {
            System.out.println("you threw Paper and I threw Rock. :'(");
            w++;
        } else if (pick == 2 && rand == 3) {
            System.out.println("you threw Paper and I threw Scissors. Get sliced");
            l++;
        } else if (pick == 3 && rand == 1) {
            System.out.println("you threw Scissors and I threw Rock. Get Crushed Nerd");
            l++;
        } else if (pick == 3 && rand == 2) {
            System.out.println("you threw Scissors and I threw Paper. '...'");
            w++;
        } else {
            System.out.println("you cant throw that");
        }
        System.out.println("Wins: " + w);
        System.out.println("Ties: " + t);
        System.out.println("Losses: " + l);
    }
}