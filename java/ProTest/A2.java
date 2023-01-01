package ProTest;

public class A2 {
    public static void main(String[] args) {
        String[] words = Input.stringArray();
        String result = longWord(words);
        System.out.println(result);
    }

    public static String longWord(String[] words) {
        for (String word : words) {
            if (word.length() > 6) {
                return word;
            }
        }
        return "nothing";
    }
}
