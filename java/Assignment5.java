import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนค่าน้ำหนัก(KG) : ");

        double wight = sc.nextDouble();
        System.out.print("ป้อนค่าส่วนสูง : ");
        double height = sc.nextDouble();
        height /= 100;

        double total = wight / (height * height);

        System.out.println("ดัชนีมวลกาย : " + total);

        // คำนวณ ความสมส่วน
        if (total <= 18) {
            System.out.println("ตำ่กว่าเกณฑ์");

        } else if (total >= 18.5 && total < 22.9) {
            System.out.println("สมส่วน");
        } else if (total >= 23.0 && total < 24.9) {
            System.out.println("น้ำหนักเกิน");
        } else if (total >= 25.0 && total < 29.9) {
            System.out.println("โรคอ้วน");
        } else if (total >= 30) {
            System.out.println("โรคอ้วนอันตราย");
        }

    }
}
