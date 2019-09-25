import java.util.Scanner;
public class AreaToRadius {
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Area to Radius Calcumalator");
    System.out.println("");
    System.out.println("Area: ");
    
    double area = sc.nextInt();
    
    double a = Math.pow(area, 2)/ Math.PI;
    double b = Math.sqrt(a);
    double radius = b /2;
    
    System.out.println("Radius = "+ b);
    }
}
