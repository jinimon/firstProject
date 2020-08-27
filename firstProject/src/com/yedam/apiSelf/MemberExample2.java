package com.yedam.apiSelf;

public class MemberExample2 {
	public static void main(String[] args) {

		// 원본 객체 생성
		Member2 original = new Member2("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));

		// 복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member2 cloned = original.getMember2();
		cloned.scores[0] = 100;
		cloned.car.model = "그랜저";

		// 복제 객체에서 패스워드 변경
		cloned.password = "67890";
		System.out.println("-------------------");
		System.out.println("복제 객체의 필드값(깊은)");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.print("scores : {");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.print(cloned.scores[i]);
			System.out.print((i == (cloned.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car : " + cloned.car.model);

		System.out.println("-------------------");
		System.out.println("원본 객체의 필드값(깊은)");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.print("scores : {");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.print(original.scores[i]);
			System.out.print((i == (original.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car : " + original.car.model);

	}
}
