package Lab13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Lab13Task5 extends JFrame implements ActionListener {
    final JTextField topField, bottomField;
    final JLabel equalsLabel;

    public Lab13Task5() {
        setTitle("Fraction to real");
        setSize(350, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        final JPanel calPanel = new JPanel(new FlowLayout());
        getContentPane().add(calPanel, BorderLayout.PAGE_START);
        final JButton calcButton = new JButton("Convert");
        calcButton.addActionListener(this);
        getContentPane().add(calcButton, BorderLayout.PAGE_END);

        topField = new JTextField("1", 2);
        calPanel.add(topField);
        final JLabel plusLabel = new JLabel("+");
        plusLabel.setFont(new Font("Helvetica Neue", Font.BOLD, 16)); // new font
        calPanel.add(plusLabel);
        bottomField = new JTextField("3", 2);
        calPanel.add(bottomField);
        equalsLabel = new JLabel("= ?");
        equalsLabel.setFont(new Font("Helvetica Neue", Font.BOLD, 16)); // new font
        calPanel.add(equalsLabel);
    }

    public static void main(String[] args) {
        Lab13Task5 app = new Lab13Task5();
        app.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(topField.getText());
        int b = Integer.parseInt(bottomField.getText());
        int ans = a + b;
        equalsLabel.setText(" = " + ans);
    }

}
