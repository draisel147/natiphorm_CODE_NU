import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] words = input.split(" "); // split the input into words

        // Print the number of words in the sentence
        System.out.println(words.length + " words");

        // For each word, print the number of characters in it
        for (String word : words) {
            System.out.println(word + "(" + word.length() + ")");
        }
    }
}