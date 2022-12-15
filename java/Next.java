import java.util.*;

public class Next {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ป้อนชื่อของคุณ : ");
        String name = sc.nextLine();// nextLine รับค่าที่เป็นสตริง next.....ต่อด้วยการรับค่านั้นๆ
        // สามารถใช่ Next เฉยๆ ก็ได้แต่!!!
        // จะอ่านได้แค่คำแรกถ้าเขียนสองคำและเว้นวรรคจะอ่านแค่คำด้านหน้า

        System.out.println("ชื่อของคุณคือ : " + name);

        Integer num = sc.nextInt();

    }
}
