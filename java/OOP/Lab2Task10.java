
import java.util.*;

public class Lab2Task10 {

    static final int standardHours = 40;
    static final float standardWagePerHour = 4.50f;
    static final float overtimeWagePerHour = 6.75f;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        int hours = scanner.nextInt();

        float wage = calculateWage(hours);
        String wage2dp = String.format("%.2f", wage);
        System.out.println("You will be paid £" + wage2dp + ".");
    }

    private static float calculateWage(float hoursWorked) {

        float standardWage = standardHours * standardWagePerHour;
        float overtimeWorked = hoursWorked - standardHours;
        float overtimeWage = overtimeWorked * overtimeWagePerHour;
        float finalWage = standardWage + overtimeWage;
        return finalWage;

    }
}
