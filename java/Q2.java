import java.util.*;

//โปรแกรม แปลงเลขฐาน 16 เป็นเลขฐาน 2
public class Q2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String bin = Integer.toBinaryString(num);
        System.out.println(bin);
    }
}