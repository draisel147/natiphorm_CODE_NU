package ProTest;

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer num = sc.nextInt();
        if (num > 0) {
            System.out.println("positive");
        }
        if (num < 0) {
            System.out.println("negative");
        }
        if (num == 0) {
            System.out.println("zero");
        }
    }
}
