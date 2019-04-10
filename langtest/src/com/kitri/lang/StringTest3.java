package com.kitri.lang;

public class StringTest3 {
	//String method
	public static void main(String[] args) {
		//charAt(int index) : index��ȣ ������ ���ڸ� �����Ͷ�.
		String str = "hello java !!!";
		char c = str.charAt(4);
		System.out.println("c == "+ c);
		
		//'0'�� �ƽ�Ű�ڵ尪 48
		str = "123";
		int x = str.charAt(0) - 48; //'1'�� �ƽ�Ű�ڵ尪 49 - 48 = 1
		System.out.println("x === " + x);//1
		
		str = "1a1";
		int len = str.length();
		System.out.println("length ==" + len);
		String result = "�����Դϴ�.";
		for(int i=0; i<len; i++) {
			int y = str.charAt(i)-48;
			if (y>9 || y<0) {
				result = "���ڰ� �ƴմϴ�.";
				break;
			}
		}
		System.out.println(str+"�� "+result);
		
		//concat(String str)
		String str1 = "hello ";
		String str2 = "java";
		System.out.println(str1+str2);
		System.out.println(str1.concat(str2));//���ڿ� ����. �� ����X
		
		//startWith(String prefix) ~�� �����Ѵ�. (��ҹ��� ����,���ڿ� ����)
		//endsWith(String prefix) ~�� ������.
		str = "hello java !!!";
		if(str.startsWith("h"))
			System.out.println(str+"�� h�� �����Ѵ�.");
		if(str.endsWith("!!"))
			System.out.println(str+"�� !!�� ������.");
		
		//toUpperCase, toLowerCase
		String s1 = "java";
		String s2 = "JavA";
		System.out.println("s1.toUpperCase()==" + s1.toUpperCase());
		System.out.println("s2.toLowerCase()==" + s2.toLowerCase());
		if(s1.equals(s2))
			System.out.println(s1+"�� "+s2+"�� ���� ���ڿ��̴�.");
		else
			System.out.println(s1+"�� "+s2+"�� �ٸ� ���ڿ��̴�.");
		//equalsIgnoreCase(String anotherString)
		if (s1.toUpperCase().equals(s2.toUpperCase()))
			System.out.println(s1+"�� "+s2+"�� ��ҹ��� ���о��� ���� ���ڿ��̴�.");
		else
			System.out.println(s1+"�� "+s2+"�� ��ҹ��� ���о��� �ٸ� ���ڿ��̴�.");
		if (s1.equalsIgnoreCase(s2))
			System.out.println(s1+"�� "+s2+"�� ��ҹ��� ���о��� ���� ���ڿ��̴�.");
		else
			System.out.println(s1+"�� "+s2+"�� ��ҹ��� ���о��� �ٸ� ���ڿ��̴�.");
		
		
	}
}
