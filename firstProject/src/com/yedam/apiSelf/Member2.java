package com.yedam.apiSelf;

import java.util.Arrays;

public class Member2 implements Cloneable { // Member 클래스가 Cloneable 인터페이스를 구현
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;

	// 깊은복제 실습. 참조 타입 필드(깊은복제 대상)
	public int[] scores;
	public Car car;

	public Member2(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	// clone 메소드 재정의
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member2 cloned = (Member2) super.clone();
		// scores를 깊은 복제한다.
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		// 깊은 복제가 된 Member 객체를 리턴
		return cloned;
	}

	public Member2(String id) {
		this.id = id;
	}

	public Member2 getMember2() {
		Member2 cloned = null;
		try {
			cloned = (Member2) clone();
		} catch (CloneNotSupportedException e) {
		}
		return cloned;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member2) {
			Member2 member = (Member2) obj;
			if (id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
