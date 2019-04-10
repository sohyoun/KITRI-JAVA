package com.kitri.awt.event;

import java.awt.Color;
import java.util.Random;

public class BaseBallService {
	
	BaseBallController baseBallController;
	private BaseBall bb;
	private FontColorChooser fcc;
	
	private int my[];
	private int com[];
	int gameLength;
	Random random = new Random();
	int count = 0;
	int r,g,b;

	public BaseBallService(BaseBallController baseBallController) {
		this.baseBallController = baseBallController;
		bb = baseBallController.baseBall;
		fcc = bb.fontColorChooser;
		gameLength = 3;
		my = new int[gameLength];
		com = new int[gameLength];
		newGame();
	}

	public void newGame() {
		com[0] = random.nextInt(9)+1;
		do {
			com[1] =  random.nextInt(10);
		}while (com[0] == com[1]);
		do {
			com[2] = random.nextInt(10);
		}while (com[0] == com[2] || com[1] == com[2]);	
		bb.tf.setEnabled(true);
		clear();
		viewResult("���ο� ������ �����մϴ�.");
		count=0;
		System.out.println("���� : " + com[0] + com[1] + com[2]);
		
	}

	public void clear() {
		bb.ta.setText(" ");
		
	}

	public void showDap() {
		viewResult("������"+com[0]+com[1]+com[2]+"�Դϴ�.");
		//���� ������ �� �� ���� �� �ְ� setText�� �ƴ� append
		viewResult("������ �Ǵ� ���Ḧ ��������!!");
		bb.tf.setEnabled(false);
	}

	public void fontColorChange() {
		fcc.setVisible(true);
		changeColor();
		
	}

	public void exit() {
		System.exit(0);
		
	}

	public void game() {
//		int count =0; //count�� ���������� �ؾ��Ѵ�.
		int strike =0;
		int ball =0;
//		�����Է�
		String myNumStr = bb.tf.getText().trim();//textfield���� �� text �޾ƿ�
		bb.tf.setText("");
		
		if(myNumStr.length() != gameLength) {
			viewResult("3�ڸ� ���ڸ� �Է��ϼ���!!!");
			return;
		}
		
		if(!isNumber(myNumStr)) {//���ڰ� �ƴ϶��
			viewResult("���ڸ� �Է��ϼ���!!!");
			return;
		}
		
		for(int i=0;i<gameLength;i++) {
			my[i] = myNumStr.charAt(i) -48; // char�� �������� �ƽ�Ű�ڵ尪 �����´�. ���� -48�ؾ���
		}//������ 3�ڸ� ����� ������ NumberBaseBall���� �� ����� �� ����.
		
//		���ڿ� �ڸ��� ��
//		328		149
		for (int m = 0; m < gameLength; m++) {
			for (int c = 0; c < gameLength; c++) {
				if(my[m] == com[c]) { //���� ���ڶ��..
					if(m == c)//�ڸ��� ���ٸ�...
						strike++;
					else
						ball++;
				}
			}
		}
		count++;
		
//		���
		if(strike != gameLength) { //3�� �ƴ϶��
			viewResult(count + ". " + myNumStr + "�� " + strike + "��Ʈ����ũ " + ball + "���Դϴ�.");
		} else {
			viewResult(myNumStr + "�� " + count + "������ �����Դϴ�.");
			viewResult("������ �Ǵ� ���Ḧ ��������!!");
			bb.tf.setEnabled(false);//�������µ��� ��� ��ġ���� setEnabled
		}
	}
	
	private void viewResult(String msg) {
		bb.ta.append(msg+"\n");
	}
	
	private boolean isNumber(String str) { //return type�� boolean�̸� is�� ���δ�.
		boolean flag = true;
		for(int i=0; i<gameLength; i++) {
			int y = str.charAt(i)-48;
			if (y>9 || y<0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	public void changeColor() {
		r = fcc.sbR.getValue();
		g = fcc.sbG.getValue();
		b = fcc.sbB.getValue();
		fcc.colorP.setBackground(new Color(r,g,b));
		fcc.colorL.setText("r = "+r+" g = "+g+" b = "+b);
	}

	public void selectColor() {
		bb.ta.setForeground(new Color(r,g,b));
		fcc.setVisible(false);
	}
}
