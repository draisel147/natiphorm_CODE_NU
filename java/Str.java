class Str {
    public static void main(String[] args) {
        /*
         * String คือชนิดข้อมูลที่เก็บเป็นชุดข้อความ
         * Symbol = ""
         * 
         * char เก็บตัวอักษรได้ตัวเดียว
         * Symbol =''
         * 
         * char เรียงต่อกัน => string
         */

        String a = "100", b = "200";

        int c;
        // String => INT
        c = Integer.parseInt(a);
        c = c + 50;

        // String => Double
        double d = Double.parseDouble(a);
        d = d + 3.55;
        System.out.println(d);

        // int => String
        int num1 = 100;
        String age = String.valueOf(num1);
        System.out.println(age + 200);

        System.out.println(c);
        System.out.println(b);

        // วิธีเช็คข้อมูล

    }

}
