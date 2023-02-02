
class A6 {
    public static void main(String[] args) {
        int[] numbers = Input.intArray();
        int[] result = decOdd(numbers);
        // for loop to print array result
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ",");

        }
    }

    public static int[] decOdd(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                result[i] = numbers[i] - 1;
            } else {
                result[i] = numbers[i];
            }
        }
        return result;
    }
}
