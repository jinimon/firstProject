package com.yedam.classes;

public class Calculator {
	double pi = 3.14; // 변수

	// 가로, 세로 값 받아서 넓이를 반환하는 메소드(getRectangle)
	public void getRectangle(int a, int b) {
		int result = a * b;
		System.out.println("가로 " + a + ", 세로 " + b + "인 사각형의 넓이는 " + result);
	}

	public int add(int x, int y) { // method
		int sum = 0;
		sum = x + y;
		return sum;
	}

	public double add(double x, double y) { // method
		return x + y;
	}

	// 매개값은 있지만 반환값이 없다. 단순히 결과값을 화면에 출력하는 메소드
	public void getArea(double a) { // method. 원의 넓이 계산
		double result = pi * a * a;
		System.out.println("반지름 " + a + "인 원의 넓이는 " + result);
	}
}
