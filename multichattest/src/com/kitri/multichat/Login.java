package com.kitri.multichat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("IP : ");
		lblId.setBounds(117, 64, 57, 15);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(205, 61, 116, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\uB300\uD654\uBA85 : ");
		lblNewLabel.setBounds(117, 112, 57, 15);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBounds(205, 109, 116, 21);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton ok = new JButton("\uD655\uC778");
		ok.setBounds(117, 176, 97, 23);
		contentPane.add(ok);
		
		JButton cancel = new JButton("\uCDE8\uC18C");
		cancel.setBounds(224, 176, 97, 23);
		contentPane.add(cancel);
	}
}
