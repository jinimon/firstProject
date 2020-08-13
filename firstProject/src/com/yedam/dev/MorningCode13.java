package com.yedam.dev;

public class MorningCode13 {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0)
				continue; // 홀수일때 건너뛰고
			System.out.println(i); // 짝수일때 수행
		}
		int n = 0;
		while (true) {
			if (n++ == 5)
				break; // 반복문 빠져나옴
			else if (n == 3)
				continue; // 아래에 구문 실행x -> 다음 조건 수행

			System.out.println("프로그램 진행 중");
		}

		int a = 0;
		int b = 0;
		while (b < 10) {
			while (a < 10) {
				a++; // 증감 없으면 무한반복
			}
			a = 0;
			b++;
		}

		int sum = 0;
		for (int j = 0; j < 5; j++) {
			for (int i = 0; i < 10; i++) {
				sum += i;
				System.out.println(i);
			}
		}

		int score = 90;
		if (score >= 90) {
			if (score >= 95) {
				System.out.println("95 이상입니다.");
			} else {
				System.out.println("90 이상입니다.");
			}
		} else if (score >= 80) {
			System.out.println("80 이상입니다.");
		} else {
			System.out.println("80 미만입니다.");
		}
	}
}
