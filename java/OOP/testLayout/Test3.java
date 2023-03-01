package testLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Test3 extends JFrame implements ActionListener {
    JTextField t1, t2, t3, t4;
    JLabel total;
    JPanel p5;

    Test3() {
        super("Calculate");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2));
        t1 = new JTextField();
        t2 = new JTextField();

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout());
        t3 = new JTextField();
        t4 = new JTextField();

        p3.add(t1);
        p3.add(t2);

        JPanel p4 = new JPanel();
        p4.setLayout(new GridLayout());
        p4.add(t3);
        p4.add(t4);

        p1.add(p3);
        p1.add(p4);

        getContentPane().add(p1, BorderLayout.CENTER);

        JButton b1 = new JButton("Calculate");
        b1.addActionListener(this);

        JPanel p2 = new JPanel();
        p2.setLayout(new BorderLayout());
        p2.add(b1);

        getContentPane().add(p2, BorderLayout.PAGE_START);

        p5 = new JPanel();
        p5.setLayout(new BorderLayout());
        total = new JLabel("????");
        p5.add(total);
        getContentPane().add(p5, BorderLayout.PAGE_END);
    }

    public static void main(String[] args) {
        Test3 App3 = new Test3();
        App3.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int x1 = Integer.parseInt(t1.getText());
        int x2 = Integer.parseInt(t2.getText());
        int x3 = Integer.parseInt(t3.getText());
        int x4 = Integer.parseInt(t4.getText());

        int big = Math.max(Math.max(x1, x2), Math.max(x3, x4));
        total.setText("Bigger is :" + big);

    }

}