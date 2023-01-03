public class WhileLoop {
    public static void main(String[] args) {
        /*
         * while(เงื่อนไข){
         * ทำอะไร
         * 
         * }
         */

        int count = 1;
        while (count <= 10) {
            System.out.println("รอบที่ " + count + " Hello World");
            count++;// 2,3,......,10
            if (count > 100) { // หรือ if (count>100) break; ก็ได้
                break;
            }
        }
    }
}
