package OOP;

public class Lab8Task6 {
    public static void main(String[] args) {
        double[] list1 = { 2.3, 5.4, 7.1, 9.6 };
        int[] list2 = { 2, 5, 8, 6 };
        double avg = Calculator.average(list1, list2);
        System.out.println("Average is " + avg);
    }
}
