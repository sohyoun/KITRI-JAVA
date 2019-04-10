package com.kitri.lang;



public class StringTest5 {
	public static void main(String[] args) {
		//indexOf
		String str = "hello java !!!";
		int x = str.indexOf('a');
		System.out.println(str+"���� a�� "+(x+1)+"��° �ִ�.");
		x = str.indexOf('a',7);
		System.out.println(str+"���� 8��° ���� a�� "+(x+1)+"��° �ִ�." );
		x = str.indexOf("java");
		System.out.println(str+"���� java�� "+(x+1)+"��° �ִ�." );
		
		//lastIndexOf
		x = str.lastIndexOf('a');
		System.out.println(str+"���� ������ ���� a�� "+(x+1)+"��° �ִ�." );
		
		//isEmpty
		String str2 = "";
		System.out.println(str2+"�� ���� : "+str2.length());
		if(str2.isEmpty())
			System.out.println("�� ���ڿ��̴�.");
		else //�߰��� �ִ� ������ ������.
			System.out.println("str == "+str2);
		String str3 =  "   hello           ";
		System.out.println(str3+"�� ���� : "+str3.length());
		System.out.println(str3+"�� ���� ���� �� ���� : "+str3.trim().length());
		
		//replace
		//1.4�̸� �������� ���ڿ� �ٲ� �� ����.
		String str4 = "jaba";
		System.out.println(str4+"::::"+str4.replace('b','v'));
		System.out.println(str4+"::::"+str4.replace("jaba","java"));
		System.out.println(str4+"::::"+str4.replaceAll("jaba","java"));
		
		//split
		String str5 = "hello java!!!";
		String s[] = str5.split(" ");
		int len = s.length;
		for (int i = 0;i<len;i++) {
			System.out.println("s["+i+"] == " + s[i]);
		}
		
		//substring
		//����Ŭ�� 1���� ����, �ڹٴ� 0���� ����
		System.out.println(str5.substring(6));
		System.out.println(str5.substring(6,9)); //6���� 9�� ����
		
		//���� >> ���ڿ�
		int num = 100;
		String sn1 = num + "";
		System.out.println(sn1+100);//���ڿ��ιٲ����� 200�� �ƴ� 100100
		String sn2 = String.valueOf(num);
		System.out.println(sn2+100);
		String sn3 = Integer.toString(num);
		System.out.println(sn3+100);
		
		//���ڿ� >> ���� : 1�� ��� �� 
		String ns = "100";
		num = Integer.parseInt(ns);
		System.out.println(num+100);
	}
}
