package com.kitri.test;//�ݵ�� package �˷������.

import com.kitri.car.Car;

public class CarUser {
	
	public static void main(String[] args) {
		
		Car car = new Car("�Ÿ","������","����");
		
		System.out.println("�̸� : "+car.getName());
		System.out.println("���� : "+car.getColor());
		System.out.println("������ : "+car.getMaker());
		
		car.setColor("���");
		System.out.println("���� �� ���� : "+car.getColor());
		System.out.println(car);
		
	}

}
