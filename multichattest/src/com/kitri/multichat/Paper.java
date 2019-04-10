package com.kitri.multichat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Paper extends JFrame {

	private JPanel contentPane;
	private JTextField from;
	private JTextField to;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paper frame = new Paper();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Paper() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea letter = new JTextArea();
		contentPane.add(letter, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("From : ");
		panel.add(lblNewLabel);
		
		from = new JTextField();
		panel.add(from);
		from.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("To : ");
		panel.add(lblNewLabel_1);
		
		to = new JTextField();
		panel.add(to);
		to.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton send = new JButton("\uBCF4\uB0B4\uAE30");
		panel_1.add(send);
		
		JButton cancel = new JButton("\uCDE8\uC18C");
		panel_1.add(cancel);
	}

}
