package com.kitri.util.freetest;

public class Car {
	public String color;
	public int account;
	
	public void Car(String color, int account) {
		this.color=color;
		this.account = account;
		
	}
	
	@Override
	public String toString() {
		return "[����]"+color+"\t[�������]"+account;
	}
}
