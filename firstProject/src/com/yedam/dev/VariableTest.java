package com.yedam.dev;

public class VariableTest {
	public static void main(String[] args) {
//		int b = 1;
//		for (int i=2; i<11; i++) {
//			b += i;	// b = b + i
//		}
//		System.out.println("result : " + b);

		int b = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			b++;
			sum += b;
			System.out.println("sum : " + sum + ", b : " + b);
		}
		System.out.println("합계 : " + sum);
	}
}