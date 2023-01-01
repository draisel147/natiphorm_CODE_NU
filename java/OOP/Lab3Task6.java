package OOP;

import java.util.*;;

public class Lab3Task6 {
    public static void main(String[] args) {
        System.out.println("Enter your text:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            String chack = Character.toString(str.charAt(i)).toLowerCase();
            if (chack.matches("[aeiou]")) {
                System.out.print(chack);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            String chack = Character.toString(str.charAt(i)).toLowerCase();
            if (chack.matches("[aeiou]")) {
                System.out.print(" ");
            } else {
                System.out.print(chack);
            }
        }
    }
}