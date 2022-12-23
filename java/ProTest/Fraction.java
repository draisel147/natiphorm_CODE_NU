package ProTest;

public class Fraction {
    private int top;
    private int bottom;

    public Fraction(int top, int bottom) {
        this.top = top;
        this.bottom = bottom;
    }

    public String toString() {
        return top + "/" + bottom;
    }

    public double toDouble() {
        return (double) top / bottom;
    }

    public boolean eqals(Fraction x) {
        return top == x.top && bottom == x.bottom;
    }

    private int gcd(int a, int b) {
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }

    public void simplify() {
        int n = gcd(top, bottom);
        top = top / n;
        bottom = bottom / n;
    }

    public Fraction multply(int m) {
        Fraction ans;
        ans = new Fraction(m * top, bottom);
        ans.simplify();
        return ans;
    }

    public Fraction multply(Fraction f) {
        Fraction ans;
        ans = new Fraction(top * f.top, bottom * f.bottom);
        ans.simplify();
        return ans;
    }

    public Fraction add(Fraction a) {
        Fraction ans;
        ans = new Fraction(top * a.bottom + bottom * a.top, bottom * a.bottom);
        ans.simplify();
        return ans;
    }

    public static Fraction parse(String s) {
        String[] word = s.split("/", -1);
        int top = Integer.parseInt(word[0]);
        int bottom = Integer.parseInt(word[1]);
        return new Fraction(top, bottom);
    }

}