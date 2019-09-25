import java.util.Scanner;
class Example1 {    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pythagorean Theorem Calculator");
        System.out.println("");
        System.out.println("A: ");
        int a = sc.nextInt();
        System.out.println("B: ");
        int b = sc.nextInt();
        
        
        double c = Math.sqrt(a*a) + Math.sqrt(b*b);
        
     
        
        System.out.println("C =" + c);
        
    } 
}
