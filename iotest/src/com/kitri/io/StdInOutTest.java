package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {
	public static void main(String[] args) {
//		System class�� static field�� out�� Type�� PrintStream�� prinln method�� �� ��
//		System.out.println();
		
//		int x = System.in.read(); // ���� : IOException������ nonRuntimeException��.
		try {
//			System.out.print("�Է� : ");
//			int x = System.in.read();
//			System.out.println("1. x == " + x);//ù��° ������ �ƽ�Ű �ڵ� �� �޾ƿ�
//			System.out.println("1. x == " + (char)x);
			
			System.out.println("�Է�2 : ");
			byte b[] = new byte[100];
			int x = System.in.read(b);
			System.out.println("2. x == " + x);//�Է��� ���ڵ��� �� byte�� ����\n +2 byte
			int len = b.length;
			for (int i = 0; i < len; i++) {
				System.out.println(b[i]);//�Է��� ���ڵ��� �ƽ�Ű�ڵ尪
			}
			String s= new String(b,0,x-2);//byte�迭�� String������ ��ȯ(100¥���� ���ڱ��̸�ŭ����
			System.out.println("s == "+s);//�Է��� ���� ��µ� >> 100byte �Ѵ� ���ڴ� �ȵ�
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
