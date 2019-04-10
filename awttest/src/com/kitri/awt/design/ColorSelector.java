package com.kitri.awt.design;

import java.awt.*;

import javafx.geometry.HorizontalDirection;

public class ColorSelector extends Frame{
	
	Panel p1 = new Panel();
	Panel p11 = new Panel();
	Panel p12 = new Panel();
	Panel p13 = new Panel();
	Panel p2 = new Panel();
	Panel p21 = new Panel();
	
	Label lR = new Label("빨강");
	Label lG = new Label("초록");
	Label lB = new Label("파랑");
	//0~255를 찍고 싶다면 막대 두께 10을 고려하여 0~265로 해야함
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	
	Panel colorP = new Panel();
	
	Label colorL = new Label();
	Button ok = new Button("선택");
	
	public ColorSelector() {
		super("컬러셀렉터");
		
		p1.setLayout(new GridLayout(5, 1, 0, 20));
		p1.add(new Label());
		p1.add(p11);
		p1.add(p12);
		p1.add(p13);
		p11.setLayout(new BorderLayout(10, 0));
		p12.setLayout(new BorderLayout(10, 0));
		p13.setLayout(new BorderLayout(10, 0));
		lR.setBackground(Color.red);
		lG.setBackground(Color.green);
		lB.setBackground(Color.blue);
		p11.add(lR,"West");
		p11.add(sbR,"Center");
		p12.add(lG,"West");
		p12.add(sbG,"Center");
		p13.add(lB,"West");
		p13.add(sbB,"Center");
		
		
		p2.setLayout(new BorderLayout(0, 10));
		p2.add(colorP,"Center");
		p2.add(p21,"South");
		
		p21.setLayout(new BorderLayout(10, 0));
		p21.add(colorL,"Center");
		p21.add(ok,"East");
		colorL.setBackground(new Color(220,220,220));
		
		setLayout(new GridLayout(1, 2, 10, 0));
		add(p1);
		add(p2);
		
		setBounds(300, 200, 500, 500);
		setVisible(true);
		
		int r = sbR.getValue();
		int g = sbR.getValue();
		int b = sbB.getValue();
		colorP.setBackground(new Color(r,g,b));
		colorL.setText("r = "+r+" g = "+g+" b = "+b);
	}
	
	public static void main(String[] args) {
		new ColorSelector();
	}
}
