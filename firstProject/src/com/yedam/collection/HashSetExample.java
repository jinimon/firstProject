package com.yedam.collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {

		System.out.println("test".hashCode());
		System.out.println("test".hashCode());
		System.out.println("test".hashCode());

		// HashSet은 Set 인터페이스를 실행하는 구현 클래스
		Set<Member> set = new HashSet<>();

		// Set 인터페이스는 중복 저장 안된다.
		// 아래는 값은 같지만 인스턴스가 다르니 저장된다(주소값 다름)
		set.add(new Member("이화진", 24));
		set.add(new Member("윤땡땡", 21));
		set.add(new Member("윤땡땡", 20));

		for (Member mem : set) {
			System.out.println(mem.getName() + ", " + mem.getAge());
		}
	}
}
