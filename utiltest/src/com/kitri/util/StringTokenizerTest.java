package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {
	public static void main(String[] args) {
		//StringTokenizer(String str) : str ���ڿ� �ڸ� 
		//StringTolenizer�� ���ڿ��� �ڸ��� ���̶� default������.
		String str = "hello java !!!";
		StringTokenizer st = new StringTokenizer(str);
				
		//method
		//countTokens(): Token���� (default�� ����)
		int cnt = st.countTokens();
		System.out.println(cnt);//3
				
		//hasMoreTokens : ���� ��ū�ִ���? (boolean)
		//nextToken : ���� ��ū�� �ҷ���.
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		//�������� : ������ ������� ��� ex)https://
		str = "TO|��ȿ��|�ȳ��ϼ��� ���� ���ؿ�???";
		StringTokenizer st2 = new StringTokenizer(str,"|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		System.out.println("��� : "+ protocol);
		System.out.println("�������� : "+ to);
		System.out.println("������ �޼��� : " + msg);
	
		System.out.println(UUID.randomUUID());
	}
}
