package com.springcore.springcore;

public class BRef {
	
	private int y;

	@Override
	public String toString() {
		return "BRef [y=" + y + "]";
	}

	public BRef(int y) {
		super();
		this.y = y;
	}

	public BRef() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
