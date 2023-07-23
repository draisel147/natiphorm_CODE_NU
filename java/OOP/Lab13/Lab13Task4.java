package Lab13;

import javax.swing.*;
import java.awt.*;

public class Lab13Task4 extends JFrame {
    Lab13Task4() {
        super("Layout Fun");
        setSize(400, 340);
        Container c = getContentPane();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        JPanel p1 = new JPanel();
        p1.setLayout(new BorderLayout());
        JLabel l1 = new JLabel("Calculator");// หรือ JLabel l1 = new JLabel("Calculator",SwingConstants.CENTER);
        l1.setFont(l1.getFont().deriveFont(28.0f));

        // SwingConstants จะเป็นการจัด label ในแนวนอน สามารถให้อยู่ตรงซ้าย ขวา หรือ
        // กลางก็ได้
        l1.setHorizontalAlignment(SwingConstants.CENTER);
        p1.add(l1);
        c.add(p1, BorderLayout.PAGE_START);

        JPanel p2 = new JPanel();
        p2.setLayout(new GridLayout(2, 3, 10, 10));
        final JButton b1 = new JButton("1");
        getContentPane().add(b1);
        final JButton b2 = new JButton("2");
        getContentPane().add(b2);
        final JButton b3 = new JButton("3");
        getContentPane().add(b3);
        final JButton b4 = new JButton("4");
        getContentPane().add(b4);
        final JButton b5 = new JButton("5");
        getContentPane().add(b5);
        final JButton b6 = new JButton("6");
        getContentPane().add(b6);
        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        p2.add(b6);
        c.add(p2, BorderLayout.CENTER);

    }

    public static void main(String[] args) {
        Lab13Task4 App4 = new Lab13Task4();
        App4.setVisible(true);
    }
}
