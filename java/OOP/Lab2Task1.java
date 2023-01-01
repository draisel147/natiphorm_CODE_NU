package OOP;

import java.util.*;

public class Lab2Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = scanner.nextLine();

        String numberOfLetters = name;
        System.out.println("There are " + numberOfLetters + " Letters in your name.");
    }

}
