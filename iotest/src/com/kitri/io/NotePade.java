package com.kitri.io;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class NotePade extends JFrame implements ActionListener{

	private JPanel contentPane;
	
	JMenuBar mb = new JMenuBar();
	JMenu file = new JMenu("\uD30C\uC77C");
	JMenuItem open = new JMenuItem("\uC5F4\uAE30");
	JMenuItem save = new JMenuItem("\uC800\uC7A5");
	JMenuItem exit = new JMenuItem("\uC885\uB8CC");
	JMenu help = new JMenu("\uB3C4\uC6C0\uB9D0");
	
	JTextArea ta = new JTextArea();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NotePade frame = new NotePade();
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
	public NotePade() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		setJMenuBar(mb);
		
		mb.add(file);
		mb.add(help);
	
		file.add(open);
		file.add(save);
		file.add(exit);
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		contentPane.add(ta, BorderLayout.CENTER);
		
		open.addActionListener(this);
		save.addActionListener(this);
		exit.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == open) {
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(this);
			
			BufferedReader fin = null;
//			fin = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fin)))));
		} else if (ob == save) {
			JFileChooser jfc = new JFileChooser();
			jfc.showSaveDialog(this);
		} else if(ob ==exit) {
			
		}
		
	}
	

}
