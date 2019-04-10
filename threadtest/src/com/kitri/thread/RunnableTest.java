package com.kitri.thread;

public class RunnableTest {
	public static void main(String[] args) {
		Thread t1 = new Thread(new RunnableImpl("퐁"));//RunnableImpl 은 Thread를 상속받은게 아니기 때문에 바로 new RunnableImpl을 하면 안되고 Tread를 먼저 생성하고 안에 생성해야함.
		Thread t2 = new Thread(new RunnableImpl("당"));
		Thread t3 = new Thread(new RunnableImpl("!!!"));
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("프로그램종료!!!!!!!!");
	}
}
