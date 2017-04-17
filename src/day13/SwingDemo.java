package day13;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SwingDemo {
	public void init () {
		JFrame frame = new JFrame();
		frame.setSize(500, 300);
		frame.setLocation(400, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel jPanel = (JPanel) frame.getContentPane();
		jPanel.setLayout(new FlowLayout());
		
		final JTextField text1 = new JTextField();
		text1.setPreferredSize(new Dimension(120, 30));
		jPanel.add(text1);
		
		JLabel label = new JLabel("+");
		label.setPreferredSize(new Dimension(30, 30));
		jPanel.add(label);
		
		final JTextField text2 = new JTextField();
		text2.setPreferredSize(new Dimension(120, 30));
		jPanel.add(text2);
		
		JButton button = new JButton("=");
		button.setPreferredSize(new Dimension(60, 30));
		jPanel.add(button);
		
		final JTextField textField = new JTextField();
		textField.setPreferredSize(new Dimension(120, 30));
		jPanel.add(textField);
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());
				int num2 = Integer.parseInt(text2.getText());
				int result = num1 + num2;
				
				textField.setText(String.valueOf(result));
			}
		});
		
		frame.setVisible(true);
		
	} 
	
	public static void main(String[] args) {
		SwingDemo swingDemo = new SwingDemo();
		swingDemo.init();
	}
}
