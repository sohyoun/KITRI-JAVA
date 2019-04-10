//Wrapper Class : �⺻ DT�� Ŭ����ȭ ���ѳ��� Ŭ����
//�⺻DT				WrapperClass
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
		Boolean b1 = new Boolean(true);//Boolean ������(Constructor)�� ����ؼ� true���� ���� �ִ� boolean������ ��ü ����
		boolean b2= b1.booleanValue();
		
		boolean b3 = Boolean.parseBoolean("true");//parse : �����ϴ�
		//parseBoolean�� �� �Ⱦ��� ���� parseint�� ���� ��.
		
		System.out.println(b1);
		if (b2)
			System.out.println("b2�� true��");
		if (b3)
			System.out.println("b3�� true��");
		
		
		String s = "123";//���������� ���ڿ��� �ȴ�.
		System.out.println(s+4);	//1234
		//Integer i = new Integer(s);	 //Integer������ �ȿ��� String�̳� int��.
		//int x = i.intValue();		
		int x = Integer.parseInt(s); //parse�� static
		System.out.println(x+4);	//127
		
		s="123.45";
		double d = Double.parseDouble(s);
		System.out.println(d+4);
		
		//autoboxing : refer���� ���� datatype������ �ڵ����� �ڽ�ȭ,��ڽ�ȭ
		//ĳ���ÿ����� ������ ���� 
		//���� ĳ���ÿ����� RDT�� RDT����, �⺻DT�� �⺻DT������ ����ȯ ����
		Integer i2 = new Integer(3);
		
		//unboxing : ReferenceDT�� �⺻ DT�� �ڵ�����ȯ
		int y = i2;
		
		//boxing : �⺻DT�� ReferenceDT�� �ڵ�����ȯ
		Integer i3= y;
	}

}
