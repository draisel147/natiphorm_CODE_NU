package ProTest;

import java.util.Scanner;

//For Lab4Task1
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {// constructor
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private static Person inputPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter thee age: ");
        int age = sc.nextInt();

        Person p = new Person(name, age);
        return p;
    }

}
