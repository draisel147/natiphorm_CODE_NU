public class CompoundAssign {
    public static void main(String[] args) {
        int x = 10, y = 5;
        System.out.println("ก่อนคำนวณ: " + x);

        x = x + y;
        // หรือ x+=y (เป็นการลดรูป)
        System.out.println("หลังคำนวณ: " + x);
    }
}
