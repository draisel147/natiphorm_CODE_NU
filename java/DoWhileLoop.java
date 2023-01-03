public class DoWhileLoop {
    public static void main(String[] args) {
        /*
         * do{
         * คำสั่งให้ทำซ้ำ
         * }while(เงื่อนไข);
         */
        int count = 0;
        do {
            System.out.println(count);// ทำก่อนและเซ็คใน while ว่าตรงมั้ยถ้าตรงทำต่อไม่ตรงหยุด
            count++;
        } while (count < 5);
    }
}
