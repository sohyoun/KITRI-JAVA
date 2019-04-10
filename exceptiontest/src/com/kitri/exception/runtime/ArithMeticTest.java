package com.kitri.exception.runtime;

import java.util.Random;

public class ArithMeticTest {
	public static void main(String[] args) {
		Random random = new Random();
		int x = 30;
		
//		ArithMeticException은 RuntimeException이기 때문에 try catch로 처리해야하는 것이 아니라 logic으로 처리해야한다.
//		int y = random.nextInt(5);
//		try {
//			int z = x/y;
//			System.out.println(x+"/"+y+"="+z);
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("0으로 나눌 수  없습니다.");
//		}
//		1.0이 나오면 실행하지 않는 방법
		int y = random.nextInt(5);
		if(y!=0) {
			int z = x/y;
			System.out.println(x+"/"+y+"="+z);
		} else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
//		2.0을 아예 안가져오는 방법
//		int y = random.nextInt(4)+1;
//		int z = x/y;
//		System.out.println(x+"/"+y+"="+z);
		
	}
}
