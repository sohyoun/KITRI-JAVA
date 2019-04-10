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
//		abstract class여서 subclass봤더니
//		DateFormat있음
//		DateFormat도 abstract여서 SimpleDateFormat사용.
//		날짜 형식을 format (아직 오늘 시간 안넣음)
		Format f = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
//		오늘 시간 넣기위한 method
//		SimpleDateFormat에 없어서 DateFormat의 method format(Date date)사용
//		상위 클래스의 method니 사용 가능
		String today = f.format(date);
		System.out.println(today);
		
		
		
	}
}
