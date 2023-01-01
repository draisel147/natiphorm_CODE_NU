package OOP;

public class Lab2Task5 {
    public static void main(String[] args) {
        final int MIN = 10, MAX = 20;
        int num = 15;
        for (int value = num; value <= MAX; value++)
            if (value % 4 != 0)
                System.out.println(value);

    }

}
