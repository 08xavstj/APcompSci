import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int aTot = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        int cTot = 0;
        double tots = 0;
        for (int i = 0; i <= 100; i++) {
            b = a * a;
            aTot = aTot + b;
            b = 0;
            a++;
        }
        
        for (int k = 1; k <=100; k++) {
             c = (100*(100+1)/2);
        }
        c = c * c;
        tots = c - aTot;
        System.out.println(tots);
    }
}
