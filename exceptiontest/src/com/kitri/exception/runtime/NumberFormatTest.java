package com.kitri.exception.runtime;

public class NumberFormatTest {
	public static void main(String[] args) {
		String s ="123 ";
//		int x = Integer.parseInt(s);
//		System.out.println(x+100);
		
//		try catch �̿� : ������ ���� ��ó�ϴ� �������� RuntimeException���� ���� ����
//		try {
//			int x = Integer.parseInt(s);
//			System.out.println(x+100);
//		} catch(NumberFormatException e) {
//			System.out.println("���ڰ� �ƴմϴ�.");
//		}
		if(isNumber(s)) {
			int x = Integer.parseInt(s);
			System.out.println(x+100);
		} else {
			System.out.println("���ڰ� �ƴմϴ�.");
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
