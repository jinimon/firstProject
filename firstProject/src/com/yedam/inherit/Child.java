package com.yedam.inherit;

public class Child extends Parent {
	private int grade;

	public Child(String name, int age) { // 생성자. Parent의 생성자 매개값이 2개라서
		super(name, age);
	}

	public Child(String name, int age, int grade) {
		super(name, age);
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
