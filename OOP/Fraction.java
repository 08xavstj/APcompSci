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
     
    }
    
    public void setNum() {
        
    }
    
    public void setDen() {
        
    }
    
    
}
