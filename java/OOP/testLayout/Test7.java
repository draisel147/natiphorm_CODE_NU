package testLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test7 extends JFrame implements ActionListener {
    JLabel l1;

    Test7() {
        super("Super Switch");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setLayout(new FlowLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new GridLayout(1, 2, 20, 20));
        JButton b1 = new JButton("^");
        b1.addActionListener(this);
        JButton b2 = new JButton("v");
        b2.addActionListener(this);
        p1.add(b1);
        p1.add(b2);
        c.add(p1);

        JPanel p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        l1 = new JLabel("Unknown");
        p2.add(l1);
        c.add(p2);

    }

    public static void main(String[] args) {
        Test7 App7 = new Test7();
        App7.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton but = (JButton) e.getSource();
        if (but.getActionCommand().equals("^")) {
            l1.setText("up");

        } else {
            l1.setText("down");
        }

    }
}
