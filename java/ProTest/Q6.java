package ProTest;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        String string1 = sc.nextLine();
        System.out.print("");
        String string2 = sc.nextLine();

        if (string1.compareTo(string2) < 0) {
            System.out.println(string1);
            System.out.println(string2);
        } else {
            System.out.println(string2);
            System.out.println(string1);
        }
    }
}
