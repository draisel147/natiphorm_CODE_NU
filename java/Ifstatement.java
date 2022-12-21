import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("เลือกเพศ");
        System.out.println("1.ชาย");
        System.out.println("2.หญิง");
        System.out.print("ระบุตัวเลข :");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.print("ระบุอายุ : ");
            int ageM = sc.nextInt();
            if (ageM >= 15) {
                System.out.println("คำนำหน้า นาย");
            } else {
                System.out.println("คำนำหน้า เด็กชาย");

            }
        }
        if (a == 2) {
            System.out.println("แต่งงานรึยัง : ");
            String Mer = sc.next();
            if (Mer.equals("แต่งงานแล้ว")) {
                System.out.println("ใช้คำนำหน้า นาง");
            }
            if (Mer.equals("ยัง")) {
                System.out.println("ระบุอายุ : ");
                int ageF = sc.nextInt();
                if (ageF >= 15) {
                    System.out.println("คำนำหน้า นางสาว");
                } else {
                    System.out.println("คำนำหน้า เด็กหญิง");
                }

            }
        }
        System.out.println("จบโปรแกรม");

    }
}
