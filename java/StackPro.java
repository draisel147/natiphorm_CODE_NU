import java.util.*;

public class StackPro {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String bin = Integer.toBinaryString(num);
        System.out.println(bin);
    }
}