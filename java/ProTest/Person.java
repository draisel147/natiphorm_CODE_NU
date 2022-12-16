package ProTest;

//For Lab4
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

    public void increaseAge() {
        age += 1;

    }

    public String toString() {
        return name + "(" + age + ")";

    }

    public boolean equals(Person h) {
        if (name.equals(h.getName()) && age == h.getAge()) {
            return true;
        } else {
            return false;
        }

    }
}
