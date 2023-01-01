package OOP;

//สร้าง method lastโดย method last ส่ง ออกเป็นค่า String
public class Lab3Task4 {
    public static void main(String[] args) {
        String[] hello = { "Hello", "Jeremy" };
        System.out.println(last(hello)); // prints "Jeremy"
        String[] empty = {};
        System.out.println(last(empty)); // prints "null"
    }

    static String last(String[] str) {
        if (str.length > 0) {
            return str[str.length - 1];
        } else {
            return null;
        }
    }

}
