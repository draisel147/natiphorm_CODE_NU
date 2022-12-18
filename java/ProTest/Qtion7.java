package ProTest;

import java.util.Scanner;

public class Qtion7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in the string and the integer
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter an integer: ");
        int x = scanner.nextInt();

        // Check if the integer is within the range of the string
        if (x < 0 || x >= str.length()) {
            System.out.println("Error");
        } else {
            // Print out the x-th character of the string
            System.out.println(str.charAt(x - 1));
        }
    }
}