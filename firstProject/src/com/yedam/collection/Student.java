package com.yedam.collection;

public class Student {
	private String name;
	private int mathScore;
	private int engScore;

	public Student() {

	}

	public Student(String name, int mathScore, int engScore) {
		super();
		this.name = name;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	public String getName() {
		return name;
	}

	public int getMathScore() {
		return mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

}
