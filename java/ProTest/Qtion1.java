package ProTest;

import java.util.*;
//โปรแกรมคำนวณ อายุบนโลกและดวงจันทร์

public class Qtion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double num = ((x * 365.25) / 224.70);
        System.out.printf("%.3f", num);

    }

}
