package com.kitri.awt.design;

import java.awt.*;
//Window> preference> java >organize importes에서 
//number to imports를 3으로 바꿈\
//같은 package의 class3개 이상 쓰면 *로 바뀜
//cntl+shift+o : 알아서 import해줌

/*
 1. Frame 상속
 2. 선언부에 필요한 객체 생성
 3. 배치부에서 design (Component 배치)
 **항상 작업은 작은 것 >> 큰 것 순으로
 */
public class DesignTest extends Frame{
//		선언부
	Panel pN = new Panel();
	Panel pS = new Panel(); //panel은 보통 default로 만듬
	
	Label l = new Label("입력", Label.CENTER);//label은 한꺼번에 만듦
	TextField tf = new TextField();
	Button send = new Button("전송");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();//Choice는 default 생성자 밖에 없음
	Button exit = new Button("종료");
	
	public DesignTest() {
		super("Design Test !!!");
//		배치부
//		panel의 default는 flowlayout
		setLayout(new BorderLayout(0,10));
//		flowlayout은 default크기밖에 안됨으로 borderlayout써야함(가운데가 가장 큼)
//		LayoutManager lm = new BorderLayout();
//		pN.setLayout(lm);
		pN.setLayout(new BorderLayout(10,0));//익명으로 객체 생성/생성자 BorderLayout(int hgap,int vgap) : 사이사이 공백 여기선 hgap만 됨
		l.setBackground(new Color(150,210,210));//배경색
//		l.setForeground(new Color(100,30,70));//글자색(생성자)
		l.setForeground(Color.magenta);//글자색(static field 상수)
		Font f = new Font("굴림",Font.BOLD, 20);
		l.setFont(f);
		pN.add(l,"West");
		pN.add(tf,"Center");
		send.setFont(f);
		pN.add(send,"East");
		
//		pS의 두 버튼은 크기 같음으로 Gridelayout
		pS.setLayout(new GridLayout(1, 2, 10, 0));
//		choice에 값 넣기
		ch.add("서울");
		ch.add("경기,인천");
		ch.add("강원");
		ch.add("충청");
		
		pS.add(ch);
		pS.add(exit);
		exit.setFont(f);
		//frame의 default는 borderlayout
		
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH);
		
		//항상 마지막이 setVisible!
//		setSize(300, 500);
//		setLocation(300, 200);
		setBounds(300, 200, 300, 500);//setSize와 setLocation합친것
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new DesignTest(); //익명객체생성(해당 클래스의 메소드 등을 추가로 호출 할 필요가 없기 때문에 가능)
		
	}
}
