package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {
	public static void main(String[] args) {
		//StringTokenizer(String str) : str 문자열 자름 
		//StringTolenizer는 문자열을 자르는 것이라 default값없음.
		String str = "hello java !!!";
		StringTokenizer st = new StringTokenizer(str);
				
		//method
		//countTokens(): Token갯수 (default가 공백)
		int cnt = st.countTokens();
		System.out.println(cnt);//3
				
		//hasMoreTokens : 다음 토큰있느냐? (boolean)
		//nextToken : 다음 토큰을 불러옴.
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//프로토콜 : 서버와 사용자의 약속 ex)https://
		str = "TO|안효인|안녕하세요 오늘 뭐해요???";
		StringTokenizer st2 = new StringTokenizer(str,"|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		System.out.println("기능 : "+ protocol);
		System.out.println("누구에게 : "+ to);
		System.out.println("보내는 메세지 : " + msg);
	
		System.out.println(UUID.randomUUID());
	}
}
