import java.util.Scanner;

public class Else_IF_statemant {
    public static void main(String[] args) {
        // สามารถใช้ if ซ้อน if ได้
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนอายุของคุณ  : ");
        int age = sc.nextInt();
        if (age >= 15 && age <= 19) {
            // || (มีข้างใดเป็นต้องก็จะจริง)
            // &&(ต้องเป็นจริงทัั้งคู่ถึงจะทำ) เป็นการจำกัด ขอบเขตของสิ่งของนั้นๆ
            System.out.println("วัยรุ่น");
        } else if (age >= 20 && age < 30) {
            System.out.println("วัยหนุ่มสาว");
        } else if (age >= 30 && age < 40) {
            System.out.println("วัยทำงาน");
        } else if (age >= 40 && age < 60) {
            System.out.println("วัยกลางคน");
        } else if (age >= 60) {
            System.out.println("วัยชรา");
        }
        System.out.println("จบโปรแกรม");
    }
}
