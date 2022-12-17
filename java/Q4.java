import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        String input = sc.nextLine();

        int atIndex = input.indexOf('@');

        if (atIndex != -1) {
            String beforeAt = input.substring(0, atIndex);
            System.out.println(beforeAt);
        } else {
            System.out.println();
        }
    }
}
