class Globalvar {
    public static void main(String[] args) {
        // Global Variable
        int a = 100;
        int b = 200;
        System.out.println(a);
        System.out.println();

        {
            int c = 300;// local Variable จำกัดขอบเขตแค่ในวงเล็บไม่สามารถเรียกใช้นอกวงเล็บได้
            System.out.println("A = " + a);
            System.out.println(c);
        }
        System.out.println(b);
        // System.out.println(c);
        // ***ไม่สามารถรันนอกวงเล็บได้เพราะถูกจำกัดแค่ในวงเล็บด้านบน***

    }
}