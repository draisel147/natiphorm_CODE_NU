import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ใส่แม่สูตรคูณ : ");
        int x = sc.nextInt();
        for (int num = 1; num <= 12; num++) {
            System.out.println(x + " x " + num + " = " + (x * num));
        }

    }
}
