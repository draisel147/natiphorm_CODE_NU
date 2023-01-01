package OOP;

class Lab5Task5 {
    public static void main(String[] args) {
        Fraction quarter = new Fraction(1, 4);
        Fraction result = quarter.multply(2);
        System.out.println("2*" + quarter.toString() + "=" + result.toString());
    }
}
