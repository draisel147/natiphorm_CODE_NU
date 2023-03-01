package testLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test6 extends JFrame implements ActionListener {
    JButton b1;
    JLabel l1;
    private final int max = 6;
    private final int min = 1;

    Test6() {
        super("DICE");
        setSize(200, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        JPanel p1 = new JPanel();
        setLayout(new BorderLayout());
        p1.setLayout(new BorderLayout());

        JPanel p2 = new JPanel();
        setLayout(new FlowLayout());
        p2.setLayout(new FlowLayout());
        b1 = new JButton("Roll");
        b1.addActionListener(this);
        l1 = new JLabel("-");
        p2.add(b1);
        p2.add(l1);
        p1.add(p2);
        c.add(p1, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        Test6 App6 = new Test6();
        App6.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        JButton but = (JButton) e.getSource();
        if (but.getActionCommand().equals("Roll")) {

            int roll = (int) (Math.random() * (max - min + 1) + min);
            l1.setText(Integer.toString(roll));

        }

    }
}
