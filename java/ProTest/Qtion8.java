package ProTest;

import java.util.Scanner;

public class Qtion8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();
        int amount = sc.nextInt();

        int change = amount - price;

        int Coins20 = change / 20;
        change = change % 20;
        int Coins10 = change / 10;
        change = change % 10;
        int Coins5 = change / 5;
        change = change % 5;
        int Coins2 = change / 2;
        change = change % 2;
        int Coins1 = change;

        System.out.println(Coins20 + " " + Coins10 + " " + Coins5 + " " + Coins2 + " " + Coins1);
    }
}
