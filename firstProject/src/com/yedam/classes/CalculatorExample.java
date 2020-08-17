package com.yedam.classes;

public class CalculatorExample {
	public static void main(String[] args) {
		// 클래스 변수 cal -> Calculator 클래스의 기능(method)들을 담고있다.
//		Calculator cal = new Calculator();
//
//		System.out.println("10 + 20 = " + cal.add(10, 20));
//		System.out.println("10.0 + 20.0 = " + cal.add(10.0, 20.0));
		// new로 cal이라는 새 인스턴스 변수를 만들지 않아도 아래처럼 클래스 명을 바로 불러와서 사용 가능
		System.out.println(Calculator.add(10, 20));

		double r1 = 3.5;
//		cal.getArea(r1);
//		cal.getRectangle(4, 5);
	}
}
