package testLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test3 extends JFrame implements ActionListener {
    Test3() {
        super("Window");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container GC = getContentPane();
        setLayout(new BorderLayout());

    }

    public static void main(String[] args) {
        Test3 App3 = new Test3();
        App3.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

    }

}