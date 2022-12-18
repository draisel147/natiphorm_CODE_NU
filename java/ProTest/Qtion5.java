package ProTest;

import java.util.Scanner;

public class Qtion5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int num = scanner.nextInt();

        int fac = 1;
        for (int i = 1; i <= num; i++) {
            fac *= i;
        }

        System.out.println(fac);
    }
}
