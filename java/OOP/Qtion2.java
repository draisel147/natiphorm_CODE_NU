package OOP;

import java.util.Scanner;

//leap year โปรแกรมคำนวน 4ปี
public class Qtion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        System.out.println(isLeapYear);
    }
}
