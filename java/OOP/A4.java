package OOP;

import java.util.Scanner;

public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a set of numbers, separated by commas: ");
        String input = sc.nextLine();
        String[] numbers = input.split(",");

        boolean hasOne = false;
        boolean hasTwo = false;
        boolean hasThree = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i].equals("1")) {
                hasOne = true;
                if (hasTwo && !hasThree) {
                    System.out.println("false");
                    return;
                }
            } else if (numbers[i].equals("2")) {
                hasTwo = true;
                if (!hasOne && !hasThree) {
                    System.out.println("false");
                    return;
                }
            } else if (numbers[i].equals("3")) {
                hasThree = true;
                if (!hasOne || !hasTwo) {
                    System.out.println("false");
                    return;
                }
            }
        }

        if (hasOne && hasTwo && hasThree) {
            System.out.println("true");
        }
    }
}
