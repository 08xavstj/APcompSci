import java.util.Scanner;
public class Exercise_7 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("I've picked a random number between 1 and 100. Try to guess it!");
        double ranNum = (int) ((Math.random() * 100) + 1);

        System.out.println("What is your guess?");
        double guess = input.nextDouble();

        int i = 0;
        while(guess != ranNum) {
            if (guess > ranNum) {
                System.out.println("Too High");
                System.out.print("Want to Guess Again?");
                guess = input.nextDouble();
                System.out.println("");
                i++;
            } else if (guess < ranNum) {
                System.out.println("Too Low");
                System.out.print("Want to Guess Again?");
                guess = input.nextDouble();
                System.out.println("");
                i++;
            }
        }  
        System.out.println("You've guessed my number! Good job!");
        System.out.println("It only took you " + i + " tries!");
    }
}
