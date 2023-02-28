package testLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test3 extends JFrame implements ActionListener {
    JButton bCal;

    Test3() {
        super("Calculater");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        Container c = getContentPane();

        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        bCal = new JButton("Calculate");
        bCal.addActionListener(this);
        c.add(bCal, BorderLayout.PAGE_START);

        JPanel p3 = new JPanel();
        p3.setLayout(new GridLayout(2, 2));
        JTextField t1 = new JTextField("");
        JTextField t2 = new JTextField("");
        JTextField t3 = new JTextField("");
        JTextField t4 = new JTextField("");

    }

    public static void main(String[] args) {
        Test3 App3 = new Test3();
        App3.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton but = (JButton) e.getSource();

    }

}
