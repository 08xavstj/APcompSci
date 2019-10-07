import java.util.Scanner;
public class Exercise_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How long do you want your box?");
        double x = input.nextDouble();

        System.out.println("How tall do you want your box?");
        double y = input.nextDouble();
        for (int k = 1; k <= y; k++) {
            for (int i = 0; i <= x; i++) {
                length();
            }
            height();
        }
    }

    public static void length() {
        System.out.print("$");
    }

    public static void height() {
        System.out.println("");
    }
}
