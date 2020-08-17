package com.yedam.classes;

public class Friend {
	// 필드
	private String name;
	private int age;
	private String pnum;	// 010-1111-1111
	
	// 생성자
	public Friend(String name, int age, String pnum) {
		this.name = name;
		this.age = age;
		this.pnum = pnum;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPnum() {
		return pnum;
	}

	public void setName(String name) {
		this.name = name;
	}
}
