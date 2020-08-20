package com.yedam.generic;

public class Course<T> { // generic
	private String courseName; // 과정 명
	private T[] students;	// generic type의 배열

	public Course(String courseName, int capacity) {
		this.courseName = courseName;
		// generic type 배열은 우선 Object에 넣어 casting해서 배열에 삽입해야한다.
		this.students = (T[]) new Object[capacity];
	}

	public String getCourseName() {
		return courseName;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T t) {// 학생 한명씩 등록할 때
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}
}
