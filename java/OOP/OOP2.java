import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class OOP2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int castle = Integer.parseInt(sc.nextLine());
        int principality = Integer.parseInt(sc.nextLine());
        Palace p = new Palace(castle, principality);
        System.out.println(p.toString());
    }
}
