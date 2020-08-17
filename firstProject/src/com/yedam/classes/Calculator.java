package com.yedam.classes;

public class Calculator {
	// static : 고정되어 있다는 의미. 이거 있으면 main 메소드 있는 java파일에 인스턴스 생성 안해도 됨
	static double pi = 3.14; // 변수

	// 가로, 세로 값 받아서 넓이를 반환하는 메소드(getRectangle)
	public static void getRectangle(int a, int b) {
		int result = a * b;
		System.out.println("가로 " + a + ", 세로 " + b + "인 사각형의 넓이는 " + result);
	}

	public static int add(int x, int y) { // method
		int sum = 0;
		sum = x + y;
		return sum;
	}

	public static double add(double x, double y) { // method
		return x + y;
	}

	// 매개값은 있지만 반환값이 없다. 단순히 결과값을 화면에 출력하는 메소드
	public static void getArea(double a) { // method. 원의 넓이 계산
		double result = pi * a * a;
		System.out.println("반지름 " + a + "인 원의 넓이는 " + result);
	}
}
