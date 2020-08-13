package com.yedam.exam;

public class Exercise04 {
	public static void main(String[] args) {
		int one;
		int two;

		boolean run = true;
		while (run) {
			one = (int) (Math.random() * 5 + 1);
			two = (int) (Math.random() * 5 + 1);
			System.out.println("> (" + one + ", " + two + ")");
			if (one + two == 5) {
				System.out.println("주사위의 합이 5입니다.");
				run = false;
			}
		}
	}
}
