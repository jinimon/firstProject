package com.yedam.test;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class Course {
	private String cname;
	private int cmax;

	List<Student> sList = new ArrayList<>(); // 학생들 저장
	TreeMap<String, Integer> scores = new TreeMap<>(); // 과정별 수강인원 체크

	public Course(String cname, int cmax) {
		super();
		this.cname = cname;
		this.cmax = cmax;
	}

	// 학생등록
	public void add(Student s) {
		sList.add(s);
	}

	public void course(Student s, String str) {
		int num = scores.get(str);
		if (sList.size() < num) {
			sList.add(s);
		} else {
			System.out.println("수강인원 초과! " + num + "명만 등록가능합니다.");
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
