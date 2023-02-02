
import java.util.Scanner;

//โปรแกรม หารเลข
public class Qtion4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int m = scanner.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {

            if (i % m == 0) {
                System.out.println(i);
            }
        }
    }
}
