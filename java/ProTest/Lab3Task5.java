package ProTest;

public class Lab3Task5 {
    public static void main(String[] args) {
        int[] numbers = { 5, 9, 12, 7, 14, 3, 2 };
        int[] numbers5 = arrayPlus(numbers, 5);
        for (int i = 0; i < numbers5.length; i++) {
            System.out.print(numbers5[i] + ", ");
        }
        System.out.println();
        int[] numbers10 = arrayPlus(numbers, 10);
        for (int i = 0; i < numbers10.length; i++) {
            System.out.print(numbers5[i] + ", ");
        }
        System.out.println();

    }

    static int[] arrayPlus(int[] arr, int n) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[i] + n;
        }
        return ans;
    }

}
