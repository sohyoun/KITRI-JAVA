package com.kitri.thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new ThreadExt("��");
		Thread t2 = new ThreadExt("��");
		Thread t3 = new ThreadExt("!!!");//ThreadExt class�� Thread ��ӹ޾����� new ThreadExt�� �ؾ���
		
//		t1.run();
//		t2.run();
//		t3.run();//�̷��� �ϸ� t1 500��, t2 500�� t3 500�� ����. �Ϲ� method ó����
		
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("���α׷� ����!!!");
	}
}
