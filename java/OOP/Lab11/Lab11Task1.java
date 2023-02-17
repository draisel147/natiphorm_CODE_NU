public class Lab11Task1 {
    public static void main(String[] args) {
        Student stu;
        // stu = new Student(); รันไม่ได้เพราะ student เป็น abstract (ไม่สามารถสร้าง opj
        // ได้)
        stu = new Graduate("pink");
        stu.setTestScore(1, 80);
        stu.setTestScore(2, 90);
        stu.setTestScore(3, 80);
        stu.calGrade();
        System.out.println(stu);
        stu = new Undergrad("blank");
        stu.calGrade();
        System.out.println(stu);
    }

}
