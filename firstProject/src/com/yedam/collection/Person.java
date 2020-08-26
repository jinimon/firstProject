package com.yedam.collection;

public class Person implements Comparable<Person> {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Person o) {
		// 나이를 기준으로 정렬
		return this.age - o.age; // 음수(오름차순). 양수(내림차순)
//		return o.age - this.age;	// 내림차순 정렬(양수)
	}
}