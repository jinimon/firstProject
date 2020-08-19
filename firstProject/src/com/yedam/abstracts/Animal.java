package com.yedam.abstracts;

public abstract class Animal {
	private String species; // 필드

	// 기본 생성자
	public Animal() {

	}

	// 메소드
	public void showInfo() {
		System.out.println("분류는 " + species);
	}

	public void breathe() {
		System.out.println("숨을 쉰다.");
	}

	// 추상 메소드. 실제 기능 정의x. Animal 클래스를 상속받는 하위 클래스(Cat, Dog)에서는 정의해야한다
	public abstract void sound();
}
