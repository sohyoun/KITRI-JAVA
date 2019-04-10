package com.kitri.util.freetest6;

public class TVProgram {

	private String title;
	private String broadcast;
	
	public TVProgram(String title, String broadcast) {
		super();
		this.title = title;
		this.broadcast = broadcast;
	}

	@Override
	public String toString() {
		return title + "\t" + broadcast;
	}
	
}
