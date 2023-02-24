package Lab12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

//task8
class Game extends JFrame implements ActionListener {

	final JLabel questionLabel;
	final JButton button1;
	final JButton button2;

	public Game() {

		setTitle("Countries and Cities Game");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container = getContentPane();

		setLayout(new FlowLayout());

		System.out.println();
		button1 = new JButton("");
		container.add(button1);
		button1.addActionListener(this);
		button2 = new JButton("");
		button2.addActionListener(this);
		container.add(button2);

		questionLabel = new JLabel();
		container.add(questionLabel);
		nextQuestion();
	}

	private void nextQuestion() {
		Question question = Question.randomQuestion();
		questionLabel.setText(question.getText());
	}

	public static void main(String[] args) {
		Game app = new Game();
		app.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		if(){

		}

	}
}
