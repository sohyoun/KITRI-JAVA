package com.kitri.exception.runtime;

import java.util.Random;

public class ArithMeticTest {
	public static void main(String[] args) {
		Random random = new Random();
		int x = 30;
		
//		ArithMeticException�� RuntimeException�̱� ������ try catch�� ó���ؾ��ϴ� ���� �ƴ϶� logic���� ó���ؾ��Ѵ�.
//		int y = random.nextInt(5);
//		try {
//			int z = x/y;
//			System.out.println(x+"/"+y+"="+z);
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("0���� ���� ��  �����ϴ�.");
//		}
//		1.0�� ������ �������� �ʴ� ���
		int y = random.nextInt(5);
		if(y!=0) {
			int z = x/y;
			System.out.println(x+"/"+y+"="+z);
		} else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
		
//		2.0�� �ƿ� �Ȱ������� ���
//		int y = random.nextInt(4)+1;
//		int z = x/y;
//		System.out.println(x+"/"+y+"="+z);
		
	}
}
