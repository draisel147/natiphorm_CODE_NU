import java.util.Scanner;;

public class Assignment2 {
    // เขียนโปรแกรมเปรียบเทียบตัวเลข
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("รับค่าตัวเลขที่1 : ");
        int num1 = sc.nextInt();
        System.out.print("รับค่าตัวเลขที่2 :");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " มากกว่า " + num2);
        } else if (num1 < num2) {

            System.out.println(num1 + " น้อยกว่า " + num2);
        } else {
            System.out.println(num1 + " เท่ากับ " + num2);

        }
    }
}
