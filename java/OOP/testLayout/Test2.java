package testLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test2 extends JFrame implements ActionListener {
    JButton b1;

    Test2() {
        super("Switch");
        setSize(200, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());
        b1 = new JButton("ON");
        b1.addActionListener(this);
        getContentPane().add(b1, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        Test2 App2 = new Test2();
        App2.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton but = (JButton) e.getSource();
        if (but.getActionCommand().equals("ON")) {
            b1.setText("OFF");
        } else {
            b1.setText("ON");
        }

    }

}
