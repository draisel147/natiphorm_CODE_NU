package OOP;

import java.util.Scanner;

public class Qtion6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.print(square + " ");
        }
    }
}