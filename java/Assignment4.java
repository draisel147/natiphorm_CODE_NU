import java.util.Scanner;

public class Assignment4 {
    // โปรแกรมเเปลงปี พ.ศ เป็น ค.ศ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ปีพ.ศ : ");
        int year = sc.nextInt();
        int total = year - 543;
        System.out.println("คือ ค.ศ : " + total);

    }
}
