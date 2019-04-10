package com.kitri.util;


import java.util.Calendar;
import java.util.Date;
public class CalendarTest {
	

	//2019�� 03�� 26�� ���� 1�� 17�� 35��
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int apm = cal.get(Calendar.AM);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println(y+"�� "+zeroPlus(m)+"�� "+zeroPlus(d)+"�� "
				+(apm == 0 ? "���� ":"���� ")+zeroPlus(h)+"�� "
				+zeroPlus(mi)+"�� "+zeroPlus(s)+"�� ");
		
		Date date = new Date();
		System.out.println(date.toString());
	}
	//�ڱⰡ ������ �ڱⰡ �޴°Ŵ� static�ᵵ ��. 
	//static���� �������� �ǵ帮�°��� ������ �����غ�����.
	private static String zeroPlus(int num) {
		return num < 10 ? "0"+num : ""+num;
	}
}
