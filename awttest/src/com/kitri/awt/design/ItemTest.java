package com.kitri.awt.design;

import java.awt.*;

public class ItemTest extends Frame{
	
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	CheckboxGroup cbg = new CheckboxGroup();//������ư 1���� ���õ�
	Checkbox mor = new Checkbox("��ħ",cbg,true);
	Checkbox aft = new Checkbox("����",cbg,false);
	Checkbox eve = new Checkbox("����",cbg,false);
	
	Checkbox app = new Checkbox("���",true);//üũ�ڽ� ���߼��� ����
	Checkbox banana = new Checkbox("�ٳ���",false);
	Checkbox straw = new Checkbox("����",false);
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	public ItemTest() {
		super("������ �׽�Ʈ!!!");
		
		pN.setLayout(new GridLayout(2,3,10,10));
		pN.add(mor);
		pN.add(aft);
		pN.add(eve);
		
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		pS.setLayout(new BorderLayout(10,0));
		ch.add("��ħ");
		ch.add("����");
		ch.add("����");
		pS.add(ch,"Center");
		pS.add(exit,"East");
		
		setLayout(new BorderLayout(0,10));
		
		add(pN,"North");
		add(ta,"Center");
		add(pS,"South");
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ItemTest();
	}
}
