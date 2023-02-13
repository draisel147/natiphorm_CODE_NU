
import java.util.Scanner;

public class Lab4Task2 {
    public static void main(String[] args) {
        Person personA = inputPerson();
        Person personB = inputPerson();
        if (personA.getAge() == personB.getAge()) {
            System.out.println(personA.getName() + " and " + personB.getName() + " are the same age.");
        } else {
            System.out.println(personA.getName() + " and " + personB.getName() + " are not the same age.");
        }
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
