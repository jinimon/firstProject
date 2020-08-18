package com.yedam.classes;

public class UnivFriend extends Friend {
	private String major;

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "회사친구 이름 : " + super.getName() + ", 연락처 : " + super.getPnum() + ", 전공명 : " + this.getMajor();
	}
}
