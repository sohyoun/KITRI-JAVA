package com.kitri.awt.event;

public class CalculatorService {
	CalculatorController calculatorController;
	private Calculator cc;
	StringBuffer sb1 = new StringBuffer();
	StringBuffer sb2 = new StringBuffer();
	StringBuffer sb3 = new StringBuffer();
	double result=0;

	public CalculatorService(CalculatorController calculatorController) {
		this.calculatorController = calculatorController;
		cc = calculatorController.calculator;
	}

	public void exit() {
		System.exit(0);
	}

	public void classify(int i) {
//         System.out.println(cc.btn[i].getLabel()); //누른 버튼
		if (cc.btn[i].getLabel() == "C") {			// clear
			clear();
		} else if (cc.btn[i].getLabel() == "=") {	// =
			result();
		} else if (isNumber(cc.btn[i].getLabel())) {// 숫자이면
			if (sb1.length() == 0) {
				sb1.append(cc.btn[i].getLabel());
//    			 System.out.println(sb1.length());
//    			 System.out.println(sb1);
    			 cc.numL.setText(sb1.toString());
			} else {
				if (sb2.length() == 0) {
					sb1.append(cc.btn[i].getLabel());
//					System.out.println(sb1);
					cc.numL.setText(sb1.toString());
				} else {
					sb3.append(cc.btn[i].getLabel());
//					System.out.println(sb3);
					cc.numL.setText(sb3.toString());
				}
			}
		} else { 									// 사칙연산버튼
			cc.openL.setText(cc.btn[i].getLabel());
			if (sb1.length() == 0) {
				sb1.append(0);
				sb2.replace(0, sb2.length(), cc.btn[i].getLabel());
//				System.out.println(sb2);
			} else {
				sb2.replace(0, sb2.length(), cc.btn[i].getLabel());
//				System.out.println(sb2);
			}
		}

	}

	private void result() {
//		System.out.println(sb1.toString()+sb2.toString()+sb3.toString());
		sb1.reverse();
		sb3.reverse();
		int num1 = 0;
		for(int i=0; i<sb1.length(); i++) {
			num1 += (sb1.toString().charAt(i)-48)*(Math.pow(10, i));
		}
		int num3 = 0;
		for(int i=0; i<sb3.length(); i++) {
			num3 += (sb3.toString().charAt(i)-48)*(Math.pow(10, i));
		}
//		System.out.println("num1 === "+num1);
//		System.out.println("num3 === "+num3);
		if(sb2.toString().equals("+")) {
			result = num1+num3;
		} else if(sb2.toString().equals("-")) {
			result = num1-num3;
		} else if(sb2.toString().equals("*")) {
			result = num1*num3;
		} else if(sb2.toString().equals("/")){
			result = (double)num1/(double)num3;
		} else {
			result = num1;
		}
//		System.out.println(result);
		cc.numL.setText(""+result);
//		sb1을 result 로 sb2,sb3 초기화
//		소숫점을 어떻게 처리해야할까 >> 일단 강제 int
		sb1.replace(0, sb1.length(), ""+(int)result);
		sb2.delete(0, sb2.length());
		sb3.delete(0, sb3.length());
		
	}

	private void clear() {
		cc.numL.setText("");
		cc.openL.setText("");
		sb1.delete(0, sb1.capacity());
		sb2.delete(0, sb2.capacity());
		sb3.delete(0, sb3.capacity());
//		System.out.println(sb1);
//		System.out.println(sb2);
//		System.out.println(sb3);
//		System.out.println("다지웠댜");
	}

	private boolean isNumber(String str) { // return type이 boolean이면 is를 붙인다.
		boolean flag = false;
		int y = str.charAt(0) - 48;
		if (y >= 0 && y <= 9) {
			flag = true;
		}
		return flag;
	}
}
