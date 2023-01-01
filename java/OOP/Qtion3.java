package OOP;

import java.util.Scanner;

public class Qtion3 {
    // โปรแกรม ลำดับดวงดาว
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        String planet = input.nextLine().toLowerCase();

        if (planet.equals("mercury")) {
            System.out.println("Mercury is the 1th planet from the Sun.");
        } else if (planet.equals("venus")) {
            System.out.println("Venus is the 2th planet from the Sun.");
        } else if (planet.equals("earth")) {
            System.out.println("Earth is the 3th planet from the Sun.");
        } else if (planet.equals("mars")) {
            System.out.println("Mars is the 4th planet from the Sun.");
        } else if (planet.equals("jupiter")) {
            System.out.println("Jupiter is the 5th planet from the Sun.");
        } else if (planet.equals("saturn")) {
            System.out.println("Saturn is the 6th planet from the Sun.");
        } else if (planet.equals("uranus")) {
            System.out.println("Uranus is the 7th planet from the Sun.");
        } else if (planet.equals("neptune")) {
            System.out.println("Neptune is the 8th planet from the Sun.");
        } else {
            System.out.println("Invalid planet name. Please enter a valid planet name.");
        }
    }
}
