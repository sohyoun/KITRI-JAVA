package com.kitri.util;


import java.util.Calendar;
import java.util.Date;
public class CalendarTest {
	

	//2019년 03월 26일 오후 1시 17분 35초
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH)+1;
		int d = cal.get(Calendar.DATE);
		int apm = cal.get(Calendar.AM);
		int h = cal.get(Calendar.HOUR);
		int mi = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);
		System.out.println(y+"년 "+zeroPlus(m)+"월 "+zeroPlus(d)+"일 "
				+(apm == 0 ? "오전 ":"오후 ")+zeroPlus(h)+"시 "
				+zeroPlus(mi)+"분 "+zeroPlus(s)+"초 ");
		
		Date date = new Date();
		System.out.println(date.toString());
	}
	//자기가 보내서 자기가 받는거는 static써도 됨. 
	//static에서 전역변수 건드리는것이 있으면 생각해봐야함.
	private static String zeroPlus(int num) {
		return num < 10 ? "0"+num : ""+num;
	}
}
