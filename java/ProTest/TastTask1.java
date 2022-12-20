package ProTest;

public class TastTask1 {
    public static void main(String[] args) {
        String input = "This is the way it is";
        int numOfVowels = countVowels(input);
        System.out.println("The string \"" + input + "\"" + "has " + numOfVowels);
    }

    static int countVowels(String str) {
        int num = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                    || c == 'U')
                num++;
        }
        return num;

    }

}
