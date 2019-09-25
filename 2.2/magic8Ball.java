import java.util.Scanner;
public class magic8Ball{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Q = "";

        System.out.println("Magic 8 Ball");

        System.out.print("Ask a YES or NO Question: ");
        Q = sc.next();

        int ques = (int) (Math.random() * 20) +1;

        if (Q != "") {
            if (ques == 1) {
                System.out.print("Yes - definitly.");
            } else if (ques == 2) {
                System.out.print("As I see it, yes.");
            } else if (ques == 3) {
                System.out.print("Ask again later.");
            } else if (ques == 4) {
                System.out.print("Better not tell you now.");
            } else if (ques == 5) {
                System.out.print("Cannot predict now.");
            } else if (ques == 6) {
                System.out.print("Concentrate and ask again.");
            } else if (ques == 7) {
                System.out.print("Don’t count on it.");
            } else if (ques == 8) {
                System.out.print("It is certain.");
            } else if (ques == 9) {
                System.out.print("It is decidedly so.");
            } else if (ques == 10) {
                System.out.print("Most likely.");
            } else if (ques == 11) {
                System.out.print("My reply is no.");
            } else if (ques == 12) {
                System.out.print("My sources say no.");
            } else if (ques == 13) {
                System.out.print("Outlook not so good.");
            } else if (ques == 14) {
                System.out.print("Outlook good.");
            } else if (ques == 15) {
                System.out.print("Reply hazy, try again.");
            } else if (ques == 16) {
                System.out.print("Signs point to yes.");
            } else if (ques == 17) {
                System.out.print("Very doubtful.");
            } else if (ques == 18) {
                System.out.print("Without a doubt.");
            } else if (ques == 19) {
                System.out.print("Yes.");
            } else if (ques == 20) {
                System.out.print("You may rely on it.");
            } else {
                System.out.print("error");
            }
        }

    }
}
