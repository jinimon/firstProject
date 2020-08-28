package com.yedam.test;

public class Person {
	String name;
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return this.age;
//		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Person p = (Person) obj; // Object에는 name이 없으니까 p가 가지고 있는 name 필드랑 비교.
//		return true;
		return this.name.equals(p.name);
//		return super.equals(obj);
	}
}
