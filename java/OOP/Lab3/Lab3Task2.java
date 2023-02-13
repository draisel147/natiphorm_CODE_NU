
//รับ ค่า มาหาเลขเฉลี่ยทั้งหมด 
import java.util.Scanner;

public class Lab3Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of assessments: ");
        int numberOfAssessments = sc.nextInt();
        float[] marks = new float[numberOfAssessments];

        for (int i = 1; i <= numberOfAssessments; i++) {// วนกสรรับค่าจำนวน 1-4 และเก็บไว้ในตัวแปร i
            System.out.print("Mark for assessment " + i + ": ");
            marks[i - 1] = sc.nextFloat();

        }
        float average = 0;
        for (int i = 0; i < numberOfAssessments; i++) {// เอาค่า ตัวแปร i มาหาค่าเฉลี่ยโดยการ
                                                       // นำค่าทั้งหมดมาบวกกันและหารด้วยจำนวนทั้งหมด
            average = average + marks[i];
            /*
             * average =0
             * 
             */

        }
        average = average / numberOfAssessments;
        System.out.println("Your average mark is :" + average);

    }
}
