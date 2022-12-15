import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        String ans = "";
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        while (!name.equals("@")) {
            ans += name + " ";

        }
        name = name.trim();
        System.out.println(name);

    }
}
