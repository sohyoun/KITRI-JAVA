package com.kitri.awt.event;

import java.awt.Checkbox;
import java.awt.event.*;

public class ItemLogic implements ItemListener, ActionListener {

	ItemTest itemTest;
	
	public ItemLogic(ItemTest itemTest) {
		this.itemTest = itemTest;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource();
		if(ob == itemTest.ch) {
			String str = itemTest.ch.getSelectedItem();
			if(str.equals("��ħ")) {
				itemTest.mor.setState(true);
			} else if(str.equals("����")) {
				itemTest.aft.setState(true);
			} else {
				itemTest.eve.setState(true);
			}
		}
		Checkbox sel = itemTest.cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		itemTest.ta.setText("--- " + selStr + " ---\n");
		itemTest.ta.append("1. ��� : " + eat(itemTest.app.getState()) + "\n");
		itemTest.ta.append("2. �ٳ��� : " + eat(itemTest.banana.getState()) + "\n");
		itemTest.ta.append("3. ���� : " + eat(itemTest.straw.getState()) + "\n");
		itemTest.ch.select(selStr);
	}
	
	private String eat(boolean flag) {
		return flag ? "�Ծ���." : "�ȸԾ���.";
	}
	
}
