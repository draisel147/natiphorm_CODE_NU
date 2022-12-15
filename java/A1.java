import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        String input = scanner.nextLine();

        int atIndex = input.indexOf('@');

        if (atIndex != -1) {
            String beforeAt = input.substring(0, atIndex);
            System.out.println(beforeAt);
        } else {
            System.out.println();
        }
    }
}
