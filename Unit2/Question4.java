public class Question4 {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        int s = 1000;
        int total = 0;
        for(a = 1; a < s/3; a++) {
            for (b = a; b < s/2; b++) {
                c = s - a - b;
                if (a + b + c == 1000) {
                    if (a < b) {
                        if (b < c) {
                            if ((a*a) + (b*b) == (c*c)) {
                                System.out.println(a*b*c);

                            }
                        }
                    }
                }
            }
        }

    }
}
