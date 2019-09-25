import java.util.Scanner;
public class InterestCompounder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Interest Compound Calcumalator");
        System.out.println("");
        
        System.out.println("Principle = ");
        int Principle = sc.nextInt();
        
        System.out.println("Rate = ");
        double Rate = sc.nextDouble();
        
        System.out.println("Years = ");
        int Year = sc.nextInt();
        
        double amount = Math.pow((1 + Rate), Year) * Principle;
        
        System.out.println("Amount = " + amount);
    }
}
