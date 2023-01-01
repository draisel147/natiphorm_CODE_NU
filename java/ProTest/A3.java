package ProTest;

class A3 {
    public static void main(String[] args) {
        int[] numbers = Input.intArray();
        boolean result = allEqual(numbers);
        System.out.println(result);
    }

    public static boolean allEqual(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

}
