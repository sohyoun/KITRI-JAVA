package com.kitri.lang;

public class StringVSBuffer {
	public static void main(String[] args) {
		//java.lang�� System Class
		//nanoTime() method
		long st = System.nanoTime();
		String str = "hello ";
		for(int i=0; i<5000; i++) {
			str += i;
		}
		
//		StringBuffer sb = new StringBuffer("hello ");
//		for (int i=0; i<500; i++) {
//			sb.append(i);
//		}
		
		System.out.println(System.nanoTime() - st);
		
		//5000�� for��
		//String
		//39969247	39518292	62821418	40041735
		//StringBuffer
		//229968	203347		230931		230930
		
		//���ڿ� ���� ���� StringBuffer ����Ѵ�.
		//�ð� ���̰� ���� ��.
		
	}
}
