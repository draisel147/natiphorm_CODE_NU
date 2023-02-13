
public class Lab5Task6 {
    public static void main(String[] args) {
        Fraction third = new Fraction(1, 3);
        Fraction half = new Fraction(1, 2);
        System.out.println(third.toString() + "*" + half.toString());
        Fraction result = third.multply(half);
        result.simplify();
        System.out.println("=" + result.toString());
    }
}
