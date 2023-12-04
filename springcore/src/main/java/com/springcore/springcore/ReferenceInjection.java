package com.springcore.springcore;

public class ReferenceInjection {

	private int x;
	private BRef obj;

	public ReferenceInjection(int x, BRef obj) {
		super();
		this.x = x;
		this.obj = obj;
	}

	public ReferenceInjection() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public BRef getObj() {
		return obj;
	}

	public void setObj(BRef obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "ReferenceInjection [x=" + x + ", obj=" + obj + "]";
	}

}
