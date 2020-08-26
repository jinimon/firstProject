package com.yedam.collection;

// Student 클래스는 Comparable라는 인터페이스를 구현하기 위한 객체
public class Student implements Comparable<Student> {
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

	@Override
	public int compareTo(Student o) {
		// 3. 여기에 기준을 작성. 우리는 수학 점수를 기준으로 정렬할것이다.
//		return this.mathScore - o.mathScore; // 음수(오름차순)

		// 아래 방법은 수학, 영어 점수의 합 기준을 만족하는 경우를 정렬
		if ((this.mathScore + this.engScore) < (o.mathScore + o.engScore))
			return -1;
		else
			return 1;
	}

}
