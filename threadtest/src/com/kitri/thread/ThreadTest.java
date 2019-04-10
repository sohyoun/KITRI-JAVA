package com.kitri.thread;

public class ThreadTest {

	public static void main(String[] args) {
		Thread t1 = new ThreadExt("퐁");
		Thread t2 = new ThreadExt("당");
		Thread t3 = new ThreadExt("!!!");//ThreadExt class가 Thread 상속받았으니 new ThreadExt로 해야함
		
//		t1.run();
//		t2.run();
//		t3.run();//이렇게 하면 t1 500번, t2 500번 t3 500번 실행. 일반 method 처럼됨
		
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("프로그램 종료!!!");
	}
}
