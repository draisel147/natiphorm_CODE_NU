
// ID   64312871            Name Natiphorm sonta
import java.util.*;

class MenuFraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fraction a = new Fraction(0, 1);
        Fraction b = new Fraction(0, 1);
        int n = 0;
        while (n < 4) {
            System.out.println();
            printMenu();

            System.out.print("get choice: ");
            n = sc.nextInt();
            if (n == 1) {

                String geta = sc.next();
                a = Fraction.parse(geta);
                System.out.print("get Fraction A: " + geta.toString());

            }
            if (n == 2) {
                String getb = sc.next();
                b = Fraction.parse(getb);
                System.out.print("get Fraction B: " + getb.toString());

            }
            if (n == 3) {
                Fraction getc = a.multiply(b);

                System.out.print(" A * B: " + getc);

            }

        }

    }

    // code go here //
    // main

    static void printMenu() {
        System.out.println("1. get Fraction A: ");
        System.out.println("2. get Fraction B: ");
        System.out.println("3. Fraction A * B: ");
        System.out.println("4. quit");
    }
}
