package com.yedam.classes;

public class CalExample {
	public static void main(String[] args) {
		Cal cal = new Cal();
//		cal.r = 5;
		cal.setRadius(5);
		System.out.println("반지름 " + cal.getRadius() + "의 넓이는 : " + cal.getArea() + "이다.");

		// println : 각각의 데이터 타입에 따른 정의가 되어있어서 무슨 타입이 오든 출력해준다.
//		System.out.println(10);
//		System.out.println(10.5);
//		System.out.println("10");

		print(200);
		print(200.5);
		print(200);
	}

	// + 생성자 오버로딩도 있다. 매개 변수 명이 다른건 x. 타입이나 갯수가 달라야한다.
	// 메소드 오버로딩 : 동일한 메소드명 사용. 매개 변수의 타입이나 갯수가 달라야한다.
	public static void print(int a) {
		System.out.println("입력값은 " + a);
	}

	public static void print(double a) {
		System.out.println("입력값은 " + a);
	}

	public static void print(String a) {
		System.out.println("입력값은 " + a);
	}
}
