import java.util.Scanner;

//โปรแกรม แลกเงิน
public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนจำนวณเงิน : ");
        int money = sc.nextInt();
        if (money >= 1000) {
            System.out.println("1000 บาท = " + (money / 1000) + " ใบ");
            money %= 1000;
        }
        if (money >= 500) {
            System.out.println("500 บาท = " + (money / 500) + " ใบ");
            money %= 500;
        }
        if (money >= 100) {
            System.out.println("100 บาท = " + (money / 100) + " ใบ");
            money %= 100;
        }
        if (money >= 50) {
            System.out.println("50 บาท = " + (money / 50) + " ใบ");
            money %= 50;
        }
        if (money >= 10) {
            System.out.println("10 บาท = " + (money / 10) + " เหรียญ");
            money %= 10;
            System.out.println("เศษ =" + money + " บาท");
        }
        if (money >= 5) {
            System.out.println("5 บาท = " + (money / 5) + " เหรียญ");
            money %= 5;
            System.out.println("เศษ =" + money + " บาท");
        }
    }
}
