package Lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyApp2 extends JFrame implements ActionListener {
    JLabel resultJLabel;

    public MyApp2() {
        setTitle("My  Application");
        setSize(300, 200);
        setLocation(10, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        final JLabel JLabel = new JLabel("Hello Mor Nor");
        getContentPane().add(JLabel);

        // ===================== Button ===================== //
        final JButton button = new JButton("Yes flash?");
        button.addActionListener(this);// ทำให้กดปุ่มแล้วมี action
        // (button) คือชื่อตัวแปล
        // getContentPane() คือจะทำให้มันแสดงบน JFrame
        getContentPane().add(button);
        JButton button2 = new JButton("punch");
        button2.addActionListener(this);
        getContentPane().add(button2);

        resultJLabel = new JLabel("");
        getContentPane().add(resultJLabel);
    }

    public static void main(String[] args) {
        MyApp2 app = new MyApp2();
        app.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getActionCommand().equals("punch")) {
            resultJLabel.setText("Pregnant!");
        } else {
            resultJLabel.setText("What do you call a three humped calmel?");
        }
    }
}
