import java.util.Scanner;

//โปรแกรม วนรับค่า
public class MimMaxLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxnum = 0, minnum = Integer.MAX_VALUE;// กำหนดค่าสูงสุดใน Integer เพื่อไม่ให้ error
        while (true) {
            System.out.print("ป้อนตัวเลข : ");
            int number = sc.nextInt();
            if (number <= 0)// รับค่าจนกว่าจะรับค่า 0 ถึงจะหยุด
                break;
            if (number > maxnum) {// เปรียบเทียบค่า ถ้าเจอค่ามากให้เก็บไว้ใน maxnum
                maxnum = number;
            }
            if (number < minnum) {// เปรียบเทียบค่า ถ้าเจอค่าน้อยให้เก็บไว้ใน minnum
                minnum = number;
            }

        }
        System.out.println("ค่ามากสุด = " + maxnum);
        System.out.println("ค่าต่ำสุด = " + minnum);
    }
}
