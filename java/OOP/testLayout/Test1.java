package testLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test1 extends JFrame implements ActionListener {
    JButton b1, b2;
    JLabel l1;
    int count;

    Test1() {
        super("Window");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        Container c = getContentPane();
        b1 = new JButton("-");
        b1.addActionListener(this);
        l1 = new JLabel("1");
        count = 1; // เพิ่มตัวนับเลขขึ้นมา
        b2 = new JButton("+");
        b2.addActionListener(this);
        c.add(b1);
        c.add(l1);
        c.add(b2);
    }

    public static void main(String[] args) {
        Test1 appTest1 = new Test1();
        appTest1.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton but = (JButton) e.getSource();
        if (but.getActionCommand().equals("-")) {
            count--;// เมื่อกดปุ่ม count จะลด
        } else {
            count++;
        }
        l1.setText(Integer.toString(count)); // แสดงค่าโดยเปลี่ยนจาก int เป็น String
    }
}
