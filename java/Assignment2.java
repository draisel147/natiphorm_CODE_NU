import java.util.Scanner;;

public class Assignment2 {
    // ��¹��������º��º����Ţ
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�Ѻ��ҵ���Ţ���1 : ");
        int num1 = sc.nextInt();
        System.out.print("�Ѻ��ҵ���Ţ���2 :");
        int num2 = sc.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " �ҡ���� " + num2);
        } else if (num1 < num2) {

            System.out.println(num1 + " ���¡��� " + num2);
        } else {
            System.out.println(num1 + " ��ҡѺ " + num2);

        }
    }
}
