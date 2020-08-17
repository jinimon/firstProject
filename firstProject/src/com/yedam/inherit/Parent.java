package com.yedam.inherit;

public class Parent {
	private String name;
	private int age;

	public Parent() {
	}

	public Parent(String name, int age) {
		super(); // 부모 클래스의 생성자 호출
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override // Object 클래스의 내용을 Parent가 재정의 하겠다는 의미
	public String toString() {
		return super.toString(); // 주소값 출력
//		return "Parent [name=" + name + ", age=" + age + "]";
	}
}
