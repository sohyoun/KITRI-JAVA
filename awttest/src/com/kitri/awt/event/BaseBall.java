package com.kitri.awt.event;

import java.awt.*;

public class BaseBall extends Frame{
	
	Panel pC = new Panel();
	Panel pCS = new Panel();
	Panel pE = new Panel();
	
	TextArea ta = new TextArea();
	Label l = new Label("입력",Label.CENTER);
	TextField tf = new TextField();
	
	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종료");
	
	BaseBallController baseBallController;
	FontColorChooser fontColorChooser = new FontColorChooser();//BaseBall과 FontColorChooser는 has a 관계
	
	
	public BaseBall() {
		
		
		pCS.setLayout(new BorderLayout(10,0));
		pCS.add(l,"West");
		pCS.add(tf,"Center");
		
		pC.setLayout(new BorderLayout(0, 10));
		pC.add(ta,"Center");
		ta.setEditable(false);
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
		
		baseBallController = new BaseBallController(this);
		
		
//		BaseBall창 이벤트 등록	
		newG.addActionListener(baseBallController);
		clear.addActionListener(baseBallController);
		dap.addActionListener(baseBallController);
		fontC.addActionListener(baseBallController);
		exit.addActionListener(baseBallController);
		tf.addActionListener(baseBallController);
		this.addWindowListener(baseBallController);
		
//		FontColorChooser창 이벤트 등록
		fontColorChooser.sbR.addAdjustmentListener(baseBallController);
		fontColorChooser.sbG.addAdjustmentListener(baseBallController);
		fontColorChooser.sbB.addAdjustmentListener(baseBallController);
		
		fontColorChooser.ok.addActionListener(baseBallController);
	}
	
	public static void main(String[] args) {
		new BaseBall();
	}

}
