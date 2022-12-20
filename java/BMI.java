import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนค่าน้ำหนัก(KG) : ");

        double wight = sc.nextDouble();
        System.out.print("ป้อนค่าส่วนสูง : ");
        double height = sc.nextDouble();
        height /= 100;

        double total = wight / (height * height);

        System.out.println("ดัชนีมวลกาย : " + total);

    }
}
