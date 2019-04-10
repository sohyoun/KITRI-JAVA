package com.kitri.multichat;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ReName extends JFrame {

	private JPanel contentPane;
	private JTextField oldname;
	private JTextField newname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReName frame = new ReName();
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
	public ReName() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Old Name : ");
		panel.add(lblNewLabel);
		
		oldname = new JTextField();
		panel.add(oldname);
		oldname.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("New Name : ");
		panel.add(lblNewLabel_1);
		
		newname = new JTextField();
		panel.add(newname);
		newname.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JButton ok = new JButton("\uBCC0\uACBD");
		panel_1.add(ok);
		
		JButton cancel = new JButton("\uCDE8\uC18C");
		panel_1.add(cancel);
	}

}
