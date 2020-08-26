package com.yedam.test;

public class Student {
	private String sname;
	private int sage;
	private int score;

	public Student(String sname, int sage, int score) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.score = score;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "학생이름 : " + sname + ", 학생 나이 : " + sage + ", score=" + score;
	}

}
