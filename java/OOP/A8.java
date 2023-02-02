
import java.util.Arrays;

class A8 {
    public static void main(String[] args) {

        String[] array1 = Input.stringArray();
        String[] array2 = Input.stringArray();

        String[] commonElements = findCommonElements(array1, array2);

        if (commonElements.length == 0) {
            System.out.println("null");
        } else {

            Arrays.sort(commonElements);

            System.out.print(commonElements[0]);
            for (int i = 1; i < commonElements.length; i++) {
                System.out.print("," + commonElements[i]);
            }
            System.out.println();
        }
    }

    public static String[] findCommonElements(String[] array1, String[] array2) {
        String[] commonElements = new String[array1.length];
        int commonIndex = 0;

        for (String element1 : array1) {
            for (String element2 : array2) {
                if (element1.equals(element2)) {
                    commonElements[commonIndex] = element1;
                    commonIndex++;
                }
            }
        }
        return Arrays.copyOf(commonElements, commonIndex);
    }
}
