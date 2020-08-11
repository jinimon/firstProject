package com.yedam.dev;

public class OperatorExample {
	public static void main(String[] args) {
		int val1 = 10;
		int result = (-3) + (8 - 5) * 4 + val1++;

		System.out.println(result);

		// 나머지 계산. 정수일 경우에만
		result = 10 % 7;
		System.out.println("나머지 : " + result);

		// 나누기 계산
		result = 10 / 7;
		System.out.println("나누기 : " + result);

		double r1 = 10 / 7.0;
		System.out.println("나누기2 : " + r1);

		for(int i=1; i<=10; i++) {
			if (i % 2 == 0) {
				System.out.println(i +" 짝수");
			} else {
				System.out.println(i +" 홀수");
			}
		}
	}
}