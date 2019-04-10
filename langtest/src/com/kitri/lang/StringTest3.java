package com.kitri.lang;

public class StringTest3 {
	//String method
	public static void main(String[] args) {
		//charAt(int index) : index번호 순서의 문자를 가져와라.
		String str = "hello java !!!";
		char c = str.charAt(4);
		System.out.println("c == "+ c);
		
		//'0'이 아스키코드값 48
		str = "123";
		int x = str.charAt(0) - 48; //'1'의 아스키코드값 49 - 48 = 1
		System.out.println("x === " + x);//1
		
		str = "1a1";
		int len = str.length();
		System.out.println("length ==" + len);
		String result = "숫자입니다.";
		for(int i=0; i<len; i++) {
			int y = str.charAt(i)-48;
			if (y>9 || y<0) {
				result = "숫자가 아닙니다.";
				break;
			}
		}
		System.out.println(str+"은 "+result);
		
		//concat(String str)
		String str1 = "hello ";
		String str2 = "java";
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));//문자열 더함. 잘 쓰지X
		
		//startWith(String prefix) ~로 시작한다. (대소문자 가림,문자열 가능)
		//endsWith(String prefix) ~로 끝난다.
		str = "hello java !!!";
		if(str.startsWith("h"))
			System.out.println(str+"은 h로 시작한다.");
		if(str.endsWith("!!"))
			System.out.println(str+"은 !!로 끝난다.");
		
		//toUpperCase, toLowerCase
		String s1 = "java";
		String s2 = "JavA";
		System.out.println("s1.toUpperCase()==" + s1.toUpperCase());
		System.out.println("s2.toLowerCase()==" + s2.toLowerCase());
		if(s1.equals(s2))
			System.out.println(s1+"과 "+s2+"는 같은 문자열이다.");
		else
			System.out.println(s1+"과 "+s2+"는 다른 문자열이다.");
		//equalsIgnoreCase(String anotherString)
		if (s1.toUpperCase().equals(s2.toUpperCase()))
			System.out.println(s1+"과 "+s2+"는 대소문자 구분없이 같은 문자열이다.");
		else
			System.out.println(s1+"과 "+s2+"는 대소문자 구분없이 다른 문자열이다.");
		if (s1.equalsIgnoreCase(s2))
			System.out.println(s1+"과 "+s2+"는 대소문자 구분없이 같은 문자열이다.");
		else
			System.out.println(s1+"과 "+s2+"는 대소문자 구분없이 다른 문자열이다.");
		
		
	}
}
