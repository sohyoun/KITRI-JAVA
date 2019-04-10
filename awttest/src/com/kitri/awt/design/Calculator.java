package com.kitri.awt.design;

import java.awt.*;

public class Calculator extends Frame{
	
	Panel pN = new Panel();
	Panel pC= new Panel();
	
	Label numL = new Label();
	Label openL = new Label();
		
	String bt[] = {"7","8","9","+","4","5","6","-","1","2","3","*","0","C","=","/"};
	
	Button exit = new Button("종료");
	
	public Calculator() {
		super("계산기");
		
		pN.setLayout(new BorderLayout(5, 0));
		pN.add(numL,"Center");
		numL.setBackground(Color.black);
		pN.add(openL,"East");
		openL.setBackground(Color.blue);
		
		
		pC.setLayout(new GridLayout(4, 4, 5, 5));
		for(int i=0; i<bt.length;i++) {
			pC.add(new Button(bt[i]));
		}
		
		setLayout(new BorderLayout(0, 10));
		add(pN,"North");
		add(pC,"Center");
		add(exit,"South");
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Calculator();
	}
}
