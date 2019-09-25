import java.util.Scanner;
public class GradeCalcumalator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Grade Calcumalator");

        System.out.println("What was your test mark?");
        double mark = sc.nextDouble();

        System.out.println("What was it out of?");
        double outOf = sc.nextDouble();

        double total = (mark/outOf) * 100;

        if (total < 50) {
            System.out.println("F");
            System.out.println("You can do better");
        } else if (total >= 50 && total < 60) {
            System.out.println("C-");
            System.out.println("You can do better");
        } else if (total >= 60 && total < 67) {
            System.out.println("C");
            System.out.println("You can do better");
        } else if (total >= 67 && total < 73) {
            System.out.println("C+");
            System.out.println("You can do better");
        } else if (total >= 73 && total < 86) {
            System.out.println("B");
            System.out.println("You can do better");
        } else if (total >= 86 && total <= 100) {
            System.out.println("A");
            System.out.println("You can do better");
        } else {
            System.out.println("Impossible"); 
        }
    }
}
