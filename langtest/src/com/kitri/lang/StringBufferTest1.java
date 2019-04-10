package com.kitri.lang;

public class StringBufferTest1 {
	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer();//빈 초기 크기 16개의 임시저장공간생김
		int cap = sb1.capacity(); // 초기 크기 구하는 method
		//length() : 문자열의 수 구하는 method
		System.out.println("초기 크기 : " + cap + "\t문자열 수 : " + sb1.length());
		
		//StringBuffer(int capacity) : 자기가 공간크기 지정 가능
		StringBuffer sb2 = new StringBuffer(8);//보통 8의 배수로 생성(초기 크기 : 8)
		StringBuffer sb3 = new StringBuffer("hello ");//hello 하고 16개의 빈 공간 생김(초기 크기 : 22)
		int cap3 = sb3.capacity();
		System.out.println("크기 : " + cap3 + "\t문자열 수 : " + sb3.length());
		//String은 한번 만들어 지면 불변이어서 concat해도 s 다시 찍으면 hello만 나옴.
		String s = "hello ";
		s.concat("java");
		System.out.println(s);//hello
		//하지만 StringBuffer는 임시저장공간을 만드는 것임으로 결과가 바로 바로 저장됨.
		//append() : ~를 붙이는 method
		//여유공간 16을 채운다.
		System.out.println("1. sb3 == " + sb3); // hello
		sb3.append("java");
		System.out.println("2. sb3 == " + sb3); // hello java
		sb3.append(" !!!!!");
		System.out.println("3. sb3 == " + sb3);
		cap3 = sb3.capacity();
		System.out.println("크기 : " + cap3 + "\t문자열 수 : " + sb3.length());
		//여유공간 16 다 차면 또 16개의 여유공간 다시 만듦
		sb3.append(" !!!!!!");
		System.out.println("4. sb3 == " + sb3);
		cap3 = sb3.capacity();
		System.out.println("크기 : " + cap3 + "\t문자열 수 : " + sb3.length());
		
		//insert(int offset, boolean b) : 시작점에 추가 문자열을 insert
		sb3.insert(10, "@@@");
		System.out.println("5. sb3 === " + sb3);
		
		//delete(int start, int end)
		sb3.delete(10, 12);//10부터 12 전까지
		System.out.println("6. sb3 === " + sb3);
		
		//deleteCharAt(int index) : index에 해당하는 문자 1개 지움
		sb3.deleteCharAt(10);//10부터 12 전까지
		System.out.println("7. sb3 === " + sb3);
		
		//indexOf(String str) : 이 문자열이 몇번째에 있는가
		
		//replace(int start, int end, String str) : start부터 end전까지를 str로 바꿔라
		sb3.replace(6, 10, "자바");
		System.out.println("8. sb3 === " + sb3);
		
		//reverse() : 거꾸로
		sb3.reverse();
		System.out.println("9. sb3 === " + sb3);
		sb3.reverse();
		
		//setCharAt(int index, char ch) : index에 해당하는 문자를 ch로 바꿔라
		sb3.setCharAt(9, '@');
		System.out.println("10. sb3 === " + sb3);
		
		//toString() : StringBuffer를 String으로 바꿈.
		String s1 = new String(sb3);
		String s2 = sb3.toString();
		System.out.println(s2);
		
		System.out.println("---------------------------");
		
		//예제
		String str = "hello 자바 !!!";
		String findStr ="오라클";
		String replaceStr = "java";
		int where = str.indexOf(findStr);
//		System.out.println(where);
//		System.out.println(sb.length());
		if (where<0) {
			System.out.println(findStr +"은 없습니다.");
		}
		else {
			StringBuffer sb = new StringBuffer(str);
			System.out.println(sb);
			sb.replace(where, where + findStr.length(), replaceStr);
			System.out.println(sb);
		}
		
		
		
		//charSequence : interface 이기 때문에 implementing class이용 
		//문자열 갖고 임시저장공간 만든다.
	}
}
