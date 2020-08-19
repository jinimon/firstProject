package com.yedam.interfaces;

// public은 한번만 사용 가능
class Anonymous {
	void run() {
		System.out.println("실행");
	}
}

interface AnonymInterface {
	// 하위는 run()이라는 메소드 반드시 사용해야한다.
	void run();	// functional interface
}

// 인터페이스 : 자식 클래스 가지지 않고. 구현 객체
// 부모 클래스 : 자식 클래스를 가진다.

//익명 클래스. 이름 없는 클래스
public class AnonymousExample {
	public static void main(String[] args) {
		// 중간과정 생략 가능
		AnonymInterface anonymIntf = () -> {System.out.println("자식 구현 객체 실행");
		};
		anonymIntf.run();

		// 부모 클래스(Anonymous)를 상속하는 자식 클래스. 이 안에서만 사용할거라 별도로 이름x
		// 익명 객체 anonym
		Anonymous anonym = new Anonymous() {
			String str;

			@Override
			void run() {	// 부모 클래스의 run 상속
				System.out.println("자식 실행");
			}
		};
		anonym.run();
	}
}
