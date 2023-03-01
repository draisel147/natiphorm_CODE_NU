package testLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test5 extends JFrame implements ActionListener {
    JTextField t1;
    JLabel l1;

    Test5() {
        super("Word Count");
        setSize(250, 150);
        setLocation(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        t1 = new JTextField();
        p1.add(t1);
        c.add(p1, BorderLayout.PAGE_START);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        JButton b1 = new JButton("Count");
        b1.addActionListener(this);
        p2.add(b1);
        c.add(p2, BorderLayout.LINE_START);

        JPanel p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        l1 = new JLabel("");
        p3.add(l1);
        c.add(p3);

    }

    public static void main(String[] args) {
        Test5 App5 = new Test5();
        App5.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String text = t1.getText();
        int charCount = text.length();
        l1.setText(charCount + " Characters");
    }
}
