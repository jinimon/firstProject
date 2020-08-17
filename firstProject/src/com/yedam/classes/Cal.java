package com.yedam.classes;

public class Cal {
	// 필드에 private하면 외부 접근 불가능
	private int r; // 반지름
	private double pi = 3.14;

	public void setRadius(int r) {
		if (r < 0)
			r = 0;
		else
			this.r = r;
	}
	
	public int getRadius() {
		return r;
	}

	public double getArea() {
		double result = pi * r * r;
		return result;
	}
}
