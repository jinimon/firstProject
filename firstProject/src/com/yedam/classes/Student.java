package com.yedam.classes;

public class Student {
	// private : 클라스 내에서만 사용 가능. 외부 접근 차단

	// 필드(속성)
	private int hakbun;
	String name;
	String major;

	// 생성자(초기값)
	public Student() {

	}

	public Student(int hakbun) {
		this.hakbun = hakbun;
	}

	public Student(int hakbun, String name) {
		this.hakbun = hakbun;
		this.name = name;
	}

	public Student(int hakbun, String name, String major) {
		this.hakbun = hakbun;
		this.name = name;
		this.major = major;
	}

	// method(기능, 동작)
	public int getHakbun() {
		return hakbun;
	}

	public String getName() {
		return name;
	}

	public String getMajor() {
		return major;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "학번은 " + hakbun + ", 이름은 " + name + ", 전공은 " + major;
	}
}
