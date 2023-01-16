import java.util.Scanner;

public class If18Old {
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
        } else if (a == 2) {
            System.out.print("แต่งงานรึยัง : ");
            String Mer = sc.nextLine();
            switch (Mer) {
                case "แต่งงานแล้ว":
                    Mer = "ใช้คำนำหน้านาง";
                    break;
                case "ยัง":
                    System.out.print("อายุเท่าไหร่ : ");
                    int ageG = sc.nextInt();
                    if (ageG >= 15) {
                        System.out.println("คำนำหน้า นางสาว");
                    } else {
                        System.out.println("คำนำหน้า เด็กหญิง");

                    }
                    break;
            }
        }
        System.out.println("จบโปรแกรม");

    }
}
