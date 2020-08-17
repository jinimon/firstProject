package com.yedam.classes.exam;

public class Member {
	String name;
	String id;
	String pwd;
	int age;

	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
