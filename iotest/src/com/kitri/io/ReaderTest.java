package com.kitri.io;

import java.io.*;

public class ReaderTest {
	public static void main(String[] args) {
		Reader in = null;
	try {//~Reader : Character Stream (byte�� �ƴ� ����)
			in = new InputStreamReader(System.in);//�ܼ�â���� �о�� �� : System.in
			char c[] = new char[100];
			System.out.println("�Է� : ");
			int x = in.read(c);
			System.out.println("x === "+ x);//x==���� �� +\r\n (���� enter�� \r\n)
			String str = new String(c,0,x-2);//�׳� c �ϸ� �Է��� ����+������ ĭ�� �� 100ĭ ��µ�. ���� 0~x-2������ ����ϱ�
			System.out.println(str);
			
			int len = c.length;
			for (int i = 0; i < len; i++) {
				System.out.println(c[i]);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
