package ProTest;

import java.util.Scanner;

public class Input {
    public static String[] stringArray() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] result = input.split(",");
        return result;
    }

    public static int[] intArray() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(",");

        int[] result = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }
        return result;
    }
}
