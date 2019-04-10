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
		viewResult("새로운 게임을 시작합니다.");
		count=0;
		System.out.println("컴터 : " + com[0] + com[1] + com[2]);
		
	}

	public void clear() {
		bb.ta.setText(" ");
		
	}

	public void showDap() {
		viewResult("정답은"+com[0]+com[1]+com[2]+"입니다.");
		//내가 기존에 쓴 답 비교할 수 있게 setText가 아닌 append
		viewResult("새게임 또는 종료를 누르세요!!");
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
//		int count =0; //count는 전역변수로 해야한다.
		int strike =0;
		int ball =0;
//		숫자입력
		String myNumStr = bb.tf.getText().trim();//textfield에서 쓴 text 받아옴
		bb.tf.setText("");
		
		if(myNumStr.length() != gameLength) {
			viewResult("3자리 숫자를 입력하세요!!!");
			return;
		}
		
		if(!isNumber(myNumStr)) {//숫자가 아니라면
			viewResult("숫자만 입력하세요!!!");
			return;
		}
		
		for(int i=0;i<gameLength;i++) {
			my[i] = myNumStr.charAt(i) -48; // char을 얻어옴으로 아스키코드값 가져온다. 따라서 -48해야함
		}//무조건 3자리 수라면 저번에 NumberBaseBall에서 쓴 방법이 더 좋다.
		
//		숫자와 자리수 비교
//		328		149
		for (int m = 0; m < gameLength; m++) {
			for (int c = 0; c < gameLength; c++) {
				if(my[m] == com[c]) { //같은 숫자라면..
					if(m == c)//자리수 같다면...
						strike++;
					else
						ball++;
				}
			}
		}
		count++;
		
//		결과
		if(strike != gameLength) { //3이 아니라면
			viewResult(count + ". " + myNumStr + "은 " + strike + "스트라이크 " + ball + "볼입니다.");
		} else {
			viewResult(myNumStr + "을 " + count + "번만에 정답입니다.");
			viewResult("새게임 또는 종료를 누르세요!!");
			bb.tf.setEnabled(false);//정답맞췄는데도 계속 못치도록 setEnabled
		}
	}
	
	private void viewResult(String msg) {
		bb.ta.append(msg+"\n");
	}
	
	private boolean isNumber(String str) { //return type이 boolean이면 is를 붙인다.
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
