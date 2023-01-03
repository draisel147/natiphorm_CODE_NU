import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ป้อนเลขเดือน  : ");
        String x = sc.nextLine();

        String name;
        /*
         * if (mouth == 1) {
         * System.out.println("มกราคม");// หรือ name="มกราคม";
         * } else if (mouth == 2) {
         * System.out.println("กุมภา");// name = "กุมภา";
         * } else if (mouth == 3) {
         * System.out.println("มีนา");// name = "มีนา";
         * } else {
         * System.out.println("เดือนอื่นๆ");// name " เดือนอื่นๆ";
         * }
         * // System.out.println(name);
         */
        switch (x) {
            case "ปว":// สามารถเปลี่ยนเป็น string ได้ ให้เปลี่ยน 1 เป็น "ข้อความ"
                name = "มกราคม";
                break;
            case "":
                name = "กุมภา";
                break;
            case "9":
                name = "มีนา";
                break;
            default:
                name = "เดือนอื่นๆ";
                break;
        }
        System.out.println(name);
    }
}
