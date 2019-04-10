package com.kitri.test;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class View1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public View1() {
		setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Administrator\\Desktop\\0001336415_001_20190325135203638.jpg"));
		add(btnNewButton, BorderLayout.CENTER);
		
		JTextArea textArea = new JTextArea();
		textArea.setText("\uACBD\uBCF5\uAD6D \uBD04");
		textArea.setBackground(Color.PINK);
		add(textArea, BorderLayout.SOUTH);

	}

}
