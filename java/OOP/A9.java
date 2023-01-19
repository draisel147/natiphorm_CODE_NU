package OOP;

import java.util.*;;

class A9 {
    public static void main(String[] args) {

        int[] input = Input.intArray();

        Set<Integer> set = new HashSet<>();

        for (int i : input) {
            set.add(i);
        }

        int[] output = new int[set.size()];
        int index = 0;
        for (int i : set) {
            output[index] = i;
            index++;
        }

        System.out.println(Arrays.toString(output));
    }
}
