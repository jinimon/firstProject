package com.yedam.test;

class Something {
	String field1;
	int field2;
	int[] filed3;
	Student2 student;

	Something(String field1, int field2, int[] filed3) {
		this.field1 = field1;
		this.field2 = field2;
		this.filed3 = filed3;
	}

	public void setStudent2(Student2 student) {
		this.student = student;
	}

	public Student2 getStudent2() {
		return this.student;
	}
}

class Student2 {
	String studentName = "initValue";
	int studentAge = 10;
	int studentScore = 10;
}

class Math2 {
	public static double min(double a, double b) {
		double result = (a < b) ? a : b;
		return result;
	}

	public static int min(int a, int b) {
		int result = (a < b) ? a : b;
		return result;
	}

	public static int max(int a, int b) {
		int result = (a >= b) ? a : b;
		return result;
	}
}

class Member {
	String name;
	int score;
}

class Calculator {
	public static int sum(Member[] ary) {
		int sum = 0;
		for (Member mem : ary) {
			sum += mem.score;
		}
		return sum;
	}

	public static int sum(int[] ary) {
		int sum = 0;
		for (int i : ary) {
			sum += i;
		}
		return sum;
	}
}

public class NewExample {
	public static void main(String[] args) {
		int numA = 10;
		String str = "10";
		float f1 = 10.8f;

		Something something = new Something("hello", 10, new int[] { 1, 2, 3, 4, });
		System.out.println(something.field1);
		System.out.println(something.field2);
		for (int i = 0; i < something.filed3.length; i++) {
			System.out.println(something.filed3[i]);
		}
		Student2 st1 = new Student2();
		something.setStudent2(new Student2());

		System.out.println("-------------------");

		double result = Math2.max(10, 5);
		System.out.println("큰 수는 : " + result);
		result = Math2.min(39, 25);
		System.out.println("작은 수는 : " + result);
		result = Math2.min(24.6, 3.8);
		System.out.println("작은 수는 : " + result);

		System.out.println("-------------------");

		int[] ary = { 1, 2, 3, 4 };
		System.out.println(Calculator.sum(ary));
		Member m1 = new Member();
		Member m2 = new Member();
		Member m3 = new Member();

		Member[] mAry = { m1, m2, m3 };
		Calculator.sum(mAry);
	}
}
