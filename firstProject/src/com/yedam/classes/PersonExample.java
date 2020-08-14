package com.yedam.classes;

public class PersonExample {
	public static void main(String[] args) {
		// Person : 클래스. p1 : 클래스 변수
		Person p1 = new Person();
		p1.setName("이화진");
		p1.setAge(24);

//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());

		// 인스턴스 : lhj, ydk -> Person의 메소드, 객체 등이 저장된 특별한 변수(?)
		// 위 인스턴스에 대한 원 설계도 : Person 클래스
		Person lhj = new Person();
		lhj.setName("이화진");
		lhj.setAge(24);

		System.out.println(lhj); // 주소값 출력

		Person lhj2 = new Person();
		lhj2.setName("이화진");
		lhj2.setAge(24);

		Person ydk = new Person();
		ydk.setName("윤뽕뽕");
		ydk.setAge(24);

		// if) 두 인스턴스가 같은 값을 담고 있어도 주소값은 다르다. 각각의 인스턴스를 생성했기 때문에.
		System.out.println(lhj == lhj2);
		// 값을 비교하면 같음
		System.out.println(lhj.getName().equals(lhj2.getName()));

		Person[] pAry = { lhj, lhj2, ydk };
//		for (int i = 0; i < pAry.length; i++) {
//			System.out.println("> " + pAry[i].introduce());
//		}

		// 생성자 추가해서 출력보는 실습
		Person anoy = new Person("이뽕뽕");
		anoy.name = "쟈몽";
		anoy.age = 22;
		System.out.println(anoy.introduce());

		Person one = new Person("원", 20);
		one.setName("투");
		System.out.println(one.introduce());
	}
}
