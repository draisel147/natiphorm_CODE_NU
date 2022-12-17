package ProTest;

import java.util.Scanner;

public class Qtion4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        int n = scanner.nextInt();
        System.out.println();
        int m = scanner.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % m == 0) {
                System.out.println(i);
            }
        }
    }
}
