//Wrapper Class : 기본 DT을 클래스화 시켜놓은 클래스
//기본DT				WrapperClass
//boolean				Boolean
//char					Character
//byte					Byte
//short					Short
//int					Integer
//long					Long
//float					Float
//double				Double
package com.kitri.lang;

public class WrapperClassTest {

	public static void main(String[] args) {
		Boolean b1 = new Boolean(true);//Boolean 생성자(Constructor)를 사용해서 true값을 갖고 있는 boolean형태의 객체 생성
		boolean b2= b1.booleanValue();
		
		boolean b3 = Boolean.parseBoolean("true");//parse : 설명하다
		//parseBoolean은 잘 안쓰임 보통 parseint를 많이 씀.
		
		System.out.println(b1);
		if (b2)
			System.out.println("b2는 true다");
		if (b3)
			System.out.println("b3는 true다");
		
		
		String s = "123";//숫자형식인 문자열만 된다.
		System.out.println(s+4);	//1234
		//Integer i = new Integer(s);	 //Integer생성자 안에는 String이나 int됨.
		//int x = i.intValue();		
		int x = Integer.parseInt(s); //parse는 static
		System.out.println(x+4);	//127
		
		s="123.45";
		double d = Double.parseDouble(s);
		System.out.println(d+4);
		
		//autoboxing : refer에서 같은 datatype끼리만 자동으로 박스화,언박싱화
		//캐스팅연산의 유일한 예외 
		//원래 캐스팅연산은 RDT는 RDT끼리, 기본DT는 기본DT끼리만 형변환 가능
		Integer i2 = new Integer(3);
		
		//unboxing : ReferenceDT을 기본 DT로 자동형변환
		int y = i2;
		
		//boxing : 기본DT를 ReferenceDT로 자동형변환
		Integer i3= y;
	}

}
