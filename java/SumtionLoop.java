import java.util.Scanner;

public class SumtionLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0, avg = 0;
        while (true) {
            
            System.out.print("ป้อนตัวเลขของคุณ : ");
            int number = sc.nextInt();
            if (number <= 0)
                break;
            count++;
            sum += number;// ผลรวมตัวเลข 0+1+2+3+4+5=??
            // number++;// เพิ่มค่า 1,2,3,4,5
        }
        System.out.println("ผลรวม = " + sum);// total=15
        System.out.println("จำนวณที่ป้อน = " + count);// นับรอบ
        avg = sum / count;
        System.out.println("ค่าเฉลี่ย = " + avg);// ค่ากลางหรือค่าเฉลี่ย

    }
}
