package ProTest;

import java.util.Scanner;

public class Qtion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in the number n
        System.out.print(" ");
        int n = scanner.nextInt();

        // Print out the sequence of square numbers up to the n-th item
        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
    }
}