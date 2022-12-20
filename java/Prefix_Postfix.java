public class Prefix_Postfix {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        // pre หน้า ทำก่อนแล้วใช้ค่า | post หลัง ใช้ค่าก่อนแล้วค่อยบวก

        // prefix
        System.out.println(a);// 5
        System.out.println(++a); // 6 // prefix //จะทำการบวกแล้วค่อบใช้ค่าใหม่
        System.out.println(a);// 6

        System.out.println();

        // postfix
        System.out.println(b); // 5
        System.out.println(b++); // 5 // postfix //จะทำการใชค่าเดิมก่อนและบวกทีหลัง
        System.out.println(b);// 6

    }
}
