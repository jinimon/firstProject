package com.yedam.interfaces;

public class MySqlDb implements DataAccessObject {

	@Override
	public void insert() {
		System.out.println("Mysql DB 입력");
	}

	@Override
	public void update() {
		System.out.println("Mysql DB 수정");
	}

	@Override
	public void select() {
		System.out.println("Mysql DB 조회");
	}
}
