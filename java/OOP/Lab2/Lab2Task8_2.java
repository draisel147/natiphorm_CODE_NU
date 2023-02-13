
public class Lab2Task8_2 {
    public static void main(String[] args) {
        char z = last("programming");
        System.out.println("z = " + z);
    }

    public static char last(String word) {
        char lastword = word.charAt(word.length() - 1);
        return lastword;

    }
}
