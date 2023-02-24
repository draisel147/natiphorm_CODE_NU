package Lab12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MyAppTest extends JFrame implements ActionListener {
    JLabel resultJLabel;

    public MyAppTest() {
        super("MY application");
        setSize(300, 200);
        setLocation(10, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // contanier
        Container container = getContentPane();

        JLabel label = new JLabel("HEllo mor nor");
        container.add(label);
        JButton button = new JButton("Yes Flash");
        button.addActionListener(this);
        container.add(button);

        JButton punch = new JButton("Punch");
        button.addActionListener(this);
        container.add(punch);
        resultJLabel = new JLabel("");
        container.add(resultJLabel);

    }

    public void actionPerformed(ActionEvent e) {
        // ทุกคลาสที่เป็น Jbutton จะมีaction ดังนี้
        JButton b = (JButton) e.getSource();
        if (b.getActionCommand().equals("Punch")) {
            resultJLabel.setText("ney");
        } else {
            resultJLabel.setText("what do you call ");
        }
        // สามารถเปลี่ยนคำเดิมจาก ****** เป็น hello hello ได้
        /*
         * resultJLabel.setText("hello hello");
         * System.out.println("Hello Hello");
         */
    }

    public static void main(String[] args) {
        MyAppTest app = new MyAppTest();
        app.setVisible(true);
    }
}
