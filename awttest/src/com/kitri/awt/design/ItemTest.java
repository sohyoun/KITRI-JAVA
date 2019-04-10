package com.kitri.awt.design;

import java.awt.*;

public class ItemTest extends Frame{
	
	Panel pN = new Panel();
	Panel pS = new Panel();
	
	CheckboxGroup cbg = new CheckboxGroup();//라디오버튼 1개만 선택됨
	Checkbox mor = new Checkbox("아침",cbg,true);
	Checkbox aft = new Checkbox("점심",cbg,false);
	Checkbox eve = new Checkbox("저녁",cbg,false);
	
	Checkbox app = new Checkbox("사과",true);//체크박스 다중선택 가능
	Checkbox banana = new Checkbox("바나나",false);
	Checkbox straw = new Checkbox("딸기",false);
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	public ItemTest() {
		super("아이템 테스트!!!");
		
		pN.setLayout(new GridLayout(2,3,10,10));
		pN.add(mor);
		pN.add(aft);
		pN.add(eve);
		
		pN.add(app);
		pN.add(banana);
		pN.add(straw);
		
		pS.setLayout(new BorderLayout(10,0));
		ch.add("아침");
		ch.add("점심");
		ch.add("저녁");
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
