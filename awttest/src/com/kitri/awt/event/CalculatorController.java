package com.kitri.awt.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController implements ActionListener {
	Calculator calculator;
	CalculatorService calculatorService;

	public CalculatorController(Calculator calculator) {
		this.calculator = calculator;
		calculatorService = new CalculatorService(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();

//           System.out.println(ob);
		if (ob == calculator.exit) {
			calculatorService.exit();
		} else {
			for (int i = 0; i < calculator.len; i++) {
				if (ob == calculator.btn[i]) {// 7
					calculatorService.classify(i);
					break;
				}
			}
		}
	}
}