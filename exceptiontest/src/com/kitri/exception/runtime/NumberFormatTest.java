package com.kitri.exception.runtime;

public class NumberFormatTest {
	public static void main(String[] args) {
		String s ="123 ";
//		int x = Integer.parseInt(s);
//		System.out.println(x+100);
		
//		try catch 이용 : 에러가 나면 대처하는 것임으로 RuntimeException에선 좋지 않음
//		try {
//			int x = Integer.parseInt(s);
//			System.out.println(x+100);
//		} catch(NumberFormatException e) {
//			System.out.println("숫자가 아닙니다.");
//		}
		if(isNumber(s)) {
			int x = Integer.parseInt(s);
			System.out.println(x+100);
		} else {
			System.out.println("숫자가 아닙니다.");
		}
		
	}
	private static boolean isNumber(String str) {
		boolean flag = true;
		int len = str.length();
		for(int i=0; i<len; i++) {
			int y = str.charAt(i)-48;
			if (y>9 || y<0) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
