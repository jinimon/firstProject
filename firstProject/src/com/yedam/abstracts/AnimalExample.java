package com.yedam.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal anm = new Animal(); // 추상클래스 인스턴스 생성 불가
		Animal anm = new Cat();
		anm.breathe();
		anm.sound();

		// anm.breathe() : 상속받는 하위 클래스에서 재정의(override)안됐으니까 결과 같음
		// anm.sound() : 각 하위 클래스(Cat, Dog)에서 재정의 해준 값이 출력

		anm = new Dog();
		anm.breathe();
		anm.sound();

		int a = 10;
		double b = a; // promotion. 자동 형변환. 큰 type <- 작은 type
		a = (int) b; // casting. 강제 형변환. 큰 type -> 작은 type

		// 부모와 자식 간에 형변환 가능
		Dog dog = (Dog) anm;	// 부모(큰 type)가 자식으로
		dog.sound();
	}
}
