
import java.util.Scanner;

//โปรแกรมนับ จำนวนคำแต่ละประโยค
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" ");

        System.out.println(words.length + " words");

        for (String word : words) {
            System.out.println(word + "(" + word.length() + ")");
        }
    }
}