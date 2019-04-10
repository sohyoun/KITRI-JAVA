package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class StringTest2{

	public static void main(String[] args) throws UnsupportedEncodingException {
		//null�� String�� heap�� �ƿ��ȿö�� ����
		//String str = null;
		//System.out.println("���ڿ� ���� : "+str.length());//���� : �ּҰ����µ� ��� �� ���̳�
		//null�� �ּҰ� ��� ������ ���� ����.
		
		//String()
		//�̰� String�� �ִµ� ���ΰ�
		String str1 = new String();
		System.out.println("���ڿ� ���� : "+str1.length());
		
		//String(byte[] bytes)
		//byte b[] = {97,98,99,100}; // �ƽ�Ű�ڵ� �� abcd
		byte b[] = {-66,-56,-77,-25,-57,-49,-68,-68,-65,-28,46};// �ƽ�Ű�ڵ� �� �ȳ��ϼ���.
		String str2 = new String(b);//String ������ �ٲٸ� �ƽ�Ű�ڵ� �� ��µ�.
		//String str2 = new String(b,"euc-kr"); // ����. default ���� euc-kr.
		System.out.println("str2 == " + str2);
		
		//String(byte[] bytes, Charset carset)
		//euc-kr : �Ϲ��� �ѱ��� �ϼ��� �ѱ۷� ����. 2byte �� ó��
		//utf-8�� �������� ���ڸ� ó�� ����. ��� 3byte�� ó��. ���ڸ� �׸���.
		//�ѱ� ���� �� �� ����ϱ�! 
		byte b2[] = {-20,-107,-120,-21,-123,-107,-19,-107,-104,-20,-124,-72,-20,-102,-108,46};// �ƽ�Ű�ڵ� �� �ȳ��ϼ���.
		String str3 = new String(b2,"utf-8");//String ������ �ٲٸ� �ƽ�Ű�ڵ� �� ��µ�.
		System.out.println("str3 == " + str3);
		
		//String(byte[] bytes, int offset, int length)
		byte b3[] = {97,98,99,100,101,102,103,104};
		String str4 = new String(b3,2,4);//offset : ������. length : ����
		System.out.println("str4 == " + str4);
		
		//�ѱ�, �߱���, �Ϻ��� ���� 2byte�� �����ϰ� ������ ������ byte���� char�� �ϴ� ���� ����
		//String(char[] value)
		char c[] = {'��','��','c','d','e','f'};
		String str5 = new String(c);
		System.out.println("str5 ==" + str5);
		
		//String(char[] value, int offset, int count)
		String str6 = new String(c,2,4);
		System.out.println("str6 ==" + str6);
		
		

	}
}
