class RuleVar {
    public static void main(String[] args) {
        int num1$ = 100;// ห้ามตั้งชื่อโดยตัวเลขนำหน้าหรือตัวอักษรพิเศษนำหน้าต่อหลังได้ไม่เป็นอะไรยกเว้น
                        // ___ ใส่ข้างหน้าได้
        int _for = 200;// ไม่สามารถใช่ชื่อตัวแปลที่ซ้ำกับคำสงวนได้แต่ถ้าใส่ __ สามารถใช้ได้

        System.out.println(num1$);
        System.out.println(_for);
    }

}
