package com.yedam.classes;

final class FinalClass {

}

//final 클래스 생성 시 다른 클래스가 상속 불가
//class ExtendClass extends FinalClass {}

// String 클래스는 자동으로 final 되어있다. 상속 불가
//class ExString extends String {}

public class MainEx {

	// final로 생성된 필드
	final int age = 10;

	public static void main(String[] args) {
		Friend fr = new Friend(); // 인스턴스
		fr.getAge(); // 인스턴스 메소드

//		Calculator cal = new Calculator();
		Calculator.add(10, 10); // 정적 메소드. new로 인스턴스 안만들어도 클래스이름으로 사용 가능

		final int val = 10;
//		val = 20; // final로 생성된 변수는 값 변경 불가. 데이터 값 할당 x

		MainEx ex = new MainEx();
//		ex.age = 20;	// 변수 값 변경 불가. 데이터 값 할당 x
	}
}
