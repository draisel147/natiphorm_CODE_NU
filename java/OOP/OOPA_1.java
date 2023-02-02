
import java.util.Scanner;

public class OOPA_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palace p = new Palace(sc.nextInt(), sc.nextInt());
        System.out.print("Palace of Atom has " + p.getCastle() + " Castle");
        if (p.getCastle() > 1) {
            System.out.print("s");
        }
        System.out.print("including " + p.getPrincipality() + " Principality");

        if (p.getPrincipality() > 1) {
            System.out.print("s");
        }
    }
}
