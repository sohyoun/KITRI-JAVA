package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListTest extends Frame implements ActionListener{
	
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	List listL = new List();
	List listR = new List(0, true);
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");	
		
	public ListTest() {
		super("리스트 테스트");
		
		p1.setLayout(new BorderLayout(0, 10));
		p1.add(listL,"Center");
		p1.add(tfL,"South");
		
		p2.setLayout(new GridLayout(6, 1, 0, 20));
		p2.add(new Label(""));
		p2.add(btR);
		p2.add(btRAll);
		p2.add(btL);
		p2.add(btLAll);
		
		p3.setLayout(new BorderLayout(0, 5));
		p3.add(listR,"Center");
		p3.add(tfR,"South");
		
		setLayout(new GridLayout(1, 3, 10, 0));
		add(p1);
		add(p2);
		add(p3);
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		
		tfL.addActionListener(this);
		tfR.addActionListener(this);
		btL.addActionListener(this);
		btLAll.addActionListener(this);
		btR.addActionListener(this);
		btRAll.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new ListTest();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == tfL) {
//			1.tfL의 값 get(유효성검사)
			String tmp = tfL.getText().trim();
			tfL.setText("");
			if (tmp.isEmpty())
				return;
//			2.listL에 추가
			listL.add(tmp);
			
		} else if(ob == tfR) {
//			1.tfR의 값 get
			String tmp = tfR.getText().trim();
			tfR.setText("");
			if (tmp.isEmpty())
				return;
//			2.listR에 추가 
			listR.add(tmp);
		} else if(ob == btL) {
			String tmp = listR.getSelectedItem();
			if (tmp == null) 
				return;
			listL.add(tmp);
			listR.remove(tmp);
		} else if(ob == btLAll) {
//			1.listR에서 선택한 문자열 get(다중 가능)
			String tmp[] = listR.getSelectedItems();
//			2.listL에 문자열들 추가
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listL.add(tmp[i]);
			}
//			3.listR에 문자열들 삭제
			for (int i = 0; i < len; i++) {
				listR.remove(tmp[i]);
			}
			
//			4.아무것도 선택안하고 버튼 누를 경우 다 보냄.다삭제
//			if(tmp == null) {
//				String tmpAll[] = listR.getItems();
//				int lenAll = tmpAll.length;
//				for (int i = 0; i < lenAll; i++) {
//					listL.add(tmpAll[i]);
//				}
//				listR.removeAll();
//			}
			
			
		} else if(ob == btR) {
//			1.listL에서 선택한 문자열 get(유효성검사)
			String tmp = listL.getSelectedItem();
			if (tmp==null) {
				return;
			}
//			2.1의 값을 listR에 추가.
			listR.add(tmp);
//			3.1의 값을 listL에서 제거.
			listL.remove(tmp);
		} else if(ob == btRAll) {
//			1.listL의 값을 모두 get
			String tmp[] = listL.getItems();
//			2.1의 값을 listR에 모두 추가
			int len = tmp.length;
			for (int i = 0; i < len; i++) {
				listR.add(tmp[i]);
				
			}
//			3.1의 값을 listL에서 모두 제거
//			for (int i=len-1;i>=0;i--) {//밑에서 부터 지워야함.(위부터 하면 에러)
//				listL.remove(i);
//			}
			listL.removeAll();//간단히 removeAll 써도 됨
		} 		
	}
}
