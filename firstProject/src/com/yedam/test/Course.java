package com.yedam.test;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String cname;
	private int cmax;
	List<Student> sList = new ArrayList<>(); // 학생들 저장

	public Course(String cname, int cmax) {
		super();
		this.cname = cname;
		this.cmax = cmax;
	}

	// 학생등록
	public void add(Student s) {
		sList.add(s);
	}

	public void stuList() {
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public int getCmax() {
		return cmax;
	}

	public void setCmax(int cmax) {
		this.cmax = cmax;
	}

	public List<Student> getsList() {
		return sList;
	}

	public void setsList(List<Student> sList) {
		this.sList = sList;
	}
}
