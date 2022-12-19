public class Logictutorial {
    public static void main(String[] args) {
        /*
         * 
         * AND && ==> และ ต้อง true ทั้งหมดถึงจะ true(ถ้ามีฝั่งใดหรือตัวใดเป็น false
         * จะเป็นfalse)
         * OR || ==> หรือ ต้อง false ทั้งหมดถึงจะ false(ถ้ามีฝั่งใดหรือตัวใดเป็น true
         * จะเป็น true)
         * NOT ! ==> ไม่(ตรงข้าม)ถ้า a เป็น false a! จะกลายเป็น true
         * 
         */

        int a = 10, b = 20;

        boolean c = (a == b);// false
        boolean d = (a < b); // true

        System.out.println(c && d);// false
        System.out.println(c || d);// true
        System.out.println(!c);// true
        // (! ต้องใส่ด้านหน้าตัวนั้นๆ)

    }
}
