package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class StringTest2{

	public static void main(String[] args) throws UnsupportedEncodingException {
		//null은 String이 heap에 아예안올라온 상태
		//String str = null;
		//System.out.println("문자열 길이 : "+str.length());//오류 : 주소가없는데 어떻게 할 것이냐
		//null은 주소가 없어서 참조할 수가 없다.
		
		//String()
		//이건 String은 있는데 빈값인것
		String str1 = new String();
		System.out.println("문자열 길이 : "+str1.length());
		
		//String(byte[] bytes)
		//byte b[] = {97,98,99,100}; // 아스키코드 값 abcd
		byte b[] = {-66,-56,-77,-25,-57,-49,-68,-68,-65,-28,46};// 아스키코드 값 안녕하세요.
		String str2 = new String(b);//String 값으로 바꾸면 아스키코드 값 출력됨.
		//String str2 = new String(b,"euc-kr"); // 같음. default 값이 euc-kr.
		System.out.println("str2 == " + str2);
		
		//String(byte[] bytes, Charset carset)
		//euc-kr : 일반적 한글은 완성형 한글로 나옴. 2byte 로 처리
		//utf-8은 전세계모든 글자를 처리 가능. 대신 3byte로 처리. 글자를 그린다.
		//한글 깨질 때 꼭 기억하기! 
		byte b2[] = {-20,-107,-120,-21,-123,-107,-19,-107,-104,-20,-124,-72,-20,-102,-108,46};// 아스키코드 값 안녕하세요.
		String str3 = new String(b2,"utf-8");//String 값으로 바꾸면 아스키코드 값 출력됨.
		System.out.println("str3 == " + str3);
		
		//String(byte[] bytes, int offset, int length)
		byte b3[] = {97,98,99,100,101,102,103,104};
		String str4 = new String(b3,2,4);//offset : 시작점. length : 길이
		System.out.println("str4 == " + str4);
		
		//한글, 중국어, 일본어 등은 2byte를 차지하고 깨지기 때문에 byte보다 char로 하는 것이 좋음
		//String(char[] value)
		char c[] = {'안','녕','c','d','e','f'};
		String str5 = new String(c);
		System.out.println("str5 ==" + str5);
		
		//String(char[] value, int offset, int count)
		String str6 = new String(c,2,4);
		System.out.println("str6 ==" + str6);
		
		

	}
}
