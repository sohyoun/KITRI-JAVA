package com.kitri.util;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
	public static void main(String[] args) {
//		2019.03.26 14:25:30
		Date date = new Date();
		System.out.println(date);
		
//		java.text > Format Class
//		abstract class���� subclass�ô���
//		DateFormat����
//		DateFormat�� abstract���� SimpleDateFormat���.
//		��¥ ������ format (���� ���� �ð� �ȳ���)
		Format f = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
//		���� �ð� �ֱ����� method
//		SimpleDateFormat�� ��� DateFormat�� method format(Date date)���
//		���� Ŭ������ method�� ��� ����
		String today = f.format(date);
		System.out.println(today);
		
		
		
	}
}
