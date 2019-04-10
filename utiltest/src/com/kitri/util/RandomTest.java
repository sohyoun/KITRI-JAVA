package com.kitri.util;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		
		//nextBoolean() : bolean 값을 랜덤하게 발생
		boolean b = random.nextBoolean();
		System.out.println("b === " + b);
		double d = random.nextDouble();
		System.out.println("d === " + d);
		int i = random.nextInt();
		System.out.println("i === " + i);
		
		//nextInt(int bound) : 0~(bound-1) 까지 random
		int r = random.nextInt(256);
		System.out.println("r === " + r);
		
	}
}
