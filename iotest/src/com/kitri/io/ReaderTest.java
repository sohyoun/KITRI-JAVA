package com.kitri.io;

import java.io.*;

public class ReaderTest {
	public static void main(String[] args) {
		Reader in = null;
	try {//~Reader : Character Stream (byte가 아닌 문자)
			in = new InputStreamReader(System.in);//콘솔창에서 읽어올 때 : System.in
			char c[] = new char[100];
			System.out.println("입력 : ");
			int x = in.read(c);
			System.out.println("x === "+ x);//x==문자 수 +\r\n (원래 enter는 \r\n)
			String str = new String(c,0,x-2);//그냥 c 하면 입력한 문자+나머지 칸들 총 100칸 출력됨. 따라서 0~x-2까지만 출력하기
			System.out.println(str);
			
			int len = c.length;
			for (int i = 0; i < len; i++) {
				System.out.println(c[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
