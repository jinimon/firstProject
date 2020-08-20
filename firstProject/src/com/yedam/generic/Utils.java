package com.yedam.generic;

public class Utils {
	// Utils 인스턴스 만들어서 호출하기 귀찮으니까 static해서 정적으로 변경
	public static <T> Box<T> boxing(T t) { // 제네릭 type을 받는다.
		// Box<T>가 제네릭이라는걸 알려주기 위해서 앞에 <T> 추가. 클래스 아니고 제네릭이다.
		// boxing 호출하는 시점에 type(T)를 결정할것이다.
		// 매개값으로 오는 타입을 받아서 box에 저장해서 반환해주겠다.

		Box<T> box = new Box<>();
		box.set(t);

		return box;
	}

	// Product 타입의 변수를 2개 받는다.
	// return 값은 boolean
	public static <T, M> boolean compare(Product<T, M> p1, Product<T, M> p2) {
		boolean b1 = p1.getType().equals(p2.getType()); // type 비교
		boolean b2 = p1.getModel().equals(p2.getModel());

		// b1, b2 둘다 같으면 논리적으로 같음(?)
		return b1 && b2;
	}
}
