package com.kitri.lang;

public class StringTest1 {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		if(s1==s2)//���ڿ� ����ҿ� S1�� �����. ������ S2�� ���ڿ�����ҿ� "java"�� �̹� �������� �ű��� �ּҿ� ����ȴ�. ���� ���� ���� ���������� ���� ����.
			System.out.println("s1 s2�� �ּҰ��� ����."); //0
		if(s1==s3)//���ڿ� ����ҿ� ����� "java"�� s1�� ����.���� Heap�� ����� S3,S4�� ���ڿ� ����ҿ� S1,S2�� ������ü�� �ٸ����� �� X
			System.out.println("s1 s3�� �ּҰ��� ����.");//X
		if(s1==s4)
			System.out.println("s1 s4�� �ּҰ��� ����.");//X
		if(s2==s3)
			System.out.println("s2 s3�� �ּҰ��� ����.");//X
		if(s2==s4)
			System.out.println("s2 s4�� �ּҰ��� ����.");//X
		if(s3==s4)//==�� �ּҰ� �������� X S3,S4�� Heap����/S3�� "java"�� S4�� "java"�� ���� ���������.
			System.out.println("s3 s4�� �ּҰ��� ����.");//X
		
		System.out.println("----------------------------------------------");
		//java�� ��ҹ��� ������.
		if(s1.equals(s2))//���� Object�� equals�� �ּҰ� �������� String���� equals�� overriding�س��� ���ڿ� �񱳰� �ȴ�.
			System.out.println("s1 s2�� ���ڿ����� ����."); //0
		if(s1.equals(s3))
			System.out.println("s1 s3�� ���ڿ����� ����.");//0
		if(s1.equals(s4))
			System.out.println("s1 s4�� ���ڿ����� ����.");//0
		if(s2.equals(s3))
			System.out.println("s2 s3�� ���ڿ����� ����.");//0
		if(s2.equals(s4))
			System.out.println("s2 s4�� ���ڿ����� ����.");//0
		if(s3.equals(s4))
			System.out.println("s3 s4�� ���ڿ����� ����.");//0
	}
}
