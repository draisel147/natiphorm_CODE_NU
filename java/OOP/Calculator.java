
// For Lab8 
public class Calculator {
    private int num;

    public Calculator() {
        this.num = num;
    }

    // Lab8Task1
    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    // Lab8Task2
    public static double average(int[] numbers) {
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            avg += numbers[i];
        }
        return avg / numbers.length;
    }

    // Lab8Task3
    public static double sum(double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        return sum;
    }

    // Lab8Task4
    public static double average(double[] numbers) {
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            avg += numbers[i];
        }
        return avg / numbers.length;
    }

    // Lab8Task5
    public static int sum(int[] list1, double[] list2) {
        int sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < list1.length; i++) {
            sum1 += list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            sum2 += list2[i];
        }

        return (int) (sum1 + sum2);
    }

    // Lab8Task6
    public static double average(double[] list1, int[] list2) {
        int avg1 = 0;
        double avg2 = 0;
        for (int i = 0; i < list1.length; i++) {
            avg1 += list1[i];
        }
        for (int i = 0; i < list2.length; i++) {
            avg2 += list2[i];
        }
        double total = list1.length + list2.length;
        return (int) (avg1 + avg2) / total;
    }

    public static double sum(double[] lish1, int[] lish2) {
        double ans = sum(lish1) + sum(lish2);
        return ans;
    }
    // =================================================================================
    // หรือจะใช้แบบนี้ก็ได้
    /*
     * Task4
     * public static double average(double[] numbers){
     * double ans = sum(numbers) / numbers.length;
     * return ans;
     * }
     * Task5
     * public static double sum(int[] lish1, double[] lish2){
     * double ans = sum(lish1) + sum(lish2);
     * return ans;
     * }
     * Task6
     * public static double sum(double[] lish1, int[] lish2){
     * double ans = sum(lish1) + sum(lish2);
     * return ans;
     * }
     */
    // =====================================================================================

}
