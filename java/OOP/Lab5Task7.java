package OOP;

public class Lab5Task7 {
    public static void main(String[] args) {
        Fraction half = new Fraction(1, 3);
        Fraction third = new Fraction(1, 2);
        System.out.print(half.toString() + " + " + third.toString());
        Fraction result = half.add(third);
        System.out.print(" = " + result.toString());
    }
}
