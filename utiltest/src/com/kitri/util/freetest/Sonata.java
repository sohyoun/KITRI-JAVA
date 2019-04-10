package com.kitri.util.freetest;

public class Sonata extends Car{
	String series;
	String use;
	Car car;
	public Sonata(String color,int account,String use,String series) {
//		super(color,account);
		this.series = series;
		this.use = use;
		super.color = color;
		super.account = account;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\t[용도]"+use+"\t[시리즈]"+series;
	}
}
