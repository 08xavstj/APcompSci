import java.util.ArrayList;
class Fraction {
    private static int a,b;
    public Fraction() {
        this.a = 0;
        this.b = 1;
    }

    public Fraction(int x,int y) {
        this.a = a;
        if (b == 0) {
            System.out.println("broken");
            b = 1;
        } else {
            this.b = b;
        }
    }

    public Fraction(String f) {
        int str = f.indexOf("/");
        String num = f.substring(0,str);
        String den = f.substring(str+1);
        this.a = Integer.parseInt(num);       
        if (den.equals("0")) {
            den = "1";
        } else {
            this.b = Integer.parseInt(den);
        }
    }

    public Fraction(Fraction f) {
        this.a = f.a;
        this.b = f.b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public String toString() {
        return a+"/"+b;
    }

    public double toDouble() {
        return a/b;
    }

    public void reduce() {
        int gcf = GCF(this.a, this.b);
        this.a = this.a/gcf;
        this.b = this.b/gcf;
    }

    public void setNum(int a) {
        this.a = a;
    }

    public void setDen(int b) {
        this.b = b;
    }
    
    public static Fraction multiply(Fraction numer, Fraction denom) {
        int num,den;
        num = numer.a * denom.a;
        den = numer.b * denom.b;
        Fraction f = new Fraction(num,den);
        f.reduce();
        return f;        
    }
    
    public static Fraction divide(Fraction numer, Fraction denom) {
        int num,den;
        num = numer.a * denom.b;
        den = numer.b * denom.a;
        Fraction f = new Fraction(num,den);
        f.reduce();
        return f;        
    }
    
    public static Fraction add(Fraction numer, Fraction denom) {
        int com = numer.b * denom.b;
        numer.a = numer.a * denom.b;
        denom.a = denom.a * numer.b;
        
        Fraction f = new Fraction(numer.a+denom.b, com);
        return f;
    }
    
    public static Fraction subtract(Fraction numer, Fraction denom) {
        int com = numer.b * denom.b;
        numer.a = numer.a * denom.b;
        denom.a = denom.a * numer.b;
        
        Fraction f = new Fraction(numer.a-denom.b, com);
        return f;
    }
    
    private static int GCF(int num, int den) {
        num = Math.abs(num); 
        den = Math.abs(den);

        while (num != den) {
            if (num>den) {
                num = num - den;
            }
            if (num<den) {
                den = den - num;
            }
        }
        return num;
    }
}
