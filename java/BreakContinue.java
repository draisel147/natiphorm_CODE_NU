public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0)
                // continue;// กระโดดข้ามเลข ไปเลยและทำต่อให้จบ
                // break;// สั่งหยุดแล้วกระโดดออกจากลูป
                System.out.println(i);
        }
        System.out.println("จบโปรแกรม");

    }
}
