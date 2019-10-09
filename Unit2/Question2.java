public class Question2 {
    public static void math(String[] args) {
        int a = 0;
        int b = 2;
        int c = 0;
        int total = 0;

        while (b < 1600000 && b % 2 == 0) {
            c = a + b;
            a = b;
            b = c;
            total = total + c;
            
        }
        System.out.println(total);
    }
}
