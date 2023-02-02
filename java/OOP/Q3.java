
import java.util.*;

//โปรแกรมนับตัวอักษร aeiou
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String exit_command = "quit";
        String name = "";

        while (true) {
            int count = 0;

            name = sc.nextLine();
            if (name.equals(exit_command))
                break;
            for (int i = 0; i < name.length(); i++) {
                String chack = Character.toString(name.charAt(i)).toLowerCase();
                if (chack.matches("[aeiou]"))
                    count++;
            } // for
            System.out.println(count);
        }

    }
}
