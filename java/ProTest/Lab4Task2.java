package ProTest;

import java.util.Scanner;

public class Lab4Task2 {
    public static void main(String[] args) {
        Person personA = inputPerson();
        Person personB = inputPerson();
    }

    static Person inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the age: ");
        int age = sc.nextInt();

        Person p = new Person(name, age);
        return p;
    }
}
