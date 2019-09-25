
import java.util.Scanner;
public class D6{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("10 random 6-sided dice rolls");
    int roll = 0;
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 1: " + roll);
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 2: " + roll);
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 3: " + roll);
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 4: " + roll);
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 5: " + roll);
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 6: " + roll);
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 7: " + roll);
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 8: " + roll);
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 9: " + roll);
    
    roll = (int) (Math.random() * 6) + 1;
    System.out.println("Roll 10: " + roll);
    
}
}