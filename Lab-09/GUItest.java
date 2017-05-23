import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class GUItest implements ActionListener {
	JFrame frame;
	JPanel commentPanel;
	JButton button1;
	JTextArea text;
	JLabel label;
	
	GUItest() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(700, 700);
		frame.setVisible(true);
		
		commentPanel = new JPanel();
		commentPanel.setLayout(null);
		
		label = new JLabel("Your feedback");
		label.setLocation(50, 25);
		label.setSize(100, 30);
		commentPanel.add(label);
		
		text = new JTextArea();
		text.setLocation(50, 50);
		text.setSize(500, 100);
		commentPanel.add(text);
		
		button1 = new JButton("Submit");
		button1.setLocation(50, 175);
		button1.setSize(100, 30);
		button1.addActionListener(this);
		commentPanel.add(button1);
		
		frame.add(commentPanel);
		frame.validate();
		
	}
	public void actionPerformed(ActionEvent e) {
		button1.setVisible(false);
		text.setEditable(false);
		
		JTextArea text2 = new JTextArea();
		text2.setLocation(50, 250);
		text2.setSize(500, 100);
		text2.append(text.getText());
		text2.setEditable(false);
		text2.setVisible(true);
		commentPanel.add(text2);
	}
	public static void main(String[] args) {
		GUItest gui=new GUItest();
	}
}