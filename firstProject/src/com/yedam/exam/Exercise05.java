package com.yedam.exam;

public class Exercise05 {
	public static void main(String[] args) {
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				if (4 * i + 5 * j == 60) {
					System.out.println("(" + i + ", " + j + ")");
				}
			}
		}
	}
}
