package com.kitri.thread;

public class RunnableTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableImpl("��"));//RunnableImpl �� Thread�� ��ӹ����� �ƴϱ� ������ �ٷ� new RunnableImpl�� �ϸ� �ȵǰ� Tread�� ���� �����ϰ� �ȿ� �����ؾ���.
		Thread t2 = new Thread(new RunnableImpl("��"));
		Thread t3 = new Thread(new RunnableImpl("!!!"));
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("���α׷�����!!!!!!!!");
	}
}
