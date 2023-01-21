import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("รับค่า :");
        int num1 = sc.nextInt();
        if (num1 % 2 == 0) {
            System.out.println(num1 + "เป็นเลขคู่");
        } else {
            System.out.println(num1 + "เป็นเลขคี่");

        }

        /////////////////////////////////////////////
        ////////// แบบลดรูป/////////////////////
        // ตัวแปร = (เงื่อนไข)? คำสั่งเงื่อนไขเป็นจริง : คำสั่งเมื่อเงื่อนไขเป็นเท็จ;
        String n = "";// รับเป็นค่า string
        n = (num1 % 2 == 0) ? num1 + " = เลขคู่" : num1 + " = เลขคี่";
        System.out.println(n);
    }
}
