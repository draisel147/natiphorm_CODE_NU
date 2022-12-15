package ProTest;

import java.util.*;;

public class Lab3Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[1000];
        String word = sc.next();
        int i = 0;
        while (!word.equals("*")) {
            str[i] = word;
            word = sc.nextLine();
            i++;
        }
        int num = i / 2;
        if (i % 2 == 0) {
            System.out.print("Then output the middle iTem\n" + str[i / 2]);
        } else
            System.out.print("Then output the middle 2 iTem\n" + str[i - (num - 1)] + "\n" + str[i - (num + 1)]);
    }
}
