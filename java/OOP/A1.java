package OOP;

class TaskA {
    public static void main(String[] args) {
        int[] numbers = Input.intArray();
        int result = sum(numbers);
        System.out.println(result);
    }

    public static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }

}
