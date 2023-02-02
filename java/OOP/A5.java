
public class A5 {
    public static void main(String[] args) {
        String[] words = Input.stringArray();
        boolean found = false;
        for (String word : words) {
            if (word.length() > 6) {
                System.out.println(word);
                found = true;
            }
        }
        if (!found) {
            System.out.println("nothing");
        }
    }
}
