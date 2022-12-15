
public class Chackstr {
    public static void main(String[] args) {
        // เช็คชนิดข้อมูล
        Integer a = 10;
        Double b = 10.5;
        String c = "Hello World";
        boolean d;
        char e;
        float f;

        // เป็น (true) / ไม่เป็น (false)
        boolean result = c instanceof String;
        System.out.println(result);

        boolean result1 = a instanceof Integer;
        // boolean result1 = a.toString() instanceof String;
        // //เช็คว่าเป็นสตริงต้องแปลงเป็นสตริงก่อน
        System.out.println(result1);

        boolean result2 = b instanceof Double;
        System.out.println(result2);

    }
}
