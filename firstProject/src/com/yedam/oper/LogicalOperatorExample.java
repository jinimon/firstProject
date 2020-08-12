package com.yedam.oper;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		// 논리 연산자
		int charCode = 'A'; // A = 65
		if (charCode >= 65 & charCode <= 90) {
			System.out.println("대문자입니다.");
		}

		int num1 = 10;
		int num2 = 20;
		if (num1++ < 10 && num2++ > 20) {
			System.out.println("참입니다.");
		}
		System.out.println(num1 + ", " + num2);

		// 비트 논리 연산자
		int a = 10, b = 11;
		int result = a & b;
		System.out.println("논리곱 결과 : " + result);

		result = a | b;
		System.out.println("논리합 결과 : " + result);

		// 비트 이동 연산자
		// int : 32bit
		result = a << 2;
		System.out.println("이동 : " + result);
		result = 30 << 3;
		System.out.println("이동2 : " + result);

		result += 30; // 복합 대입 연산자

		// 삼항 연산자
		result = 80;
		boolean pass = false;
		if (result >= 80) {
			pass = true;
		} else {
			pass = false;
		}

		pass = (result <= 80) ? true : false;
	}
}