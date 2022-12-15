import java.util.Scanner;

public class InputTutorial {

    public static void main(String[] args) {
        // รับค่าข้อมูล
        // รับข้อมูลแบบไหน ? ตัวเลข integer, float,long,double, ข้อความ(ส่วนใหญ่) String
        // ข้อความทำอะไร
        // ข้อความแบบตัวเลข => คำนวณได้ | คำนวณไม่ได้

        // ประกาศ ใช้งาน Class | new
        Scanner sc = new Scanner(System.in);
        System.out.print("ซื่อของคุณ : ");
        String name = sc.nextLine();// เป็นคำสั่งรับค่าจากแป้นพิม

        System.out.print("ป้อน พ.ศ. :");
        int year = sc.nextInt();

        int age = 2565 - year;// คำนวณอายุ

        System.out.println("ชื่อ ของ คุณ : " + name);// แสดงข้อความที่พิม
        System.out.println("ปีเกิด :" + year);
        System.out.print("อายุคือ :" + age);

    }

}
