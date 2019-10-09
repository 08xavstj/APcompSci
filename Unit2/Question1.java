public class Question1 {
    public static void math(String[] args) {
        
        int a = 3;
        int b = 5;
        
        int total = 0;
        
        for (int n = 1; n < 1000; n++) {
            if (n % a == 0)  {
                total = total + n;
            } else if (n % b == 0) {
                total = total + n;
            }
        }
        System.out.print(total);
    }
}
