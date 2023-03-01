package testLayout;

import javax.swing.*;
import java.awt.*;

class MyApp extends JFrame {
    MyApp() {
        super("Login");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // p1 สร้าง panel(Grid) ที่เอาไว้เก็บ User และ password
        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 1));
        JLabel l1 = new JLabel("Username :");
        JLabel l2 = new JLabel("Password :");
        // p3 สร้าง panel(Flow) เอาไว้จัดระแบบให้ user และ textfield อยู่ด้วยกัน
        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        JTextField f1 = new JTextField(20);
        JTextField f2 = new JTextField(20);

        p3.add(l1);
        p3.add(f1);
        // p4 สร้าง panel(Flow) เอาไว้จัด password และ textfield ให้อยู่ด้วยกัน
        JPanel p4 = new JPanel();
        p4.setLayout(new FlowLayout());
        p4.add(l2);
        p4.add(f2);
        /****** เป็นการเอา p3 มาไว้ใน p1 *********/
        p1.add(p3);
        /****** เป็นการเอา p4 มาไว้ใน p1 *********/
        p1.add(p4);

        // เป็นการเพิ่ม p1 เป็นแบบ (BorderLayout.PAGE_START) อยู่ที่หัว
        getContentPane().add(p1, BorderLayout.PAGE_START);
        // =================================================================
        // สร้างปุ่ม login
        JButton b1 = new JButton("Log in");
        JButton b2 = new JButton("Cancel");
        // p2 สร้าง panel(Flow) เอาไว้จัดให้ ปุ่ม login และ Cancel อยู่ด้วยกัน
        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        p2.add(b1);
        p2.add(b2);
        // เพิ่ม p2 เป็นแบบ (BorderLayout.CENTER) อยู่ตรงกลาง
        getContentPane().add(p2, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        MyApp app = new MyApp();
        app.setVisible(true);
    }
}