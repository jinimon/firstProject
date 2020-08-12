package com.yedam.cond;

public class MethodExample {
	public static void main(String[] args) {
//		int num = 2;
//		for (; num <= 9; num++) {
//			multiTable(num);
//			System.out.println();
//		}

		multiTable(3, 5);
	}

	public static void multiTable(int a, int b) {
		for (int i = a; i <= b; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i + " * " + j + " = " + i * j + "\n");
			}
			System.out.println();
		}
	}

	public static void multiTable(int a) { // 메소드
		int num1 = a;
		for (int i = 1; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
		}
	}

	public static void multiTable() { // 메소드
		int num1 = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(num1 + " * " + i + " = " + (num1 * i));
		}
	}
}
