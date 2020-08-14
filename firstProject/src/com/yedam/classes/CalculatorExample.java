package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
		// 클래스 변수 cal -> Calculator 클래스의 기능(method)들을 담고있다.
		Calculator cal = new Calculator();

		System.out.println("10 + 20 = " + cal.add(10, 20));
		System.out.println("10.0 + 20.0 = " + cal.add(10.0, 20.0));

		double r1 = 3.5;
		cal.getArea(r1);
		cal.getRectangle(4, 5);
	}
}
