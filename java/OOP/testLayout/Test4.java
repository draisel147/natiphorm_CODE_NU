package testLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test4 extends JFrame implements ActionListener {
    JLabel l1;
    int up;

    Test4() {
        super("Window");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(1, 2));
        JButton b1 = new JButton("x2");
        b1.addActionListener(this);
        add(b1);
        l1 = new JLabel("1");
        up = 1;
        add(l1);
    }

    public static void main(String[] args) {
        Test4 App4 = new Test4();
        App4.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton but = (JButton) e.getSource();
        if (but.getActionCommand().equals("x2")) {
            up *= 2;
        }
        l1.setText(Integer.toString(up));
    }
}
