
// รับค่า arryโดยเว้นวรรค(split)
import java.util.*;

public class Lab3Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks: ");
        String input = sc.nextLine();
        String[] num = input.split(" "); // รับค่าเป็น arry โดย เว้นวรรค
        float sum = 0.0f;
        for (int i = 0; i < num.length; i++) {
            sum += Float.parseFloat(num[i]);// เปลี่ยนจาก string เป็น float
        }
        System.out.println("Your average mark is: " + sum / num.length);

    }

}
