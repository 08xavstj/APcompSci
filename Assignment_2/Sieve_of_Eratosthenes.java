import java.util.ArrayList;
public class Sieve_of_Eratosthenes {
    public static void main(String[] args) {
        Method(100);
    }

    public static void Method(int n) {
        ArrayList<Integer> List = new ArrayList<Integer>(n);
        for (int p = 1; p < n; p++) {
            List.add(p);
        }
        int c = 2;
        for (int i = 0; i < List.size(); i++) {
            for (int k = 0; k < List.size(); k++) {
                if (List.get(k)%c == 0) {
                    List.remove(k);
                    k--;
                }
            }
            c++;
        }
        System.out.println(List); 
    }
}
