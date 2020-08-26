package com.yedam.lambda;

// 인터페이스 생성
// 함수적 인터페이스(functional Interface)
interface MyFunctionInterface {
	public void run(); // 추상 메소드(abstract method)
}

// 인터페이스 구현 객체 생성. 인터페이스가 가진 추상메소드를 반드시 구현해야 한다.
class MyFuncClass implements MyFunctionInterface {

	@Override
	public void run() {
		System.out.println("runnn");
	}
}

public class LambdaExample {
	public static void main(String[] args) {
		// new 키워드로 인스턴스 생성 그리고 그 값을 부모에게 할당 가능
//		MyFunctionInterface myintf = new MyFuncClass();

		// run() 할때마다 반환 값이 다르면 굳이 MyFuncClass 선언할 필요 없음. 클래스만 늘어남..
		// 익명의 구현 객체를 이용하여 굳이 구현 객체를 생성하지 않고 인터페이스만 있어도 바로 가능
		// 이런것이 람다표현식. 우리는 MyFunctionInterface를 사용하는 것도 알고 그 안에 있는 추상 메소드가 run이라는 것도 아니까
		// 모두 생략 가능(지금은 추상메소드 하나니까)
		// 람다 표현식은 구현해야할 추상 메소드가 1개있을 경우에만 사용 가능. 함수적 인터페이스만 가능
		MyFunctionInterface myintf = () -> {
			System.out.println("runnn");
		}; // end of MyFunctionInterface 익명 구현 객체
		myintf.run();

		// 이것도 함수적 인터페이스라 생략 가능
		ShowContent sc = (content) -> {
			// 매개값으로 받은거 결과 처리
			System.out.println("내용은 " + content + "입니다.");
		}; // end of ShowContent
		sc.show("바나나");

		// 위에랑 다른 결과값을 출력하니까 람다식을 추가 생성
		ShowContent sc2 = (content) -> {
			System.out.println("this is " + content);
		}; // end of ShowContent
		sc2.show("바나나"); // this is 바나나

		// 인터페이스명, 추상 메소드명, 매개값 타입, return도 생략 가능
		Calculate cal = (a, b) -> a + b;
		System.out.println("결과 : " + cal.sum(10, 5));
	}
}
