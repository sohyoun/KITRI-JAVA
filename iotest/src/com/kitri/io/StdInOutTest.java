package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {
	public static void main(String[] args) {
//		System class의 static field인 out의 Type인 PrintStream의 prinln method를 쓴 것
//		System.out.println();
		
//		int x = System.in.read(); // 에러 : IOException가보니 nonRuntimeException임.
		try {
//			System.out.print("입력 : ");
//			int x = System.in.read();
//			System.out.println("1. x == " + x);//첫번째 숫자의 아스키 코드 값 받아옴
//			System.out.println("1. x == " + (char)x);
			
			System.out.println("입력2 : ");
			byte b[] = new byte[100];
			int x = System.in.read(b);
			System.out.println("2. x == " + x);//입력한 문자들의 총 byte와 엔터\n +2 byte
			int len = b.length;
			for (int i = 0; i < len; i++) {
				System.out.println(b[i]);//입력한 문자들의 아스키코드값
			}
			String s= new String(b,0,x-2);//byte배열을 String값으로 변환(100짜리를 문자길이만큼으로
			System.out.println("s == "+s);//입력한 문자 출력됨 >> 100byte 넘는 문자는 안됨
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
