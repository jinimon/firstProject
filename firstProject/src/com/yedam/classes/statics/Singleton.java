package com.yedam.classes.statics;

public class Singleton {
	// 인스턴스 하나를 가지고 쓰겠다..? 클래스 단위로 여러개의 인스턴스가 필요 x
	// singleton 필드도 접근 못하게 private 하기
	private static Singleton singleton = new Singleton();
	
	// 싱글톤을 만들기위해 클래스 외부에서 new 연산자로 생성자 호출할 수 없게 private로 막음
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
}