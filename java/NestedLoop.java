public class NestedLoop {
    public static void main(String[] args) {
        // loop นอก
        for (int i = 1; i <= 3; i++) {
            System.out.println("รอบนอก =" + i);
            // loop ใน
            for (int j = 1; j <= 5; j++) {
                System.out.println("รอบใน =" + j);

            }
        }

    }
}
