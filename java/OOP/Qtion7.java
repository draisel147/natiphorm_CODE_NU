
import java.util.Scanner;

public class Qtion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        int x = scanner.nextInt();

        if (x < 0 || x >= str.length()) {
            System.out.println("Error");
        } else {

            System.out.println(str.charAt(x - 1));
        }
    }
}