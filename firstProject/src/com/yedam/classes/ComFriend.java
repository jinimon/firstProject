package com.yedam.classes;

public class ComFriend extends Friend {
	// 필드
	private String comName;

	// 기본 생성자
	public ComFriend() {
		super();
	}

	public String getComName() {
		return comName;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}

	@Override
	public String toString() {
		return "회사친구 이름 : " + super.getName() + ", 연락처 : " + super.getPnum() + ", 회사 이름 : " + this.getComName();
	}
}
