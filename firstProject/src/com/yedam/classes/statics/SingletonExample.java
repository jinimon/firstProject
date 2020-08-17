package com.yedam.classes.statics;

public class SingletonExample {
	public static void main(String[] args) {
//		new Singleton();	// private 되어있어서 new로 생성 불가능
		// 대신 .getInstance()로 return 되는 인스턴스 가져와야함
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		if (s1 == s2) { // 보통 주소값 비교 시 false. 하지만 싱글톤은 true. 동일한 객체이다.
			// 이유 : 원래는 new로 각각 새 객체를 생성해서 다른 객체였지만 이건 싱글톤으로 호출한거라 같은 객체
			// 인스턴스 만들필요 없이 하나의 객체를 가지고 사용 가능한 것이 싱글톤
			System.out.println("동일한 인스턴스 입니다.");
		} else {
			System.out.println("다른 인스턴스 입니다.");
		}
	}
}