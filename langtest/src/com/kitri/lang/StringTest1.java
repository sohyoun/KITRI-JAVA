package com.kitri.lang;

public class StringTest1 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		if(s1==s2)//문자열 저장소에 S1이 저장됨. 하지만 S2는 문자열저장소에 "java"가 이미 있음으로 거기의 주소에 연결된다. 따라서 같은 것을 참조함으로 같게 나옴.
			System.out.println("s1 s2는 주소값이 같다."); //0
		if(s1==s3)//문자열 저장소에 저장된 "java"를 s1이 참조.따라서 Heap에 저장된 S3,S4와 문자열 저장소에 S1,S2는 공간자체가 다름으로 비교 X
			System.out.println("s1 s3는 주소값이 같다.");//X
		if(s1==s4)
			System.out.println("s1 s4는 주소값이 같다.");//X
		if(s2==s3)
			System.out.println("s2 s3는 주소값이 같다.");//X
		if(s2==s4)
			System.out.println("s2 s4는 주소값이 같다.");//X
		if(s3==s4)//==는 주소값 비교임으로 X S3,S4는 Heap영역/S3의 "java"와 S4의 "java"는 따로 만들어진다.
			System.out.println("s3 s4는 주소값이 같다.");//X
		
		System.out.println("----------------------------------------------");
		//java는 대소문자 가린다.
		if(s1.equals(s2))//원래 Object의 equals는 주소값 비교이지만 String에서 equals를 overriding해놔서 문자열 비교가 된다.
			System.out.println("s1 s2는 문자열값이 같다."); //0
		if(s1.equals(s3))
			System.out.println("s1 s3는 문자열값이 같다.");//0
		if(s1.equals(s4))
			System.out.println("s1 s4는 문자열값이 같다.");//0
		if(s2.equals(s3))
			System.out.println("s2 s3는 문자열값이 같다.");//0
		if(s2.equals(s4))
			System.out.println("s2 s4는 문자열값이 같다.");//0
		if(s3.equals(s4))
			System.out.println("s3 s4는 문자열값이 같다.");//0
	}
}
