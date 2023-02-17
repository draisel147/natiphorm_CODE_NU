import java.util.Scanner;;

public class OOP4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int castle = Integer.parseInt(sc.nextLine());
        int principality = Integer.parseInt(sc.nextLine());
        String owner = sc.nextLine().toLowerCase();
        String name = sc.nextLine().toLowerCase();
        Palace p = new Palace(castle, principality, name, owner);
        if (p.isyourCastle() == true) {
            System.out.println(p.getOwner() + " is the owner of the " + p.getName() + " castle.");
        } else {
            System.out.println(p.getOwner() + " isn't the owner of the " + p.getName() + " castle.");
        }

    }
}
