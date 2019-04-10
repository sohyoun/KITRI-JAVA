package com.kitri.awt.design;

import java.awt.*;

public class BaseBall extends Frame{
	
	Panel pC = new Panel();
	Panel pCS = new Panel();
	Panel pE = new Panel();
	
	TextArea ta = new TextArea();
	Label l = new Label("�Է�",Label.CENTER);
	TextField tf = new TextField();
	
	Button newG = new Button("������");
	Button clear = new Button("�����");
	Button dap = new Button("����");
	Button fontC = new Button("���ڻ�");
	Button exit = new Button("����");
	
	public BaseBall() {
		
		
		pCS.setLayout(new BorderLayout(10,0));
		pCS.add(l,"West");
		pCS.add(tf,"Center");
		
		pC.setLayout(new BorderLayout(0, 10));
		pC.add(ta,"Center");
		pC.add(pCS,"South");
		
		
		pE.setLayout(new GridLayout(5, 1, 0, 10));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);
		
		setLayout(new BorderLayout(10, 0));
		add(pC,"Center");
		add(pE,"East");
		
		setBounds(300, 200, 500, 400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new BaseBall();
	}

}
