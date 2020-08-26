package com.yedam.collection;

// 이전에 같은 이름의 Member 클래스를 생성했지만 패키지명.클래스명이 full name이라서 ㄱㅊ
// com.yedam.collection.Member
public class Member {
	// 필드
	private String name;
	private int age;

	// 생성자
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// get 메소드
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	// hashCode, equals 적절히 활용. 논리적으로 동일한 객체

	
	// 반환해주는 값이 셋 다 같아서 중복으로 인식. 결과 하나만 출력됨 -> 0, true 출력
	// 나이가 같으면 중복으로 인식해서 나이가 다른 결과들 출력 -> this.age, true
	// 나이 다르면 이름 같아도 ㄱㅊ -> this.age, equals(mem.name)
	@Override
	public int hashCode() {	// 메모리가 가진  hash 주소 값 비교
		return this.age;
//		return 0;
//		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {	// 내용 비교
		// 오브젝트 타입을 멤버로 바꿔서 name 비교
		Member mem = (Member) obj;
		return this.name.equals(mem.name);
//		return true;
//		return super.equals(obj);
	}
}
