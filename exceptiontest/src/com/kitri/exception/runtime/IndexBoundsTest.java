package com.kitri.exception.runtime;

public class IndexBoundsTest {
	public static void main(String[] args) {
		String s[] = {"1","2","3","4"};
//		IndexOutOfBoundsException : bounds가 넘어가서 생기는 exception
//		for(int i=0;i<=4;i++) {
//			System.out.println(s[i]);
//		}
		
		int len = s.length;
		for (int i = 0; i < len; i++) {
			System.out.println(s[i]);
		}
		
		String str = "hello";
		int len2 = str.length();
		for (int i = 0; i < len2; i++) {
			System.out.println(str.charAt(i));
		}
	}
}
