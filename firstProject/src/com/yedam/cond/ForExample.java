package com.yedam.cond;

public class ForExample {
	public static void main(String[] args) {
		int sum = 0;
		sum = sum + 1;
		sum = sum + 1;
		sum = sum + 1;
		sum += 1; // sum++
		System.out.println("결과는 " + sum);

		sum = 0;
		for (int i = 3; i > 0; i--) {
			sum = sum + 1;
		}
		sum += 1; // sum++
		System.out.println("최종 결과는 " + sum);

		// 1~10 범위의 수 합계
		sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
		}
		System.out.println("1~10 합 : " + sum);

		// 구구단
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

		// 별
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		System.out.println("-----------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
